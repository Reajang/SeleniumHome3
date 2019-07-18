package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BasePage {

    //static{ DriverManager.initialDriver("http://www.sberbank.ru/ru/person"); }


    public BasePage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }



    public void elemClick(WebElement element){
        element.click();
    }

    public void fillText(WebElement element, String text){
        element.sendKeys(text);
    }



}
