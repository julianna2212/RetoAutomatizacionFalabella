#Author: julianna2212@gmail.com

Feature: Comprar producto
  Yo como un usuario
  Deseo seleccionar un producto
  para realizar el proceso de compra

  Scenario: Comprar un producto
    Given Juliana ingresa al sitio web
    When Juliana agrega el producto a la bolsa de compra
      |Audifonos sony|
    And Juliana realiza proceso de compra
      |ATLANTICO|BARRANQUILLA|4|CALLE 87 # 22 - 7|201|
    Then Juliana revisa opcion de pago