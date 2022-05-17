package pracaDomowa;

//otworz jakas strone i polokalizuj sobie rozne elementy

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PD1 {

    @Test
    public void wikiTest () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://pl.wikipedia.org/wiki/Europa");

        driver.findElement(By.cssSelector("#toc > ul > li.toclevel-1.tocsection-1 > a > span.toctext"));

        driver.findElement(By.cssSelector("[title = 'Europe – angielski']"));

        driver.findElement(By.cssSelector("input.vector-search-box-input"));
        driver.findElement(By.name("search"));

        driver.findElement(By.cssSelector("#mw-content-text > div.mw-parser-output > table.wikitable.sortable.jquery-tablesorter > tbody > tr:nth-child(15) > td:nth-child(1) > a"));

        driver.findElement(By.cssSelector("div.mw-references-wrap.mw-references-columns > ol.references > li#cite_note-demo14-1"));







        driver.quit();




    }
}
