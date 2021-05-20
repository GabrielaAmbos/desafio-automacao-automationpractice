package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductPage;
import pageObjects.SearchPage;
import utils.Browser;
import utils.providers.BaseUrlProvider;

import java.util.List;
import java.util.Map;

public class RealizarCompraSteps {

    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    @Dado("que eu esteja na página principal")
    public void queEuEstejaNaPaginaPrincipal() {
        homePage.clickLogo();
        Assert.assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(BaseUrlProvider.getBaseUrl() + "index.php"));
    }

    @Quando("eu pesquiso pelo item {string}")
    public void euPesquisoPeloItem(String itemName) {
        homePage.doSearch(itemName);
    }

    @Então("devo ver o item {string} na tela de resultados de pesquisa")
    public void devoVerOItemNaTelaDeResultadosDePesquisa(String itemName) {
        Assert.assertEquals(itemName, searchPage.getTextNameItem());
    }

    @Quando("eu solicito adicionar o item ao carrinho")
    public void euSolicitoAdicionarOItemAoCarrinho() {
        searchPage.clickBtnAddToCart();
        productPage.clickButtonAddToCart();
    }

    @Quando("eu solicito continuar comprando")
    public void euSolicitoContinuarComprando() {
        productPage.clickButtonContinue();
    }

    @Então("devo ver a mensagem {string}")
    public void devoVerAMensagem(String mensagem) {
        Assert.assertEquals(mensagem, productPage.getTextMensageItem());
    }

    @Quando("eu solicito fazer o check-out")
    public void euSolicitoFazerOCheckOut() {
        productPage.clickButtonModalProceedToCheckout();
    }

    @Então("devo ver os itens {string} e {string} adicionados ao carrinho")
    public void devoVerOsItensEAdicionadosAoCarrinho(String item1, String item2) {
        Assert.assertEquals(item1, cartPage.getNameProductCart());
        Assert.assertEquals(item2, cartPage.getNameProductCart());
    }
}
