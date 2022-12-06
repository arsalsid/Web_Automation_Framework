package BaseClass;

import Utilities.TestConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class BaseMain {
    protected WebDriver driver;
    public static String browser = TestConfig.readConfig("./src/test/resources/Configuration/config.properties", "BROWSER");

    public void setUp(String url) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(); //Local Testing
            driver.navigate().to(url);
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(); //Local Testing
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


//        else if (browser.equalsIgnoreCase("remote")){
//            //Remote Testing
//            DesiredCapabilities caps = new DesiredCapabilities();
//            caps.setCapability("os_version" , "10");
//            caps.setCapability("resolution", "1920x1000");
//            caps.setCapability("browser","chrome");
//            caps.setCapability("browser_version","latest_beta");
//            caps.setCapability("os", "Windows");
//            caps.setCapability("name","APIAutomation_Framework");
//            caps.setCapability("build","Bstack Build number 1");
//
//            try{
//                driver = new RemoteWebDriver(new URL(REMOTE_URL), caps);
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            }
//        }
    }

    public void takeScreenShot() {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File f = screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(System.getProperty("user.dir") + "screenshots.png");
    }

    public void tearDown() {
        driver.quit();
        //driver.close();
    }

}
