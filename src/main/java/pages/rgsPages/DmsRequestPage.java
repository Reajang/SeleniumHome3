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
    @FindBy(xpath = "//*[text()= 'Имя']/following::input[1]")
    private WebElement name;
    @FindBy(xpath = "//*[text()= 'Фамилия']/following::input[1]")
    private WebElement surName;
    @FindBy(xpath = "//*[text()= 'Отчество']/following::input[1]")
    private WebElement middleName;
    @FindBy(xpath = "//*[text()= 'Телефон']/following::input[1]")
    private WebElement phoneNumner;
    @FindBy(xpath = "//*[text()= 'Эл. почта']/following::input[1]")
    private WebElement email;
    @FindBy(xpath = "//*[text()= 'Предпочитаемая дата контакта']/following::input[1]")
    private WebElement dayToColl;
    @FindBy(xpath = "//*[contains(text(),'Регион')]/following::option")
    private WebElement region;
    @FindBy(xpath = "//*[text()= 'Комментарии']/following::input[1]")
    private WebElement comments;
    @FindBy(xpath = "//*[contains(text(),'Я согласен')]/preceding-sibling::input")
    private WebElement agree;
    @FindBy(xpath = "//*[@id='button-m']")
    private WebElement sendButton;
    @FindBy(xpath = "//*[text()='Эл. почта']//following::label[1]")
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
        assertData("Введите адрес электронной почты", emailError);
    }
    public void fillEmail(String string){
        fillText(email, string);
    }

    //НУжно как-то вынести в BasePage
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
        return  Arrays.asList("Иван", "Сидоров", "Андреевич", "8005553535", "qwertyqwerty", "19072019", "Комментарий", "1");
    }

}
