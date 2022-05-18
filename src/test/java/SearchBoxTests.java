import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class SearchBoxTests extends TestBase {


    @Test
    void shouldFindSearchBoxAtMainPage() {
        WebElement search = driver.findElement(By.id("search_query_top"));
        Assertions.assertTrue(search.isDisplayed());
    }

    @Test
    void shouldFindSearchBoxAtLoginPage() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        WebElement search = driver.findElement(By.id("search_query_top"));
        Assertions.assertTrue(search.isDisplayed());
    }

}
