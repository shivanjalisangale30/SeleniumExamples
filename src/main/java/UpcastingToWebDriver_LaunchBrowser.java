import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpcastingToWebDriver_LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com");
        String title = chromeDriver.getTitle();
        System.out.println("Title is "+title);
        String currentUrl = chromeDriver.getCurrentUrl();
        System.out.println("Url is "+currentUrl);
        String pageSource = chromeDriver.getPageSource();
        System.out.println("PageSource"+pageSource);
        Thread.sleep(2000);
        chromeDriver.close();

    }
}
