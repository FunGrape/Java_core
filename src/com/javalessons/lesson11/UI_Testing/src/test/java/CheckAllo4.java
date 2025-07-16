import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckAllo4 {
    WebDriver chrome = new ChromeDriver();

    @BeforeEach

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
        chrome.manage().window().maximize();
    }

    @Test

    public void forBuyers() {
        chrome.get("https://allo.ua");
        WebElement forBuyersButton = chrome.findElement(By.xpath("//a[@class = 'mh-button mh-button--open']"));
        assertTrue(forBuyersButton.isDisplayed(), "Кнопки немає!"); //перевірка наявності кнопки "покупцям"

        forBuyersButton.click();

        WebElement menuContainer = chrome.findElement(By.xpath("//a[@class='mh-button mh-button--open']"));
        WebElement dropdownMenu = menuContainer.findElement(By.xpath("//a[@class='mh-button mh-button--open']/following-sibling::div"));
        assertTrue(dropdownMenu.isDisplayed(), "Меню не відображається."); //перевірка дропдаун меню

        WebElement shipmentAndPayment = chrome.findElement(By.xpath("//a[contains(text(), 'Доставка і оплата')]"));
        assertTrue(shipmentAndPayment.isDisplayed()); //перевірка елементу Доставка та оплата
        shipmentAndPayment.click();

        WebElement shipmentAndPaymentTitle = chrome.findElement(By.xpath("//h2[text() = 'Доставка і оплата']"));
        assertTrue(shipmentAndPaymentTitle.isDisplayed()); //перевірка заголовку

        WebElement howToOrder = chrome.findElement(By.xpath("//h3[text() = 'Як оформити замовлення?']"));
        assertTrue(howToOrder.isDisplayed(), "Немає елементу!");
        String howToOrderText = howToOrder.getText();
        assertTrue(howToOrderText.contains("Як оформити замовлення?"), "Немає елемента!");
    }
}