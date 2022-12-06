package PomEnum;

public enum LandingPageEnumLocators {

    SUBSCRIPTION_PACKAGE_LITE_TYPE_LOCATOR("//strong[@id='name-lite']"),
    SUBSCRIPTION_PACKAGE_LITE_PRICE_LOCATOR("//div[@id='currency-lite']//b"),
    SUBSCRIPTION_PACKAGE_LITE_CURRENCY_LOCATOR("//div[@id='currency-lite']//i"),

    SUBSCRIPTION_PACKAGE_CLASSIC_TYPE_LOCATOR("//strong[@id='name-classic']"),
    SUBSCRIPTION_PACKAGE_CLASSIC_PRICE_LOCATOR("//div[@id='currency-classic']//b"),
    SUBSCRIPTION_PACKAGE_CLASSIC_CURRENCY_LOCATOR("//div[@id='currency-classic']//i"),

    SUBSCRIPTION_PACKAGE_PREMIUM_TYPE_LOCATOR("//strong[@id='name-premium']"),
    SUBSCRIPTION_PACKAGE_PREMIUM_PRICE_LOCATOR("//div[@id='currency-premium']//b"),
    SUBSCRIPTION_PACKAGE_PREMIUM_CURRENCY_LOCATOR("//div[@id='currency-premium']//i"),

    CLICK_ON_COUNTRY_NAME_BUTTON_LOCATOR("//span[@id='country-name']");


    public String desc;

    LandingPageEnumLocators(String description) {
        this.desc = description;
    }
    public String getLocator() {
        return desc;
    }

}
