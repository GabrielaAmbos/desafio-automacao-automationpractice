[![Typing SVG](https://readme-typing-svg.demolab.com?font=Fira+Code&size=18&pause=1000&color=DF62F7&width=435&lines=Projeto+de+Automa%C3%A7%C3%A3o+Automation+Practice)](https://git.io/typing-svg)

Projeto de automação no site http://automationpractice.com/ utilizando a linguagem Java e o framework de automação Selenium WebDriver, explorando a funcionalidade 'Comprar um produto'.

### Feature testada:

**Funcionalidade:** Comprar um produto <br>
  _Como um cliente cadastrado no automationpractice.com_
  _Eu quero fazer a comprar de ao menos dois produtos_
  _Para que eu possa me vestir melhor_

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






