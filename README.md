# XPEDesafioFinal
Desafio final XPE Arquitetura de Software

# Sistema de Vendas - API REST
## Descrição
Este projeto é uma API REST desenvolvida com Java e Spring Boot, seguindo o padrão arquitetural MVC. Ela permite o gerenciamento de clientes, incluindo operações de CRUD (Criar, Ler, Atualizar, Excluir) e busca por nome.
## Estrutura do Projeto

com.xpevendas.api 
  ├── controller 
   └── ClienteController.java 
  ├── model 
   └── Cliente.java 
  ├── repository 
   └── ClienteRepository.java 
  └── service 
    └── DominioService.java


- **Controller**: Camada responsável pelos endpoints da API.
- **Service**: Camada com regras de negócio (lógica da aplicação).
- **Repository**: Interface que lida com a persistência de dados.
- **Model**: Entidade JPA mapeada (`Cliente`).

## 🧪 Tecnologias Utilizadas

- Java **24**
- Spring Boot
- Spring Web
- Spring Data JPA
- **H2 Database** (banco em memória para desenvolvimento e testes)
- Jakarta Validation

## ▶️ Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/toninho101/XPEDesafioFinal.git
   cd XPEDesafioFinal

2. Acesse a API em http://localhost:8080/api/clientes

3. Acesse o console do banco H2 em:
http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: (em branco)


Principais Endpoints
Método	    Endpoint	            Descrição
GET	    /api/clientes	        Lista todos os clientes
GET	    /api/clientes/{id}	  Busca cliente por ID
GET	    /api/clientes/buscar	Busca por nome (query param)
GET	    /api/clientes/contar	Conta total de clientes
POST	  /api/clientes	        Cria um novo cliente
PUT	    /api/clientes/{id}	  Atualiza cliente existente
DELETE	/api/clientes/{id}	  Remove cliente pelo ID

Exemplo de JSON para POST/PUT

{
  "nome": "Maria Silva",
  "email": "maria@exemplo.com"
}


