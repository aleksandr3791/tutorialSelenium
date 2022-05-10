package findElementsBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindByName {

        @Test
        public void findElements(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

            //pierwszy zapis
         //   By firstName = By.name("fname");
         //   WebElement firstNameInput = driver.findElement(firstName);

            //drugi zapis
            driver.findElement(By.name("fname"));


        }
    }

