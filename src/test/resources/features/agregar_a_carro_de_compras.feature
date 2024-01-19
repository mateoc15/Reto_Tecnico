#language: en

Feature: Agregar productos a carro de compras
  Scenario: Agregar dos productos a carro de compra
    Given que el usuario ingresa al sitio web de Amazon
    When el usuario busca productos de tecnología
    And Agrega los dos primeros productos al carrito
    And voy al carrito de compras
    Then deberia visualizar los dos productos agregados al carrito de compras

