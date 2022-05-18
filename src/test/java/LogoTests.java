import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LogoTests extends TestBase {

    @Test
    void shouldFindLogoAtMainPage() {
        WebElement logo = driver.findElement(By.cssSelector("[class=\"logo img-responsive\"]"));
        Assertions.assertTrue(logo.isDisplayed());
    }

    @Test
    void shouldFindLogoAtLoginPage() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        WebElement logo = driver.findElement(By.cssSelector("[class=\"logo img-responsive\"]"));
        Assertions.assertTrue(logo.isDisplayed());
    }

}

