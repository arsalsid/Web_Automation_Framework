package TestMethods;

import BaseClass.BaseMain;
import Pages.LandingPage;
import Utilities.TestConfig;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LandingTest extends BaseMain {
    LandingPage l;

    @BeforeSuite
    public void launch_Browser() {
        setUp(TestConfig.readConfig("./Configuration/config.properties/","URL"));
        l = new LandingPage(driver);
    }

    @Test(priority = 1)
    public void ValidateLitePackageTest() {
        l.ValidateSubscriptionLitePackages();
    }

    public void ValidateClassicPackageTest() {
        l.ValidateSubscriptionClassicPackages();
    }

    public void ValidatePremiumPackageTest() {
        l.ValidateSubscriptionPremiumPackages();
    }
}
