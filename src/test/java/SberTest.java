
import io.qameta.allure.Step;
import org.junit.*;
import org.openqa.selenium.WebElement;
import pages.DriverManager;
import pages.sberPages.InsuranceTravelersPage;
import pages.sberPages.RegistrationPage;
import pages.sberPages.SberPersonPage;

import java.util.List;

public class SberTest {



    /*@AfterClass
    public static void afterTest() {
        DriverManager.closePages();
        DriverManager.getDriver().quit();
    }*/


    @Test
    public void sberTest() {

        DriverManager.initialDriver("http://www.sberbank.ru/ru/person");

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

        DriverManager.closePages();
        DriverManager.getDriver().quit();

    }

    /*@Step("Перейти на страницу http://www.sberbank.ru/ru/person")
    @BeforeClass
    public static void initWeb() {
        DriverManager.initialDriver("http://www.sberbank.ru/ru/person");
    }*/

}
