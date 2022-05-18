package actionsOnElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InsertValueToField {

    @Test
    public void performAction() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        driver.findElement(By.id("fname")).sendKeys("Aleksandra");

        //usuwanie wartosci z prepopulowanych pól + używamy tego pola dwukrotnie, więc warto go przypisac do zmiennej


       WebElement usernameField = driver.findElement(By.name("username"));
       usernameField.clear();
       usernameField.sendKeys("admin");


    }
}
