package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage {

//    private String expectedShoppingCartTitle = "Your Cart";
    private By shoppingCartTitle = By.className("subheader");

    public ShoppingCartPage(WebDriver driver){
        super(driver);
    }

    public boolean shoppingCartTitleIsVisible(){
        return IsDisplayed(shoppingCartTitle);
    }
}
