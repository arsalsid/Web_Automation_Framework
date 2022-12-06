package Utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.function.Function;

public class Utilities{

    protected static WebDriver driver;
    protected static WebDriverWait wait;

    // private static final Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public Utilities(WebDriver driver, WebDriverWait wait) {
        super();
        this.driver = driver;
        Utilities.wait = wait;
    }


    public static void enterText(By elementLocator, String textToEnter) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
            // element.clear();
            element.sendKeys(textToEnter);
        } catch (NoSuchElementException e) {
            System.out.println("Unable to locate element with the given elementLocator");
        }
    }

    public static void clickOnElement(String xpath) {
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            element.click();
        } catch (NoSuchElementException e) {
            System.out.println("Unable to locate element with the given elementLocator");
        }
    }

    public void clickOnElement(WebElement element) {
        try {
            WebElement elementData = wait.until(ExpectedConditions.elementToBeClickable(element));
            elementData.click();
        } catch (NoSuchElementException e) {
            System.out.println("Unable to locate element with the given elementLocator");
        }
    }

    public static boolean isElementPresent(String xpath) {
        WebElement element = null;
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        }
        catch (NoSuchElementException e) {

        }
        if (element == null) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void wait1Seconds() throws InterruptedException {
        Thread.sleep(1000);
    }
    public static void checkPageIsReady() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String s = "";
        while (!s.equals("complete")) {
            s = (String) js.executeScript("return document.readyState");
            try {
                wait1Seconds();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void waitForPageLoad() {

        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                ((JavascriptExecutor) driver).executeScript("return document.readyState");
                return String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                        .equals("complete");
            }
        });
    }

    public static void waitForClickable(WebElement element){
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitForElementToBeClickable(WebElement element){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitForVisibility(WebElement element){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void clickOnAtPopupAlert(){
        Alert alert = driver.switchTo().alert();
        System.out.println("alert.getText()" + alert.getText());
        alert.accept();
        checkPageIsReady();
    }

    public void switchToFrame(WebElement element){
        driver.switchTo().frame(element);
    }

    public void switchToFrameBack(){
        driver.switchTo().parentFrame();
    }

    public void scrollToWebElement(String scrollTo){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scrollTo);
    }
    public void clickLinkSidebar(WebElement sidebarLink) throws Exception {
        sidebarLink.click();
        waitForPageLoad();
    }
}
