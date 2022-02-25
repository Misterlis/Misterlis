import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import sun.security.util.Password;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;



public class AutorizationPage extends Main {

    @FindBy(how = How.XPATH, using = "//*[@id='login-form-username']")
    private SelenideElement loginLane;

    @FindBy(how = How.XPATH, using = "//*[@id='login-form-password']")
    private SelenideElement PasswordLane;

    @FindBy(how = How.XPATH, using = "//*[@id='login-form-submit']")
    private SelenideElement buttonLogin;

    @FindBy(how = How.XPATH, using = "//*[@id='login-form-cancel']")
    private SelenideElement buttonCanIn;

    @FindBy(how = How.XPATH, using = "//*[@id='browse_link']")
    private SelenideElement buttonProject;

    @FindBy(how = How.XPATH, using = "//*[@id='admin_main_proj_link_lnk']")
    private SelenideElement buttonProject2;

    public AutorizationPage clicButtonLogin() {
    loginLane.click();
    loginLane.sendKeys(login);
    return page(AutorizationPage.class);
    }
    public AutorizationPage clicButtonPassword() {
        $x("//*[@id='login-form-password']").click();
        $x("//*[@id='login-form-password']").sendKeys(password);
    return page(AutorizationPage.class);
    }
    public AutorizationPage clicButtonIn() {
        buttonLogin.click();
        return page(AutorizationPage.class);
    }
    public AutorizationPage clicProject() {
        buttonProject.click();
        buttonProject2.click();
        return page(AutorizationPage.class);
   }
  }

