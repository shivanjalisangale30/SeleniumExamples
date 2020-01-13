import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://fundoopush-dev.bridgelabz.com/login");
        chromeDriver.navigate().to("https://www.gmail.com");
        Thread.sleep(1000);
        chromeDriver.navigate().forward();
        Thread.sleep(1000);
        chromeDriver.navigate().back();
        Thread.sleep(1000);
        chromeDriver.navigate().refresh();
        chromeDriver.close();

    }
}
