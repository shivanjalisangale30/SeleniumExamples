import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public WebDriver chromeDriver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/home/admin1/Desktop/Selenium/Drivers/chromedriver");
        chromeDriver = new ChromeDriver();
    }

    @After
    public void tearDown() throws Exception {
           chromeDriver.close();
    }
}
