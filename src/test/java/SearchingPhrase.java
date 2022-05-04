import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchingPhrase {

    @Test
    public void openGooglePageChrome() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        //przechodzimy do okna z plikami cookie
       // driver.switchTo().frame(0);
        //znaezienie przycisku
       // WebElement agreeButton = driver.findElement(By.xpath("//span[contains(text(), 'Zgadzam')]"));

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("L2AGLb")).click();


        // kliknięcie przycisku
        //agreeButton.click();
        //powrót do pierwotnego okna
        driver.switchTo().defaultContent();
        //znajdz pole wyszukiwania
        WebElement searchField = driver.findElement(By.name("q"));
        //wprowadz wartowsc "Selenium"
        searchField.sendKeys("Selenium");
        //zasymuluj nacisniecie przycisku ENter
        searchField.sendKeys(Keys.ENTER);
        //znajdz rezultat
        WebElement result = driver.findElement(By.xpath("//a[contains(@href, 'selenium.dev)]//span'"));

        Assert.assertTrue(result.isDisplayed());



    }
}
