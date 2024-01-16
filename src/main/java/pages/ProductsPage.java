package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ProductsPage extends BasePage {
    @FindBy(xpath = "//*[@id='inventory_filter_container']/div") private WebElement productTitlePage;
    @FindBy(className = "shopping_cart_container") private WebElement shoppingCartBtn;
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button") private WebElement item1;
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button") private WebElement item2;
    public ProductsPage(WebDriver driver){
        super(driver);
    }

    public void productTitlePageIsDisplayed(){
        productTitlePage.isDisplayed();
    }
    public void addProductsToTheShoppingCart(){
        item1.click();
        item2.click();
    }

    public void clickOnShoppingCartBtn(){
        shoppingCartBtn.click();
    }
}
