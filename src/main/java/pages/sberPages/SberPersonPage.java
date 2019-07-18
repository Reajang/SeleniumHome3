package pages.sberPages;

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

    public void clickMainPage(){
        elemClick(mainPage);
    }
    public void clickTravel(){
        elemClick(travel);
    }
    public void clickMakeOnline(){
        elemClick(makeOnline);
    }
    public void checkTitle(){
        Assert.assertEquals("\n��� ������� ", "����������� ����������������", title.getText());
    }

    public WebElement getMakeOnline() {
        return makeOnline;
    }
}


