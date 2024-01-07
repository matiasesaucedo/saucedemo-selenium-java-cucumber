package stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.ProductsPage;

public class LoginTest {

    @Given("^the user introduces a valid username and password$")
    public void the_user_introduces_a_valid_username_and_password() {
        LoginPage.clickOnUsername();
        LoginPage.entersTheUsername();
        LoginPage.clickOnPassword();
        LoginPage.entersThePassword();
    }

    @When("^the user clicks on the login button$")
    public void the_user_clicks_on_the_login_button() {
        LoginPage.clickOnLoginBtn();
    }

    @Then("^the user enters to the product page$")
    public void the_user_enters_to_the_product_page() {
        Assert.assertEquals(ProductsPage.expectedProductTitlePage, ProductsPage.actualProductTitlePage);
        System.out.println("The login test was successfully");
    }

}
