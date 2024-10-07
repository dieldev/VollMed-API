# Voll Med API 👨‍⚕️🩺

## Descrição

A **Voll Med API** é uma aplicação backend desenvolvida em Java utilizando o framework Spring Boot. Ela foi projetada para gerenciar informações de médicos e pacientes, permitindo o cadastro, listagem e manipulação dos dados por meio de endpoints REST. A API também implementa mecanismos de segurança, paginação e validações automáticas para garantir o bom funcionamento e a proteção dos dados.

## Funcionalidades

### 1. Cadastro de Médicos
- **Endpoint**: `POST /medicos`
- **Descrição**: Permite cadastrar um novo médico no sistema.
- **Validações**: O cadastro utiliza `@Valid` para garantir que os campos obrigatórios sejam preenchidos corretamente.
- **Exemplo de Resposta**: Retorna o médico cadastrado junto com a URI do recurso criado.

### 2. Listagem de Médicos com Paginação
- **Endpoint**: `GET /medicos`
- **Descrição**: Lista todos os médicos ativos no sistema.
- **Paginação**: A listagem é paginada, retornando 10 resultados por página, ordenados pelo nome dos médicos.

### 3. Cadastro de Pacientes
- **Endpoint**: `POST /pacientes`
- **Descrição**: Permite cadastrar novos pacientes no sistema.

### 4. Manipulação de Dados de Médicos e Pacientes
A API oferece métodos completos para a manipulação de médicos e pacientes, incluindo:
- **GET**: Recuperar dados de médicos e pacientes.
- **POST**: Cadastrar novos médicos e pacientes.
- **PUT**: Atualizar informações de médicos e pacientes.
- **DELETE**: Excluir registros de médicos e pacientes.

### 5. Autenticação
- **Descrição**: A API possui um mecanismo de autenticação básico para proteger os endpoints, garantindo que apenas usuários autorizados possam acessar as funcionalidades.

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação utilizada para o desenvolvimento da aplicação.
- **Spring Boot**: Framework para facilitar a criação de APIs robustas.
- **Maven**: Gerenciador de dependências e automação de build.
- **Spring Data JPA**: Usado para interagir com o banco de dados de maneira simples e eficiente.
- **Hibernate**: Implementação do JPA para o mapeamento objeto-relacional.
- **Spring Security**: Utilizado para proteger os endpoints com autenticação.
- **IntelliJ IDEA Ultimate**: IDE utilizada para o desenvolvimento do projeto.
- **Insomnia**: Ferramenta utilizada para testar os endpoints da API.

## Estrutura do Projeto

A estrutura do projeto segue o padrão MVC:
- **controller**: Contém os endpoints da API e lida com as requisições HTTP.
- **domain**: Representa as entidades e classes relacionadas à lógica de negócios.
- **infra**: Inclui configurações relacionadas à infraestrutura da aplicação, como segurança e banco de dados.

## Como Executar o Projeto

### Pré-requisitos:
- JDK 17
- Maven

### Passos para executar:
1. Clone o repositório: `git clone <url-do-repositorio>`
2. Navegue até a pasta do projeto: `cd Voll-Med`
3. Execute o comando: `mvn spring-boot:run`
4. Acesse a aplicação via: `http://localhost:8080`

## Segurança

- A API implementa segurança utilizando o **Spring Security**, protegendo endpoints sensíveis e exigindo autenticação para o acesso.
- Validações automáticas com `@Valid` garantem a integridade dos dados recebidos pela API.

## Documentação da API

Para explorar os endpoints disponíveis, é possível utilizar ferramentas como **Postman** ou **Insomnia** para fazer requisições e testar as funcionalidades da API.
