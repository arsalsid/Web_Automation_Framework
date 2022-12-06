package Pages;

import BaseClass.BaseMain;
import PomEnum.LandingPageEnumLocators;
import Utilities.Utilities;
import org.openqa.selenium.WebDriver;

public class LandingPage extends BaseMain {
    LandingPage l;


    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

  public void ValidateSubscriptionLitePackages(){

        Utilities.isElementPresent(LandingPageEnumLocators.SUBSCRIPTION_PACKAGE_LITE_TYPE_LOCATOR.getLocator());
        Utilities.isElementPresent(LandingPageEnumLocators.SUBSCRIPTION_PACKAGE_LITE_PRICE_LOCATOR.getLocator());
        Utilities.isElementPresent(LandingPageEnumLocators.SUBSCRIPTION_PACKAGE_LITE_CURRENCY_LOCATOR.getLocator());
  }

    public void ValidateSubscriptionClassicPackages(){
        Utilities.isElementPresent(LandingPageEnumLocators.SUBSCRIPTION_PACKAGE_CLASSIC_TYPE_LOCATOR.getLocator());
        Utilities.isElementPresent(LandingPageEnumLocators.SUBSCRIPTION_PACKAGE_CLASSIC_PRICE_LOCATOR.getLocator());
        Utilities.isElementPresent(LandingPageEnumLocators.SUBSCRIPTION_PACKAGE_CLASSIC_CURRENCY_LOCATOR.getLocator());
    }
    public void ValidateSubscriptionPremiumPackages(){
        Utilities.isElementPresent(LandingPageEnumLocators.SUBSCRIPTION_PACKAGE_PREMIUM_TYPE_LOCATOR.getLocator());
        Utilities.isElementPresent(LandingPageEnumLocators.SUBSCRIPTION_PACKAGE_PREMIUM_PRICE_LOCATOR.getLocator());
        Utilities.isElementPresent(LandingPageEnumLocators.SUBSCRIPTION_PACKAGE_PREMIUM_CURRENCY_LOCATOR.getLocator());
    }

    public void clickOnCountryName() {
        Utilities.clickOnElement(LandingPageEnumLocators.CLICK_ON_COUNTRY_NAME_BUTTON_LOCATOR.getLocator());
        Utilities.clickOnAtPopupAlert();
    }

}
