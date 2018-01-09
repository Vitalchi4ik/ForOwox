package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Properties;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class MobilePhonePage extends Page {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(), 'Мобильные телефоны')]")
    private WebElement header;

    public MobilePhonePage(final WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public MobilePhonePage open() {
        getDriver().get(Properties.getBaseUrl());
        return this;
    }

    public WebElement headerIsDisplay() {
        getWait().until(visibilityOf(header));
        return header;
    }
}
