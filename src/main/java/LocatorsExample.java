import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class LocatorsExample {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.facebook.com");
        WebElement user = chromeDriver.findElement(By.id("email"));
        user.clear();
        user.sendKeys("shivanjali");
        WebElement pass = chromeDriver.findElement(By.name("pass"));
        pass.clear();
        Thread.sleep(2000);
        pass.sendKeys("147859623");
        chromeDriver.findElement(By.id("loginbutton")).click();
        WebElement naviagte = chromeDriver.findElement(By.id("userNavigationLabel"));
        String id = naviagte.getAttribute("id");
        System.out.println(id);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
        System.out.println("Next page"+naviagte);
        Thread.sleep(2000);
    }
}
