<!DOCTYPE html>
<html>
<head>
    <title>Site</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
    
    <h1>Carregar Imagem</h1>
    
    <form action="MenuServlet" method="post" enctype="multipart/form-data">
        <input type="file" name="image" accept="image/*" required />
        <button type="submit">Enviar</button>
    </form>
    
    <script>
        $(document).ready(function() {
            $('form').submit(function(e) {
                if (!$('input[type=file]').val()) {
                    e.preventDefault();
                    alert('Selecione uma imagem antes de enviar.');
                }
            });
        });
    </script>
    
</body>
</html>
