package pages.sberPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class InsuranceTravelersPage extends BasePage {


    @FindBy(xpath = "//div[contains(text(), '�����������')]/..")
    private WebElement buttonMin;
    @FindBy(xpath = "//span[contains(text(), '��������')]/../..")
    private WebElement issue;

    @Step("�� ������� � ����� ������  ������� ����� ��������� ������ � �����������")
    public void clickButtonBin() {
        elemClick(buttonMin);
    }

    @Step("������ ��������")
    public void clickIssue() {
        elemClick(issue);
    }

}
