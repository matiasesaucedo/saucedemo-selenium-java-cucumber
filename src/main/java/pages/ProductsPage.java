package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class ProductsPage extends BrowserDriver {

    public static String expectedProductTitlePage = "Products";
    public static String actualProductTitlePage = driver.findElement(By.xpath("//*[@id='inventory_filter_container']/div")).getText();

}
