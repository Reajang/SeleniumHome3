package pages.sberPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SberPersonPage extends BasePage {


    @FindBy(xpath = "//span[contains(text(), '�����������')]/parent::*")
    private WebElement mainPage;
    @FindBy(xpath = "//span[contains(text(), '�����������')]/parent::*/following::*[contains(text(), '����������� � �������')][1]")
    private WebElement travel;
    @FindBy(xpath = "//a[contains(text(), '�������� ������')]")
    private WebElement makeOnline;
    @FindBy(xpath = "//*[contains(text(),'����������� ����������������')]")
    private WebElement title;

    @Step("������ �� � �����������")
    public void clickMainPage() {
        elemClick(mainPage);
    }

    @Step("������� � ����������� � �������")
    public void clickTravel() {
        elemClick(travel);
    }

    public void clickMakeOnline() {
        elemClick(makeOnline);
    }

    @Step("�������� ������� �� �������� ��������� � ����������� ����������������")
    public void checkTitle() {
        Assert.assertEquals("\n��� ������� ", "����������� ����������������", title.getText());
    }

    @Step("������ �� � �������� ������")
    public WebElement getMakeOnline() {
        return makeOnline;
    }
}


