package pages.rgsPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DmsRgsPage extends BasePage {

    @FindBy(xpath = "//*[@class='clearfix']//following-sibling::h1")
    private WebElement dmsTitle;
    @FindBy(xpath = "//*[@class='rgs-context-bar-content-call-to-action-buttons']/a[3]")
    private WebElement sendRequest;

    public WebElement getDmsTitle(){
        return dmsTitle;
    }
    @Step("Нажать на кнопку -Отправить заявку")
    public void clickSendRequest(){
        elemClick(sendRequest);
    }
    @Step("Проверить наличие заголовка -Добровольное медицинское страхование")
    public void checkTitle(){
        assertData("ДМС " + "\u2014" +" добровольное медицинское страхование", getDmsTitle());
    }

}
