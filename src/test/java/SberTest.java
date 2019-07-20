
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.*;
import org.openqa.selenium.WebElement;
import pages.DriverManager;
import pages.sberPages.InsuranceTravelersPage;
import pages.sberPages.RegistrationPage;
import pages.sberPages.SberPersonPage;

import java.util.List;

public class SberTest {


    @Test
    @DisplayName("Тест Сбербанк")
    @Description("Задание 2")
    public void sberTest() {


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

    @Step("Перейти на страницу http://www.sberbank.ru/ru/person")
    @Before
    public void initWeb() {
        DriverManager.initialDriver("http://www.sberbank.ru/ru/person");
    }


}
