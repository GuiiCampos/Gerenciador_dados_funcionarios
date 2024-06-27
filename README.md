# Projeto de Gerenciamento de Dados de Funcionários

Este projeto é uma API RESTful para gerenciar informações de funcionários da MGS (Max Global Sports).

## Instruções para Configuração e Execução

### Requisitos
- Java 11 ou superior
- Maven 3.x
- IDE de sua preferência (IntelliJ, Eclipse, etc.)
- PostgreSQL (ou outro banco de dados de sua preferência)

### Configuração

1. Baixe o projeto do GitHub:
   - Acesse a página do repositório no GitHub: [link para o repositório](https://github.com/seu-usuario/TrabalhoJavaA)
   - Clique no botão `Code` e, em seguida, clique em `Download ZIP`.
   - Extraia o conteúdo do arquivo ZIP baixado.

2. Configure as variáveis de ambiente ou propriedades do banco de dados no arquivo `application.properties`:
   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/Funcionarios
   spring.datasource.username=usuario
   spring.datasource.password=senha
   spring.jpa.hibernate.ddl-auto=update
   ```
Nota: Se você estiver utilizando um banco de dados diferente, ajuste as propriedades conforme necessário. Por exemplo, para MySQL:
   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/Funcionarios
   spring.datasource.username=usuario
   spring.datasource.password=senha
   spring.jpa.hibernate.ddl-auto=update
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   ```
