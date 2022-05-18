import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ContactMessageTests extends TestBase {

    @Test
    void shouldSendMessageProperly() {
        driver.findElement(By.id("contact-link")).click();
        Select drop = new Select(driver.findElement(By.id("id_contact")));
        drop.selectByVisibleText("Customer service");
        driver.findElement(By.id("email")).sendKeys("test@softie.pl");
        driver.findElement(By.id("message")).sendKeys("I need your support");
        driver.findElement(By.xpath("//*[@id=\"submitMessage\"]/span")).click();
        Assertions.assertTrue(driver.getPageSource().contains("Your message has been successfully sent to our team."));
    }

    @Test
    void shouldNotSentMessageWithoutSubject() {
        driver.findElement(By.id("header_logo")).click();
        driver.findElement(By.id("contact-link")).click();
        driver.findElement(By.id("email")).sendKeys("test@softie.pl");
        driver.findElement(By.id("message")).sendKeys("I need your support");
        driver.findElement(By.xpath("//*[@id=\"submitMessage\"]/span")).click();
        Assertions.assertTrue(driver.getPageSource().contains("Please select a subject from the list provided."));
    }
}


