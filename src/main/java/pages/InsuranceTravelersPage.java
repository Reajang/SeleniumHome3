package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsuranceTravelersPage extends BasePage{


    @FindBy(xpath = "//div[contains(text(), 'Минимальная')]/..")
    public WebElement buttonMin;
    @FindBy(xpath = "//span[contains(text(), 'Оформить')]/../..")
    public WebElement issue;

}
