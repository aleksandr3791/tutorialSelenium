package actionsOnElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckboxAndRadiobutton {

    @Test
    public void performAction() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        driver.findElement(By.cssSelector("[type = 'checkbox']")).click();
        driver.findElement(By.cssSelector("[value = 'female']")).click();


    }
}
