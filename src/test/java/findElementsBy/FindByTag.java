package findElementsBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FindByTag {

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        By inputLocator = By.tagName("input");
        WebElement input = driver.findElement(inputLocator);   //zwraca pierwszy element na stronie
        input.sendKeys("Wojtuś");

        List<WebElement> inputs = driver.findElements(inputLocator);   //zwraca wszystke inputy na stronie
        System.out.println(inputs.size());


    }
}
