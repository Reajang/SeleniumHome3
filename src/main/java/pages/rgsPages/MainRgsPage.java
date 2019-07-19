package pages.rgsPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class MainRgsPage extends BasePage {
    @FindBy(xpath = "//*[contains(text(), '�����������')]")
    private WebElement insurance;
    @FindBy(xpath = "//*[contains(text(), '���')]")
    private WebElement dms;
    @Step("������� ����� ���� -�����������")
    public void clickInsurance(){
        elemClick(insurance);
    }
    @Step("������� ��������� -���")
    public void clickDms(){
        elemClick(dms);
    }

}
