# Winery

Cliente Java para consumir serviços SOAP relacionados ao gerenciamento de pedidos e avisos de estoque de vinhos, desenvolvido como parte do exercício de integração de Web Services usando JAX-WS e Maven.

## Integrantes

- Guilherme Doretto Sobreiro - RM: 99674

- Guilherme Fazito Ziolli Sordili - RM: 550539

- Raí Gumieri dos Santos - RM: 98287

- Turma: FIAP - 3ESPF

---

## Descrição

Este projeto implementa um cliente que consome dois serviços SOAP:

- **WineStockService**: Serviço para realizar pedidos de vinhos.
- **WineWarningService**: Serviço para receber avisos relacionados ao estoque.

O cliente utiliza as URLs dos arquivos WSDL para gerar as classes necessárias com o plugin `jaxws-maven-plugin` do Maven e executa chamadas remotas para os serviços.

## Pré-requisitos

- Java JDK 19 instalado e configurado.
- Maven instalado e configurado.
- Serviços WineStockService e WineWarningService rodando localmente nas portas 8085 e 8086, respectivamente.

## Configuração

1. Certifique-se de que os serviços SOAP estão ativos nas URLs:

   - `http://localhost:8085/WineStockService?wsdl`
   - `http://localhost:8086/WineWarningService?wsdl`

2. No arquivo `pom.xml`, configure as URLs dos WSDLs no plugin `jaxws-maven-plugin` para gerar as classes dos clientes automaticamente.

## Como construir

No terminal, dentro do diretório do projeto, execute:

``` 
mvn clean install
```

Isso irá gerar o código cliente a partir dos WSDLs e compilar o projeto.

## Como executar

Após a construção com sucesso, execute a classe principal `ApplicationClient2` para testar as chamadas aos serviços.

Exemplo de saída esperada:

```
Resposta do serviço: Pedido confirmado!
Resposta do serviço de aviso: Estoque insuficiente!
```

## Estrutura do projeto

- `src/main/java/br/com/fiap/winery/ApplicationClient2.java` — Classe principal do cliente.
- Classes geradas pelo plugin `jaxws-maven-plugin` dentro do pacote `br.com.fiap.winery.client`.

## Dependências principais

- `jaxws-rt` 4.0.3 — Runtime JAX-WS para chamadas SOAP.
- Maven Compiler Plugin configurado para Java 19.

## Observações

- Certifique-se que o JDK configurado no Maven seja o mesmo utilizado para compilar e executar o projeto.
- As URLs dos serviços devem estar acessíveis e corretas para que as chamadas funcionem.

---
