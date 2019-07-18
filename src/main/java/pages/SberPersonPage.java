package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SberPersonPage extends BasePage{


    @FindBy(xpath = "//span[contains(text(), 'Страхование')]/parent::*")
    public WebElement mainPage;
    @FindBy(xpath = "//span[contains(text(), 'Страхование')]/parent::*/following::*[contains(text(), 'Путешествия и покупки')][1]")
    public WebElement travel;
    @FindBy(xpath = "//a[contains(text(), 'Оформить онлайн')]")
    public WebElement makeOnline;
    @FindBy(xpath = "//*[contains(text(),'Страхование путешественников')]")
    public WebElement title;
}


