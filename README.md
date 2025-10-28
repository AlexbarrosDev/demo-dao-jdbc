# Projeto Demo DAO JDBC
![Java](https://img.shields.io/badge/Java-23-blue)
![Status](https://img.shields.io/badge/Status-%20Finalizado-yellow)


## Descrição
Este projeto usa o padrão **DAO** com **JDBC** para acessar e manipular um banco
relacional em Java. O objetivo é **praticar** o conceito de CRUD com JDBC puro para
entender como as tecnologias mais avançadas **(JPA - Hibernate)** trabalham por baixo dos panos.

## Tecnologias utilizadas

- Java 23
- JDBC
- MySQL
- IntelliJ IDEA

## Estrutura do projeto
```text
src/
├── application/
│   ├── Program.java
│   └── Program2.java
├── db/
│   ├── DB.java
│   ├── DbException.java
│   └── DbIntegrityException.java
├── model/
│   ├── dao/
│   │   ├── DepartmentDao.java
│   │   └── SellerDao.java
│   ├── entities/
│   │   ├── Department.java
│   │   └── Seller.java
│   └── dao/impl/
│       ├── DepartmentDaoJDBC.java
│       └── SellerDaoJDBC.java
└── DaoFactory.java
```

## Como executar o projeto
### Requisitos
- Java 23 ou superior instalado
- MySQL (ou outro banco relacional que você estiver usando)
- IntelliJ IDEA (ou outra IDE Java)
- Arquivo `db.properties` configurado com suas credenciais de banco

### Passos
# 1º passo: clonar o repositório
git clone https://github.com/AlexbarrosDev/demo-dao-jdbc.git

# 2º passo:
Editar o arquivo db.properties com as credenciais de banco

# 3º passo:
Executar as classes Program.java e Program2.java

## Testando
Após executar `Program.java`, você deve ver no console algo como:
#### Seller [id=1, name=Alex, email=alex@gmail.com]
#### Department [id=2, name=Vendas]

## Funcionamento

- Program.java: executa operações de teste (findAll, findById, insert, update, delete).
- DB.java: gerencia a conexão e o fechamento do banco de dados.
- DaoFactory.java: fornece instâncias dos DAOs.
- SellerDao e DepartmentDao: interfaces que definem operações CRUD.
- SellerDaoJDBC e DepartmentDaoJDBC: implementações das interfaces usando JDBC.

## Conceitos aplicados

- Implementação do padrão DAO
- Conexão e manipulação com banco via JDBC
- Tratamento de exceções personalizadas
- Organização de código em pacotes
- Escrita e execução de SQL puro

## Autor

**Autor:** Alex Barros   
- Buri - SP  
- Estudante de ADS / Desenvolvedor Back-End Java

## Contato
- GitHub: [AlexbarrosDev](https://github.com/AlexbarrosDev)
- LinkedIn: [Alex Barros](https://www.linkedin.com/in/alex-barros-dev)
- Email: alexbarros.dev@gmail.com

## Licença

Este projeto está licenciado sob a licença MIT.  
Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
