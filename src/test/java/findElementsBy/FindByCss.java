package findElementsBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindByCss {

    @Test
    public void findElement() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        By cssId = By.cssSelector("#clickOnMe");                            //szukanie po ID
        driver.findElement(cssId);

        By cssClass = By.cssSelector(".topSecret");                         // szukanie po klasie
        driver.findElement(cssClass);

        By cssTag = By.cssSelector("input");                                //szuaknie po typie pola
        driver.findElement(cssTag).sendKeys("Pierwszy");

        By cssName = By.cssSelector("[name = 'fname']");                    //szukanie po atrybucie name
        driver.findElement(cssName);

        By cssClass2 = By.cssSelector("[class = 'topSecret']");              //szukanie po klsie vol 2
        driver.findElement(cssClass2);


        //z lekcji drugiej tab Console na narz dev

        By all = By.cssSelector("*");                                       //wszytskie tagi na stronie
        driver.findElement(all);

        By ulInDiv = By.cssSelector("div ul");                          //wsyztskie listy na stronie
        driver.findElement(ulInDiv);

        By trInTable = By.cssSelector("table tr");                          //wiersze tabeli
        driver.findElement(trInTable);

        By trInBody = By.cssSelector("tbody tr");                           //wiersze rowniez w body nie tylko rodzice
        driver.findElement(trInBody);

        By firstChildUlInDiv = By.cssSelector("div > ul");
        driver.findElement(firstChildUlInDiv);

        By firstChildTrInTbody = By.cssSelector("tbody > tr");
        driver.findElement(firstChildTrInTbody);

        By firstFormAfterLabel = By.cssSelector("label + form");        //pierwszy tag form po  tagu label
        driver.findElement(firstFormAfterLabel);

        By allFormAfterLabel = By.cssSelector("label ~ form");
        driver.findElement(allFormAfterLabel);

        //z lekcji trzeciej tab Console na narz dev -> wiekszosc w pliku weryfikacjaSelektorowWPrzegladarce

        By attrTag = By.cssSelector("input[name*='ame']");
        driver.findElement(attrTag);


       //lekcja IV - dzieci wiekszosc w pliku weryfikacjaSelektorowWPrzegladarce

        By secondChild = By.cssSelector("li:nth-child(2)");
        driver.findElement(secondChild);












    }
}
