# Projeto de Gerenciamento de Dados de Funcionários

Este projeto é uma API RESTful para gerenciar informações de funcionários da MGS (Max Global Sports).

## Instruções para Configuração e Execução

### Requisitos
- Java 11 ou superior
- Maven 3.x
- IDE de sua preferência (IntelliJ, Eclipse, etc.)

### Configuração
1. Clone o repositório: `git clone https://github.com/seu-usuario/seu-projeto.git`
2. Navegue até o diretório do projeto: `cd seu-projeto`
3. Configure as variáveis de ambiente ou propriedades do banco de dados, se necessário.
4. Importe o projeto na sua IDE como um projeto Maven existente.

## Configuração banco de dados
1. Criar um banco de dados para que a Api tenha aonde acessar
2. Inserir o comando Sql abaixo para criar a tabela

--Criação da tabela de funcionários

  CREATE TABLE dados (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    alergias VARCHAR(255),
    problemas_medicos VARCHAR(255),
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL
  );

-- Exemplo de inserção de dados
INSERT INTO dados (nome, alergias, problemasMedicos, telefone, email)
VALUES
    ('Fulano de Tal', 'Pólen', 'Nenhum', '(11) 99999-9999', 'fulano@example.com'),
    ('Ciclano da Silva', NULL, 'Pressão alta', '(21) 98888-8888', 'ciclano@example.com');

## Funcionalidades

- Listar todos os funcionários
- Buscar um funcionário por ID
- Inserir um novo funcionário
- Atualizar dados de um funcionário existente
- Excluir um funcionário pelo ID

## Tecnologias Utilizadas

- Spring Boot
- Spring Data JPA
- Hibernate
- Postgresql

## Estrutura de Diretórios

- `src/main/java/com/funcionariosdata/projet/controller`: Controladores REST
- `src/main/java/com/funcionariosdata/projet/model`: Modelos de dados (entidades)
- `src/main/java/com/funcionariosdata/projet/service`: Lógica de negócios (serviços)
- `src/main/java/com/funcionariosdata/projet/repository`: Repositórios de dados (interfaces JPA)
