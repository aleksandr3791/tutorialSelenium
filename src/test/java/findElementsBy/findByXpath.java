package findElementsBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class findByXpath {

    @Test
    public void findElement (){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        By fullPath = By.xpath("/html/body/div/ul");
        driver.findElement(fullPath);

        By shortPath = By.xpath("//ul");
        driver.findElement(shortPath);

        //id = CLickOnMe
        By buttonId = By.xpath("/html/body/button[@id='clickOnMe']");
        driver.findElement(buttonId);

        //by name
        By firstName = By.xpath("//input[@name = 'fname']");
        WebElement firstNameInput = driver.findElement(firstName);

        //byclassName
        By parahidden = By.xpath("//p[@class = 'topSecret']");
        driver.findElement(parahidden);

        // by input
        By inputLocator = By.xpath("//input");
        driver.findElement(inputLocator).sendKeys("Pierwszy");

        //by linkText

              //wyszuiwanie przez cały tekst linku
        By linkText = By.xpath("//a[text()= 'Visit W3Schools.com!']");
        WebElement schoolLink = driver.findElement(linkText);

              //wyszukiwanie, gdy znamy czesc tekstu linku
        By partialLinkText = By.xpath("//a[contains(text(),'Visit')]");
        WebElement schoolPartial = driver.findElement(partialLinkText);


    }
}
