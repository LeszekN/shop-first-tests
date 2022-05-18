import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class CartTest extends TestBase {

    @Test
    void shouldAddItemToCartAndRemove() {

        driver.findElement(By.linkText("T-SHIRTS")).click();
        driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
        driver.findElement(By.id("add_to_cart")).click();
        Assertions.assertTrue(driver.getPageSource().contains("Product successfully added to your shopping cart"));
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
        driver.findElement(By.className("cart_quantity_delete")).click();
        Assertions.assertTrue(driver.getPageSource().contains("Your shopping cart is empty."));
    }

}

