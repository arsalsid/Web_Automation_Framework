package PomEnum;

public enum LandingPageLocators {

    SUBSCRIPTION_PACKAGE_TYPE_LOCATOR("//strong[@id='name-lite']");
    SUBSCRIPTION_PACKAGE_PRICE_LOCATOR("//div[@id='currency-lite']//b");
    SUBSCRIPTION_PACKAGE_CURRENCY_LOCATOR("")


    public String desc;

    LandingPageLocators(String description) {
        this.desc = description;
    }

    public String getLocator() {
        return desc;
    }

}
