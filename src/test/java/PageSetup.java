import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSetup {

    String projectLocation = System.getProperty("user.dir");
    String ultimateQAURL = "https://ultimateqa.com/simple-html-elements-for-automation/";
    WebDriver driver;

    @BeforeEach
    public void setup() {
        // drivers for Chrome 111
        // use chromedriver for Linux or chromedriver.exe for Windows
        System.setProperty("webdriver.chrome.driver", projectLocation + "/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ultimateQAURL);
    }

    @AfterEach
    public void teardown() {
        // driver.close();
    }
}
