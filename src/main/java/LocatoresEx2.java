import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class LocatoresEx2 {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","/Drivers/chromedriver");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.facebook.com");
        WebElement user = chromeDriver.findElement(By.id("email"));
        user.clear();
        user.sendKeys("9869191658");
        WebElement pass = chromeDriver.findElement(By.name("pass"));
        pass.clear();
        Thread.sleep(2000);
        pass.sendKeys("123456789");
        chromeDriver.findElement(By.id("loginbutton")).click();
        Thread.sleep(2000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_W);
        Thread.sleep(2000);
        chromeDriver.close();
    }
}
