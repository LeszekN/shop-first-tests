import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LoginTests extends TestBase {

    @Test
    void shouldLoginProperly() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        driver.findElement(By.id("email")).sendKeys("test@softie.pl");
        driver.findElement(By.id("passwd")).sendKeys("1qaz!QAZ");
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
        Assertions.assertTrue(driver.getCurrentUrl().contains("controller=my-account"));
    }

    @Test
    void shouldNotLoginWithoutLoginValue() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        driver.findElement(By.id("email")).sendKeys("");
        driver.findElement(By.id("passwd")).sendKeys("1qaz!QAZ");
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
        Assertions.assertEquals("An email address required.", driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText());
    }

    @Test
    void shouldNotLoginWithoutPassword() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        driver.findElement(By.id("email")).sendKeys("test@softie.pl");
        driver.findElement(By.id("passwd")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
        Assertions.assertEquals("Password is required.", driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText());
    }
}