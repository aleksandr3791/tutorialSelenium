import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChangeBrowserSize {

    @Test
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

        Dimension windowSize = new Dimension(200, 200);
        driver.manage().window().setSize(windowSize);

    }
}
