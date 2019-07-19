package pages.sberPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class InsuranceTravelersPage extends BasePage {


    @FindBy(xpath = "//div[contains(text(), 'Минимальная')]/..")
    private WebElement buttonMin;
    @FindBy(xpath = "//span[contains(text(), 'Оформить')]/../..")
    private WebElement issue;

    @Step("На вкладке – Выбор полиса  выбрать сумму страховой защиты – Минимальная")
    public void clickButtonBin() {
        elemClick(buttonMin);
    }

    @Step("Нажать Оформить")
    public void clickIssue() {
        elemClick(issue);
    }

}
