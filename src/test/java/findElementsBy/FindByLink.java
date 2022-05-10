package findElementsBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindByLink {

    @Test
    public void findElement () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //wyszuiwanie przez cały tekst linku
        By linkText = By.linkText("Visit W3Schools.com!");
        WebElement schoolLink = driver.findElement(linkText);

        //wyszukiwanie, gdy znamy czesc tekstu linku
        By partialLinkText = By.partialLinkText("Visit");
        WebElement schoolPartial = driver.findElement(partialLinkText);

    }
}
