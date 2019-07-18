package pages;

import io.qameta.allure.Attachment;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public void elemClick(WebElement element){
        DriverManager.waitElem(element).click();
    }

    public void fillText(WebElement element, String text){
        element.sendKeys(text);
    }

    @Attachment(value = "скриншот", type = "image/png")
    public byte[] takescreenshot(){
        return ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
    }

    public void assertData(List<String> expextedData, List<WebElement> actualElemenst){
        if(expextedData.size() != actualElemenst.size()) return;
        if(expextedData.isEmpty() || actualElemenst.isEmpty()) return;
        for(int i = 0; i < expextedData.size(); i++){
            Assert.assertEquals(expextedData.get(i), actualElemenst.get(i).getAttribute("value"));
        }
    }

    public void fillFields(List<String> text, List<WebElement> elemensts){
        if(text.size() != elemensts.size()) return;
        if(text.isEmpty() || elemensts.isEmpty()) return;
        for(int i = 0; i < text.size(); i++){
            fillText(DriverManager.waitElem(elemensts.get(i)), text.get(i));
        }
    }

    public void assertData(String expect, WebElement element){
        Assert.assertEquals(expect, DriverManager.waitElem(element).getText());
    }

}
