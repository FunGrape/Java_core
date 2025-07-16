import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckAllo3 {
    WebDriver chrome = new ChromeDriver();
    @BeforeEach

    public void setUp() {
        System.setProperty("webdriver.chrome.driver","/opt/homebrew/bin/chromedriver");
        chrome.manage().window().maximize();
    }
    @Test
    public void isGoodComply(){
        chrome.get("https://allo.ua");
        WebElement logo = chrome.findElement(By.xpath("//a[@class = 'v-logo']//img"));
        assertTrue(logo.isDisplayed(), "Немає логотипу!"); //перевірка логотипу

        WebElement search = chrome.findElement(By.id("search-form__input"));
        search.sendKeys("AirPods 3");
        WebElement searchButton = chrome.findElement(By.xpath("//button[@class='search-form__submit-button']"));
        searchButton.click(); //пошук airpods 3

        WebElement goods = chrome.findElement(By.xpath("//a[contains(text(),'AirPods 3')]"));
        String goodsText = goods.getText();
        System.out.println(goodsText);
    }
}
