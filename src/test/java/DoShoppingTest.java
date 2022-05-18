import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class DoShoppingTest extends TestBase {

    @Test
    void doShopping() {
        driver.findElement(By.linkText("T-SHIRTS")).click();
        driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
        driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
        driver.findElement(By.id("email")).sendKeys("test@softie.pl");
        driver.findElement(By.id("passwd")).sendKeys("1qaz!QAZ");
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
        driver.findElement(By.id("cgv")).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
        Assertions.assertTrue(driver.getPageSource().contains("Your order on My Store is complete."));
    }

}