</head>
<body>
<h1>📘 README - Sistema de Cadastro de Músicas</h1>
<p><strong>Autor:</strong> Lucas Serrato Bonito</p>
<p><strong>Curso:</strong> Análise e Desenvolvimento de Sistemas - Senac Santo Amaro</p>
<p><strong>Disciplina:</strong> Desenvolvimento de Software para Web (DSW) - 2025/1</p>

<h2>🎯 Objetivo do Projeto</h2>
<p>Este sistema web tem como finalidade demonstrar, na prática, o desenvolvimento completo de uma aplicação web moderna utilizando a stack Java com Spring Boot. O sistema permite <strong>cadastrar, listar, editar e excluir músicas</strong> com integração a um banco de dados relacional, validando as informações obrigatórias e exibindo feedback ao usuário.</p>

<h2>🛠️ Tecnologias utilizadas e suas funções</h2>
<ul>
  Java 21:</strong> Linguagem orientada a objetos robusta, utilizada para implementar toda a lógica de backend. A versão 21 traz melhorias de performance e segurança, sendo a mais atual recomendada pelo Spring Boot 3.

  Spring Boot 3.4.6:</strong> Framework que simplifica o desenvolvimento de aplicações Java. Ele permite criar aplicações web com mínimo de configuração e embutindo um servidor (Tomcat), facilitando o desenvolvimento e a execução.

Spring Web:</strong> Módulo do Spring responsável por lidar com requisições HTTP (GET, POST, PUT, DELETE). É ele que transforma métodos Java em endpoints REST que podem ser acessados pelo frontend.

   Spring Data JPA:</strong> Abstrai o uso do banco de dados e permite acessar, salvar e atualizar informações com apenas uma interface (Repository), sem escrever SQL manual. Ele usa o padrão ORM (Mapeamento Objeto-Relacional) com a biblioteca Hibernate.

 Jakarta Bean Validation:</strong> Realiza a validação de campos obrigatórios automaticamente no backend usando anotações como <code>@NotBlank</code> e <code>@Min</code>. Isso garante que apenas dados válidos sejam aceitos pela API.

H2 Database:</strong> Banco de dados relacional leve e embutido. Foi configurado para persistir os dados em arquivo (e não apenas em memória), garantindo que músicas cadastradas permaneçam salvas mesmo após reiniciar o sistema.

HTML5 + CSS3:</strong> Utilizados na construção do frontend com estrutura semântica, responsiva e estilizada. Foram usados estilos visuais modernos e modais personalizados sem depender de bibliotecas externas.

JavaScript (Fetch API):</strong> Permite a comunicação entre o frontend e o backend de forma assíncrona e leve, sem recarregar a página. Foi usado para consumir as APIs REST do Spring e manipular dinamicamente os dados.
</ul>

<h2>📄 Explicação dos principais arquivos</h2>

<h3>📁 Backend (Java + Spring Boot)</h3>
<ul>
    <li><code>Musica.java</code> – Classe de entidade (modelo). Define os campos da música, com validações e geração automática da data de cadastro.</li>
    <li><code>MusicaRepository.java</code> – Interface de persistência que herda de <code>JpaRepository</code>. Fornece métodos como <code>findAll()</code>, <code>save()</code> e <code>deleteById()</code> sem código adicional.</li>
    <li><code>MusicaController.java</code> – Controlador REST. Define os endpoints que o frontend consome: <code>/api/musicas</code> para listar, cadastrar, editar e excluir músicas.</li>
    <li><code>application.properties</code> – Arquivo de configuração. Define porta da aplicação, ativação do console do H2, persistência em arquivo e outras propriedades essenciais do Spring Boot.</li>
</ul>

<h3>📁 Frontend (pasta <code>/static</code>)</h3>
<ul>
    <li><code>index.html</code> – Tela inicial com dados do aluno, links para as funcionalidades e o arquivo README.</li>
    <li><code>musicas.html</code> – Tela principal de listagem. Exibe a tabela de músicas, botões de ação (editar/excluir), player do YouTube e modal de confirmação para exclusão.</li>
    <li><code>novo.html</code> – Formulário de inclusão com validações nos campos e envio dos dados via Fetch API.</li>
    <li><code>editar.html</code> – Formulário semelhante ao de inclusão, mas preenchido com os dados da música selecionada. Permite edição via PUT.</li>
    <li><code>readme.html</code> – Esta página, com explicações detalhadas sobre o projeto, tecnologias, arquivos e execução.</li>
</ul>

<h2>✅ Funcionalidades implementadas</h2>
<ul>
    <li>Cadastro de novas músicas com título, artista, ano e link do YouTube</li>
    <li>Validação obrigatória de campos com mensagens de erro amigáveis</li>
    <li>Listagem de músicas com player do YouTube embutido</li>
    <li>Edição com preenchimento automático dos campos</li>
    <li>Exclusão com confirmação via modal estilizado</li>
    <li>Integração via API REST usando JavaScript (Fetch)</li>
</ul>

<h2>📌 Requisitos atendidos</h2>
<ul>
    <li>✔️ Todas as funcionalidades obrigatórias estão implementadas</li>
    <li>✔️ Aplicação RESTful com backend Spring e frontend JS puro</li>
    <li>✔️ Validações feitas no lado do servidor</li>
    <li>✔️ Persistência de dados usando H2 em modo arquivo</li>
    <li>✔️ Arquivo <code>index.html</code> com nome e observações</li>
    <li>✔️ Navegação feita apenas por links/botões (sem digitar URL)</li>
</ul>

<h2>🚀 Como executar o projeto</h2>
<ol>
    <li>Abrir o projeto no IntelliJ ou Eclipse</li>
    <li>Executar a classe <code>MusicasApplication.java</code></li>
    <li>Acessar no navegador: <code>http://localhost:8080/index.html</code></li>
    <li>Utilizar os links da aplicação para navegar</li>
</ol>

<a href="index.html" class="btn-voltar">← Voltar para a tela inicial</a>
</body>
</html>
