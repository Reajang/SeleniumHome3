package pages.sberPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SberPersonPage extends BasePage {


    @FindBy(xpath = "//span[contains(text(), 'Страхование')]/parent::*")
    private WebElement mainPage;
    @FindBy(xpath = "//span[contains(text(), 'Страхование')]/parent::*/following::*[contains(text(), 'Путешествия и покупки')][1]")
    private WebElement travel;
    @FindBy(xpath = "//a[contains(text(), 'Оформить онлайн')]")
    private WebElement makeOnline;
    @FindBy(xpath = "//*[contains(text(),'Страхование путешественников')]")
    private WebElement title;

    @Step("Нажать на – Страхование")
    public void clickMainPage() {
        elemClick(mainPage);
    }

    @Step("Выбрать – Путешествие и покупки")
    public void clickTravel() {
        elemClick(travel);
    }

    public void clickMakeOnline() {
        elemClick(makeOnline);
    }

    @Step("роверить наличие на странице заголовка – Страхование путешественников")
    public void checkTitle() {
        Assert.assertEquals("\nНет надписи ", "Страхование путешественников", title.getText());
    }

    @Step("Нажать на – Оформить Онлайн")
    public WebElement getMakeOnline() {
        return makeOnline;
    }
}


