import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
    @Test
    public void demotest() {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.facebook.com/");
        System.out.println(chromeDriver.getTitle());
        chromeDriver.close();
    }
}
