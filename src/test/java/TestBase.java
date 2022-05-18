import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestBase {
    static WebDriver driver;

    @BeforeAll
    static void startUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @AfterAll
    static void closeDown() {
        driver.close();
    }
}