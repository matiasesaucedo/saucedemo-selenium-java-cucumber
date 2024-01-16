package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "user-name") private WebElement usernameInput;
    @FindBy(id = "password") private WebElement passwordInput;
    @FindBy(id = "login-button") private WebElement loginBtn;
    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void login (String username, String password){
        usernameInput.click();
        usernameInput.click();
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
    }
    public void clickOnLoginBtn(){
        loginBtn.click();
    }

    public void openUrl(String url){
        this.driver.get(url);
    }


}
