# Projeto de Gerenciamento de Dados de Funcionários

Este projeto é uma API RESTful para gerenciar informações de funcionários da MGS (Max Global Sports).

## Instruções para Configuração e Execução

### Requisitos
- Java 11 ou superior
- Maven 3.x
- IDE de sua preferência (IntelliJ, Eclipse, etc.)
- PostgreSQL(ou outro banco de dados de sua preferência)

### Configuração
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/TrabalhoJavaA.git
2. Navegue até o diretório do projeto
3. Configure as variáveis de ambiente ou propriedades do banco de dados no arquivo `application.properties`:
   spring.datasource.url=jdbc:postgresql://localhost:5432/Funcionarios
   spring.datasource.username=usuario
   spring.datasource.password=senha
   spring.jpa.hibernate.ddl-auto=update
5. Importe o projeto na sua IDE como um projeto Maven existente.

#### Banco de Dados
1. Instale o PostgreSQL (se ainda não estiver instalado).
2. Crie um banco de dados chamado `Funcionarios`:
3. Execute o seguinte comando SQL:
   
     CREATE TABLE dados (
      id SERIAL PRIMARY KEY,
      nome VARCHAR(100) NOT NULL,
      alergias VARCHAR(255),
      problemas_medicos VARCHAR(255),
      telefone VARCHAR(20) NOT NULL,
      email VARCHAR(100) NOT NULL
     );
   
-- Exemplo de inserção de dados
INSERT INTO dados (nome, alergias, problemas_medicos, telefone, email)
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
