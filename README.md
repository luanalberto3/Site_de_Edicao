# Site_de_Edicao

Site de Edição de Imagens
Projeto Multidisciplinar

Contribuidores
Henrique Rios (RiqueRioss)

Luan Alberto (luanalberto3)

Aplicação web com função de oferecer funções de edição de imagem e detecção de texto. A aplicação está hospedada nos servidores da AWS e possui um sistema de login com banco de dados, o usuário pode escolher a função desejada, na página de edição, e requerir o resultado.

Sobre
Esse projeto foi feito como atividade curricular para as disciplinas Análise e Projeto de Sistemas e Processamento de Imagens com intuito de mostrar as habilidades em criação de aplicações e conhecimento em manipulação de imagens. Como parte da disciplina Análise e Projeto de Sistemas a aplicação contém:

Lista Requisitos Funcionais e Não Funcionais.
História de Usuários.
Critérios de Aceite.
Cenários de Uso.
Diagrama Físico, Sql e ER.
Diagrama de Casos de Uso.
Diagrama de Componentes e Instalação.
Prototipagem de tela (Feito com Figma).
Regras de Negócio.
Como parte da disciplina Processamento de Imagens:

Função de identicação de texto em imagens, usando o Tesseract e seu banco de dados.
Filtros de alteração de imagem.
Alterar tamanho de imagens.
Aplicar uma marca-d'água em uma imagem.
A linguagem de programação dos servidores é 100% java e o projeto usa o modelo Maven para facilitar o uso de repositórios externos. A IDE usada
Instalação
Essa aplicação é um projeto Maven que usa banco de dados e importa repositórios externos para algumas de suas funções, o Apache Tomcat é a escolha de servidor web. O banco foi feito com myqsl e usa mysqlconnector para acessá-lo. O arquivo pom obtêm as dependências automaticamente. Versão Apache Tomcat: 10.1.12

Configuração do banco de dados: Altere a conexão de banco de dados com a que desejar, nos servlets LoginServlet e RegistrarServlet a conexão está sendo feita com um banco de dados local e sua estrutura está demonstrada como comentário logo abaixo. Caso queira mudar o nome das variáveis, lembre-se de alterar o PreparedStatement com os novos nomes.

Uso
Com o servidor configurado e rodando, você pode efetuar uma autenticação ou acessar o menu diretamente. Dentro do Menu, para efetuar cada operação, o usuário deve primeiramente inserir uma imagem em formato PNG na função desejada e apertar o botão Proceder dessa tal. Algumas funções exigem informações adicionais, caso exija uma outra imagem, selecione outro PNG e caso exija algum valor, insira os desejados dentro dos limites. Clicar em proceder exibirá a imagem inserida com tal alteração aplicada, caso queira usar a mesma novamente, copie e insira no campo novamente.

A função Procurar Texto possui dificuldades com imagens com ruído e que não estão em Grayscale, então antes de tentar usá-la, use os filtros Tons de Cinza e Remover Ruído para maior eficácia.
