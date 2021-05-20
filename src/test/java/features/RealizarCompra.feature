#language:pt
Funcionalidade: Comprar um produto
  Como um cliente cadastrado no automationpractice.com
  Eu quero fazer a comprar de ao menos dois produtos
  Para que eu possa me vestir melhor

  Cenario: Realizar a compra de dois produtos
      Dado que eu esteja na página principal
      Quando eu pesquiso pelo item "Blouse"
      Então devo ver o item "Blouse" na tela de resultados de pesquisa
      Quando eu solicito adicionar o item ao carrinho
      Então devo ver a mensagem "Product successfully added to your shopping cart"
      Quando eu solicito continuar comprando
      E eu pesquiso pelo item "Printed Dress"
      Então devo ver o item "Printed Dress" na tela de resultados de pesquisa
      Quando eu solicito adicionar o item ao carrinho
      Então devo ver a mensagem "Product successfully added to your shopping cart"
      Quando eu solicito fazer o check-out
      Então devo ver os itens "Blouse" e "Printed Dress" adicionados ao carrinho

