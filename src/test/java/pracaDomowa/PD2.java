package pracaDomowa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PD2 {

    @Test
    public void findbyXpath (){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://pl.wikipedia.org/wiki/Nowa_Zelandia");

        driver.findElement(By.xpath("//sup[@id = 'cite_ref-3']/preceding-sibling::a[@title = 'Wellington']"));
        driver.findElement(By.xpath("//div[@class = 'mw-parser-output']/ul[4]//a[@title = 'Wyspa Północna (Nowa Zelandia)']"));
        driver.findElement(By.xpath("//img[@alt = 'Herb Nowej Zelandii']"));
        driver.findElement(By.xpath("//input[@name = 'search']"));

        driver.close();
    }
}
