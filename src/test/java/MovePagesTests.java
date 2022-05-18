import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MovePagesTests extends TestBase {

    @Test
    void shouldMoveToContactPage() {
        driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
        WebElement contact = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/fieldset/h3"));
        Assertions.assertTrue(contact.isDisplayed());
    }

    @Test
    void shouldMoveFromLogToMainPage() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/a")).click();
        Assertions.assertTrue(driver.getCurrentUrl().contains("index.php"));
    }

    @Test
    void shouldMoveToPriceDropPage() {
        driver.findElement(By.linkText("Specials")).click();
        WebElement pricedrop = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));
        Assertions.assertTrue(pricedrop.isDisplayed());
    }
}
