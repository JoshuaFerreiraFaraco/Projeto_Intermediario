# Back-End
Readme dedicado a Avaliação 02 - Projeto Intermediário dada pelo professor Ramon.

* Funcionamento do sistema.

Primeiramente para iniciar o sistema voce deve seguir a ordem das rotas a seguir, por alguma
razao a API de gestao da tabela Fipe funciona dessa forma.

* Rotas:

1 - /getMarca

Ele ira demonstrar todas as marcas de carros existentes, demonstrando tambem o seu codigo de marca.

Resposta: {"code":"1","name":"Acura"}

2 - /getCarro/{marcaResp}

Nesse GET sera necessario enviar o codigo da Marca o qual voce esta pesquisando os carros.

Por exemplo /getCarro/25 - Honda, ele ira retornar todos os carros existentes daquela marca.

Resposta: {"code":"1241","name":"Accord Coupe EX"}

3 - /getAno/{carroResp}

Nesse GET sera necessario enviar o codigo do carro o qual voce esta pesquisando os anos e gasolinas.

Por exemplo getAno/4976 - CITY Sedan LX 1.5 Flex 16V 4p Mec., ele ira retornar os anos existentes
daquele veiculo.

Resposta: {"code":"2013-1","name":"2013 Gasolina"}

4 - /getFipe/{anoResp}

Nesse GET sera necessario enviar o ano do carro o qual voce esta requerindo a tabela Fipe.

Por exemplo getFipe/2013-1, ele ira retornar toda a informacao sobre o veiculo por meio da tabela Fipe.

Resposta: {"vehicleType":1,"price":"R$ 47.030,00","brand":"Honda","model":"CITY Sedan LX 1.5 Flex 16V 4p Mec.","modelYear":2013,"fuel":"Gasolina","codeFipe":"014058-9","referenceMonth":"outubro de 2024","fuelAcronym":"G"}

5 - /sobre

Sendo o mesmo apenas um GET para as informacoes requisitadas.

Resposta: {"projeto":"Verificador de Carros por meio da Tabela FIPE","nome":"Joshua Ferreira Faraco"}

6 - /postFipe

Este seria o POST realizado para a API para retornar os valores adequados e processar as informacoes.
Porem, infelizmente esta API nao tem um metodo POST, o funcionamento deste processo é demonstrado por meio da mensagem "Method Not Allowed".

Seu funcionamento seria da seguinte forma:

http://localhost:8080/postFipe?vehicleType=cars&brandId=25&modelId=4976&yearId=2013-1

Resposta: {"vehicleType":1,"price":"R$ 47.030,00","brand":"Honda","model":"CITY Sedan LX 1.5 Flex 16V 4p Mec.","modelYear":2013,"fuel":"Gasolina","codeFipe":"014058-9","referenceMonth":"outubro de 2024","fuelAcronym":"G"}

--------------------------------------------------------------------------------------------------

Lembrando que é necessário seguir está ordem para o funcionamento do sistema.