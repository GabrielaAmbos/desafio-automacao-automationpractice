package pageObjects;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }
    HomePage homePage = new HomePage();

    public void keysEmail(String mail) {
        email.sendKeys(mail);
    }

    public void keysPassword(String passwd) {
        password.sendKeys(passwd);
    }

    public void clickBtnSubmit() {
        clickSubmit.click();
    }

    public void logarNoSistema(String email, String senha) {
        homePage.clickBtnLogin();
        keysEmail(email);
        keysPassword(senha);
        clickBtnSubmit();
    }
}
