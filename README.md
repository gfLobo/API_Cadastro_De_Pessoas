# API Cadastro de Pessoas

🧪Este é o endereço da interface de testes [Swagger](http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/). 
Estes também poderão ser feitos diretamente pelo JUnit a partir da rota:

```
/src
    /test
        /java
            /br
                /com
                    /api
                        /cadastro_de_pessoas
                               ClienteTest.java
```


### Tecnologias utilizadas:

- Java

- Spring Boot

- SWAGGER API REST

- Banco de dados H2

- [ViaCep API](https://viacep.com.br)

- JJWT Token


`Obs: Para preencher o endereço, apenas preencha o número do local e o campo CEP com 8 dígitos numéricos válidos.`


## Funcionalidades:

- Criar uma pessoa

- Editar uma pessoa

- Consultar uma pessoa

- Listar pessoas

- Criar endereço para pessoa

- Listar endereços da pessoa

- Informar qual endereço é o principal da pessoa



>### Cliente.java
>+ ID
>+ Nome
>+ Data de nascimento 
>
>>Endereço:
> >+ CEP
> >+ Número
> >+ Complemento
> >+ Bairro
> >+ Localidade
> >+ UF
> >+ DDD
> >+ Principal
