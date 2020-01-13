import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Keyboard_Mouse_Operations {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.navigate().to("https://fundoopush-dev.bridgelabz.com/login");
        Thread.sleep(5000);
        Robot robot = new Robot();
        robot.mouseMove(300,500);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_ALT);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_W);
        Thread.sleep(2000);
        chromeDriver.close();
        chromeDriver.quit();
    }
}
