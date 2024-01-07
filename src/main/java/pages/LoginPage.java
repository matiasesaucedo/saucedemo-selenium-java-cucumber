package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {

    public static By usernameInput = By.id("user-name");
    private static By passwordInput = By.id("password");
    private static By loginBtn = By.id("login-button");

    public static void clickOnUsername() {
        driver.findElement(usernameInput).click();
    }

    public static void entersTheUsername() {
        driver.findElement(usernameInput).sendKeys("standard_user");
    }

    public static void clickOnPassword() {
        driver.findElement(passwordInput).click();
    }

    public static void entersThePassword() {
        driver.findElement(passwordInput).sendKeys("secret_sauce");
    }

    public static void clickOnLoginBtn() {
        driver.findElement(loginBtn).click();
    }

}
