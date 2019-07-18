package pages.rgsPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DmsRequestPage  extends BasePage {


    @FindBy(xpath = "//*[@class='modal-content']")
    private WebElement requestForm;
    @FindBy(xpath = "//*[@class='modal-title']")
    private WebElement requestFormTitle;
    @FindBy(xpath = "//*[text()= '���']/following::input[1]")
    private WebElement name;
    @FindBy(xpath = "//*[text()= '�������']/following::input[1]")
    private WebElement surName;
    @FindBy(xpath = "//*[text()= '��������']/following::input[1]")
    private WebElement middleName;
    @FindBy(xpath = "//*[text()= '�������']/following::input[1]")
    private WebElement phoneNumner;
    @FindBy(xpath = "//*[text()= '��. �����']/following::input[1]")
    private WebElement email;
    @FindBy(xpath = "//*[text()= '�������������� ���� ��������']/following::input[1]")
    private WebElement dayToColl;
    @FindBy(xpath = "//*[contains(text(),'������')]/following::option")
    private WebElement region;
    @FindBy(xpath = "//*[text()= '�����������']/following::input[1]")
    private WebElement comments;
    @FindBy(xpath = "//*[contains(text(),'� ��������')]/preceding-sibling::input")
    private WebElement agree;
    @FindBy(xpath = "//*[@id='button-m']")
    private WebElement sendButton;
    @FindBy(xpath = "//*[text()='��. �����']//following::label[1]")
    private WebElement emailError;

    public WebElement getFormTitleText(){
        return requestFormTitle;
    }
    public void clickAgree(){
        elemClick(agree);
    }
    public void clickSendButton(){
        elemClick(sendButton);
    }
    public void checkEmailError(){
        assertData("������� ����� ����������� �����", emailError);
    }
    public void fillEmail(String string){
        fillText(email, string);
    }

    //����� ���-�� ������� � BasePage
    public List<WebElement> getNesesseryElements(){
        List<WebElement> list = new ArrayList<>();
        list.add(name);
        list.add(surName);
        list.add(middleName);
        list.add(phoneNumner);
        list.add(email);
        list.add(dayToColl);
        list.add(comments);
        list.add(region);
        return list;
    }
    public List<String> getTextToInputs(){
        return  Arrays.asList("����", "�������", "���������", "8005553535", "qwertyqwerty", "19072019", "�����������", "1");
    }

}
