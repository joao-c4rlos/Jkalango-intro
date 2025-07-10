
## 📋 Jkalango-intro – Interface de Cadastro

Este projeto representa a parte introdutória do sistema **Jkalango**, responsável por interações de cadastro e comunicação com a API principal hospedada em [`api-2.0`](https://github.com/joao-c4rlos/api-2.0).

---

### 🚀 Tecnologias Utilizadas

* Java (lógica e interação)
* Requisições HTTP (via fetch ou axios, dependendo da implementação)
* Interface com API REST

---

### ⚙️ Requisitos

* JDK 17 ou superior
* IntelliJ, VS Code ou similar
* Maven (caso seja um projeto Java puro)
* [Insomnia](https://insomnia.rest/) ou [Postman](https://www.postman.com/) para testar as rotas manualmente

---

### 📁 Estrutura do Projeto

```
Jkalango-intro/
├── src/
│   └── ... (ações de cadastro, controllers, etc.)
├── README.md
├── pom.xml (se for Maven)
└── ...
```

---

### 🔧 Como Executar

1. **Clone o repositório**

```bash
git clone https://github.com/joao-c4rlos/Jkalango-intro.git
cd Jkalango-intro
```

2. **Verifique a URL da API**

Confirme que o código do projeto está apontando para a API correta (geralmente no arquivo de conexão ou chamada HTTP):

```java
String url = "http://localhost:8081/usuario";
```

3. **Compile e execute a aplicação**

Se for um projeto Java com Maven:

```bash
./mvnw compile
./mvnw exec:java
```

---

### 🔌 Testando com a API

A aplicação faz chamadas para a API `api-2.0` que deve estar rodando localmente na porta `8081`.

* Verifique que a API está rodando antes de testar o front.
* Cadastros e dados devem ser persistidos no banco MySQL `kalangoweb`.

---

### 🧪 Testes manuais com Insomnia/Postman

Você também pode testar diretamente a API associada com este front:

```http
POST http://localhost:8081/usuario
Content-Type: application/json

{
  "nome": "Exemplo",
  "email": "exemplo@email.com"
}
```

---

### 👤 Autor

Desenvolvido por [João Carlos](https://github.com/joao-c4rlos), como parte de um projeto de aprendizado em integração backend + frontend + banco de dados.
