import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoExamples extends BaseClass {
    @Test
    public void independent_Dependent_Xpath_Seleniumsite_javaDownload() throws InterruptedException {
        chromeDriver.navigate().to("http://www.seleniumhq.org/download/");
        Thread.sleep(3000);
        String download_xpath = "//a[text()='Downloads']";
        chromeDriver.findElement(By.xpath(download_xpath)).click();
    }

    @Test
    public void Xpaths_Independent_dependent_actitime_setbydefault() throws InterruptedException {
        chromeDriver.get("https://demo.actitime.com/login.do");
        String username_xpath = "//input[@type='text' and @name='username']";
        chromeDriver.findElement(By.xpath(username_xpath)).sendKeys("admin");
        String pwd_xpath = "//input[@type='password' and @name='pwd']";
        chromeDriver.findElement(By.xpath(pwd_xpath)).sendKeys("manager");
        String login_xpath = "//a[@id='loginButton']";
        chromeDriver.findElement(By.xpath(login_xpath)).click();
        Thread.sleep(4000);
        String setting_xpath = "//div[@class='menu_icon']//parent::div[@class='popup_menu_icon']//parent::div[@class='popup_menu_button popup_menu_button_settings']";
        chromeDriver.findElement(By.xpath(setting_xpath)).click();
        Thread.sleep(4000);
        String types_of_work_xpath = "//a[text()='Types of Work']";
        chromeDriver.findElement(By.xpath(types_of_work_xpath)).click();
        Thread.sleep(2000);
        String testing_xpth = "//a[text()='testing']";
        chromeDriver.findElement(By.xpath(testing_xpth)).click();
        Thread.sleep(4000);
    }

    @Test
    public void VerifyhomepageUsingTitle() throws InterruptedException {
        chromeDriver.get("https://demo.actitime.com/login.do");
        String username_xpath = "//input[@type='text' and @name='username']";
        chromeDriver.findElement(By.xpath(username_xpath)).sendKeys("admin");
        String pwd_xpath = "//input[@type='password' and @name='pwd']";
        chromeDriver.findElement(By.xpath(pwd_xpath)).sendKeys("manager");
        String login_xpath = "//a[@id='loginButton']";
        chromeDriver.findElement(By.xpath(login_xpath)).click();
        Thread.sleep(4000);
        String expectedTitle = "Enter Time";
        String actualTitle = chromeDriver.getTitle();
        if(actualTitle.contains(expectedTitle))
            System.out.println("Home page is displayed");
        else 
        System.out.println("Home page is not displayed");
    }

    @Test
    public void VerifyhomepageUsingUrl() throws InterruptedException {
        chromeDriver.get("https://demo.actitime.com/login.do");
        String username_xpath = "//input[@type='text' and @name='username']";
        chromeDriver.findElement(By.xpath(username_xpath)).sendKeys("admin");
        String pwd_xpath = "//input[@type='password' and @name='pwd']";
        chromeDriver.findElement(By.xpath(pwd_xpath)).sendKeys("manager");
        String login_xpath = "//a[@id='loginButton']";
        chromeDriver.findElement(By.xpath(login_xpath)).click();
        Thread.sleep(4000);
        String expectedUrl = "submit";
        String currentUrl = chromeDriver.getCurrentUrl();
        if(currentUrl.contains(expectedUrl))
            System.out.println("This is current url");
        else
            System.out.println("This is not current url");
    }

    @Test
    public void VerifyhomepageUsingUniqueElement() throws InterruptedException {
        chromeDriver.get("https://demo.actitime.com/login.do");
        String username_xpath = "//input[@type='text' and @name='username']";
        chromeDriver.findElement(By.xpath(username_xpath)).sendKeys("admin");
        String pwd_xpath = "//input[@type='password' and @name='pwd']";
        chromeDriver.findElement(By.xpath(pwd_xpath)).sendKeys("manager");
        String login_xpath = "//a[@id='loginButton']";
        chromeDriver.findElement(By.xpath(login_xpath)).click();
        Thread.sleep(4000);
        String logot_xpath = "//a[text()='Logout']";
        WebElement logout_Button = chromeDriver.findElement(By.xpath(logot_xpath));
        if(logout_Button.isDisplayed())
            System.out.println("Home page unique");
        else
            System.out.println("Home page is not unique");
    }

    @Test
    public void VerifyUNandPWDalignme() {

    }
}
