package com.example.servlets;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

@WebServlet("/ocr")
@MultipartConfig
public class OCRServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Part filePart = request.getPart("image");

        Path tempDir = Files.createTempDirectory("ocr-temp");
        File imageFile = new File(tempDir.toFile(), "uploaded_image.png");

        try (InputStream inputStream = filePart.getInputStream()) {
            Files.copy(inputStream, imageFile.toPath());
        } catch (IOException e) {
            response.getWriter().write("Erro ao copiar o arquivo: " + e.getMessage());
            return;
        }

        ITesseract instance = new Tesseract();

        try {
            String result = instance.doOCR(imageFile);
            request.setAttribute("ocrResult", result);
            request.getRequestDispatcher("result.jsp").forward(request, response);
        } catch (TesseractException e) {
            e.printStackTrace();
            response.getWriter().write("Erro ao processar imagem: " + e.getMessage());
        } finally {
            Files.deleteIfExists(imageFile.toPath());
        }
    }
}
