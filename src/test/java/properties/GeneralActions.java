package properties;

import org.openqa.selenium.WebDriver;
import pages.MobilePhonePage;

public class GeneralActions {
    private final WebDriver driver;

    public GeneralActions(final WebDriver driver){
        this.driver = driver;
    }

    public void openningPage() {
        MobilePhonePage mobilePhonePagePage = new MobilePhonePage(driver);
        mobilePhonePagePage.open();
    }

    public boolean headerDisplay()
    {
        MobilePhonePage mobilePhonePagePage = new MobilePhonePage(driver);
        return mobilePhonePagePage.headerIsDisplay().isDisplayed();
    }
}
