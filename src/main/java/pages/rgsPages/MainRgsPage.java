package pages.rgsPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class MainRgsPage extends BasePage {
    @FindBy(xpath = "//*[contains(text(), 'Страхование')]")
    private WebElement insurance;
    @FindBy(xpath = "//*[contains(text(), 'ДМС')]")
    private WebElement dms;
    @Step("Выбрать пункт меню - Страхование")
    public void clickInsurance(){
        elemClick(insurance);
    }
    @Step("Выбрать категорию -ДМС")
    public void clickDms(){
        elemClick(dms);
    }

}
