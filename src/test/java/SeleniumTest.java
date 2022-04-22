import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

 /*   @Test
    public void openGooglePageChrome() {
        String path = "C:\\Users\\BRITENET\\Desktop\\Automat\\Chromedriver\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @Test
    public void openGooglePageFirefox() {
        String path = "C:\\Users\\BRITENET\\Desktop\\Automat\\Firefox Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", path);
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
    }

    @Test
    public void openGooglePageEdge() {
        WebDriver driver = getDriver("chrome");
        driver.get("https://www.google.com/");

    }   */

    public WebDriver getDriver (String browser) {
        switch (browser) {
            case "chrome":
                String path = "C:\\Users\\BRITENET\\Desktop\\Automat\\Chromedriver\\chromedriver_win32\\chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", path);
                return new ChromeDriver();
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\BRITENET\\Desktop\\Automat\\Firefox Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
                return new FirefoxDriver();
            default:
                throw new InvalidArgumentException("Invalid browser name");
        }

    }

    @Test
    public void getDriverTest() {
        WebDriver driver = getDriver("chrome");
        driver.get("https://www.google.com/");

    }

}
