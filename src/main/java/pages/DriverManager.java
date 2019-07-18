package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    private static WebDriver driver;

    public static void initialDriver(String url){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        getDriver().get(url);
        getDriver().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver(){
        if(driver == null) driver = new ChromeDriver();
        return driver;
    }

    public static void changePageByClickWebElement(WebElement element){
        Set<String> oldHandlers = getDriver().getWindowHandles();
        element.click();
        Set<String> newHendlers = getDriver().getWindowHandles();
        newHendlers.removeAll(oldHandlers);
        getDriver().switchTo().window(newHendlers.iterator().next());
        getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
}
