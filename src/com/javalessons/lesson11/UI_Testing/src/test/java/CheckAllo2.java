import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckAllo2 {
    WebDriver chrome = new ChromeDriver();
    @BeforeEach

    public void setUp() {
        System.setProperty("webdriver.chrome.driver","/opt/homebrew/bin/chromedriver");
        chrome.manage().window().maximize();
    }
    @Test
    public void isGoodCorrect(){
        chrome.get("https://allo.ua");
        WebElement search = chrome.findElement(By.id("search-form__input"));
        assertTrue(search.isDisplayed(),"Немає поля для пошуку!");

        WebElement searchButton = chrome.findElement(By.xpath("//button[@class='search-form__submit-button']"));
        search.sendKeys("Фен");
        searchButton.click();

        WebElement firstProduct = chrome.findElement(By.partialLinkText("Фен"));
        String firstProductText = firstProduct.getText();
        assertTrue(firstProductText.contains("Фен"), "Товар не знайдено!");
    }
}
