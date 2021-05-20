package hooks;

import io.cucumber.java.*;
import pageObjects.LoginPage;
import utils.Browser;
import utils.providers.BaseUrlProvider;

import static utils.providers.UsuarioProvider.*;

public class Hooks {
    @Before(order = 0)
    public void setUp() {
        Browser.setCurrentBrowser(Browser.Type.CHROME, false);
        Browser.loadApplication(BaseUrlProvider.getBaseUrl());
    }

    @Before(order = 1)
    public void autenticarNoSistema() {
        LoginPage loginPage = new LoginPage();
        loginPage.logarNoSistema(email(), senha());
    }

    @After
    public void tearDown() {
        Browser.quitBrowser();
    }
}
