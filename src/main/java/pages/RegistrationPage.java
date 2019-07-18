package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

    @FindBy(xpath = "//input[@name='insured0_surname']")
    private WebElement ownerSurname;
    @FindBy(xpath = "//input[@name='insured0_name']")
    private WebElement ownerName;
    @FindBy(xpath = "//input[@name='insured0_birthDate']")
    private WebElement ownerBday;
    @FindBy(xpath = "//input[@name='surname']")
    private WebElement targerSurname;
    @FindBy(xpath = "//input[@name='name']")
    private WebElement targerName;
    @FindBy(xpath = "//input[@name='middlename']")
    private WebElement targerMiddleName;
    @FindBy(xpath = "//input[@name='birthDate']")
    private WebElement targerBday;
    @FindBy(xpath = "//input[@name='male']")
    private WebElement targerSexMale;
    @FindBy(xpath = "//input[@placeholder='Серия']")
    private WebElement targerPaspSer;
    @FindBy(xpath = "//input[@placeholder='Номер']")
    private WebElement targerPaspNum;
    @FindBy(xpath = "//input[@name='issueDate']")
    private WebElement targetPaspDay;
    @FindBy(xpath = "//*[@ng-click='save()']")
    private WebElement continueButton;

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getOwnerSurname() {
        return ownerSurname;
    }

    public WebElement getOwnerName() {
        return ownerName;
    }

    public WebElement getOwnerBday() {
        return ownerBday;
    }

    public WebElement getTargerSurname() {
        return targerSurname;
    }

    public WebElement getTargerName() {
        return targerName;
    }

    public WebElement getTargerMiddleName() {
        return targerMiddleName;
    }

    public WebElement getTargerBday() {
        return targerBday;
    }

    public WebElement getTargerSexMale() {
        return targerSexMale;
    }

    public WebElement getTargerPaspSer() {
        return targerPaspSer;
    }

    public WebElement getTargerPaspNum() {
        return targerPaspNum;
    }

    public WebElement getTargetPaspDay() {
        return targetPaspDay;
    }
}





