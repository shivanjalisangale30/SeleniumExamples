import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.io.IOException;
import java.util.Date;

public class CaptureScreenshot_ActiTIMEPage {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");
        Date date = new Date();
        String date1 = date.toString();
        String date2 = date.toString().replaceAll(":", "-");
        System.out.println("Date:"+date1);
        System.out.println("Replacement"+date2);
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://fundoopush-dev.bridgelabz.com/login");
        TakesScreenshot chromeDriver1 = (TakesScreenshot) chromeDriver;
        File srcFile = chromeDriver1.getScreenshotAs(OutputType.FILE);
        File desFile = new File("/home/admin1/Desktop/Selenium/ScreenShots/"+date2+"LoginScreenshot.jpg");
        FileUtils.copyFile(srcFile,desFile);
        chromeDriver.close();
    }
}
