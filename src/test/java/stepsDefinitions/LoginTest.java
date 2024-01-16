package stepsDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ProductsPage;

public class LoginTest {

    private LoginPage loginPage;
    private ProductsPage productsPage;

    public LoginTest() {
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.productsPage = new ProductsPage(Hooks.getDriver());
    }

    @Given("^the user introduces an username and password$")
    public void the_user_introduces_a_valid_username_and_password() {
        loginPage.openUrl(Hooks.getProperties().getProperty("url"));
        loginPage.login(Hooks.getProperties().getProperty("username"), Hooks.getProperties().getProperty("password"));
    }

    @When("^the user clicks on the login button$")
    public void the_user_clicks_on_the_login_button() {
        loginPage.clickOnLoginBtn();
    }

    @Then("^the user enters to the product page$")
    public void the_user_enters_to_the_product_page() {
        productsPage.productTitlePageIsDisplayed();
        System.out.println("The login test was successfully");
    }

}
