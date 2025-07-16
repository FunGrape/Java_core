import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckAllo {
    WebDriver chrome = new ChromeDriver();
        @BeforeEach

        public void setUp () {
            System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
            chrome.manage().window().maximize();
        }
        @Test
        public void isLogoDisplayed () {
            chrome.get("https://allo.ua");
            WebElement logo = chrome.findElement(By.xpath("//a[@class = 'v-logo']//img"));
            assertTrue(logo.isDisplayed(), "Логотип не відображається на сторінці");
        }
    }