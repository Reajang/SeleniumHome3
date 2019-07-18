
import io.qameta.allure.Step;
import org.junit.*;
import org.openqa.selenium.WebElement;
import pages.DriverManager;
import pages.sberPages.InsuranceTravelersPage;
import pages.sberPages.RegistrationPage;
import pages.sberPages.SberPersonPage;

import java.util.List;

public class SberTest{

    @AfterClass
    public static void afterClass(){
        DriverManager.getDriver().quit();
    }

    @After
    public void afterTest(){
        DriverManager.closePages();
    }

    @Test
    public void sberTest(){

        SberPersonPage sberPersonPage = new SberPersonPage();

        sberPersonPage.clickMainPage();
        sberPersonPage.clickTravel();
        sberPersonPage.checkTitle();

        DriverManager.changePageByClickWebElement(sberPersonPage.getMakeOnline());

        InsuranceTravelersPage insuranceTravelersPage = new InsuranceTravelersPage();

        insuranceTravelersPage.clickButtonBin();
        insuranceTravelersPage.clickIssue();

        RegistrationPage registrationPage = new RegistrationPage();

        List<WebElement> necessaryFields = registrationPage.getNesesseryElements();
        List<String> textToInput = registrationPage.getTextToInputs();

        registrationPage.fillFields(textToInput, necessaryFields);

        registrationPage.assertData(textToInput, necessaryFields);


        registrationPage.clickContinueButton();
        registrationPage.assertErrorMessage();

        registrationPage.takescreenshot();



    }
    @BeforeClass
    @Step("Перейти на страницу http://www.sberbank.ru/ru/person")
    public static void initWeb(){
        DriverManager.initialDriver("http://www.sberbank.ru/ru/person");
    }

}
