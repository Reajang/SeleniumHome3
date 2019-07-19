import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.*;
import org.openqa.selenium.WebElement;
import pages.DriverManager;
import pages.rgsPages.DmsRequestPage;
import pages.rgsPages.DmsRgsPage;
import pages.rgsPages.MainRgsPage;

import java.util.List;

public class RgsTest {

    @Step("Перейти по сслылке http://www.rgs.ru")
    @BeforeClass
    public static void initRsg(){
        DriverManager.initialDriver("https://www.rgs.ru");
    }

    @Test
    @DisplayName("Тест Росгосстрах")
    @Description("Задание 1")
    public void rgsTest(){

        MainRgsPage mainRgsPage = new MainRgsPage();
        mainRgsPage.clickInsurance();
        mainRgsPage.clickDms();

        DmsRgsPage dmsRgsPage = new DmsRgsPage();
        dmsRgsPage.checkTitle();
        dmsRgsPage.clickSendRequest();

        DmsRequestPage dmsRequestPage = new DmsRequestPage();
        dmsRequestPage.checkFormTitle();

        List<WebElement> necessaryFields = dmsRequestPage.getNesesseryElements();
        List<String> textToInput = dmsRequestPage.getTextToInputs();
        List<String> textToCheck = dmsRequestPage.getTextToCheck();

        dmsRequestPage.fillFields(textToInput, necessaryFields);
        dmsRequestPage.fillSelect(dmsRequestPage.getRegions(), 1);
        Assert.assertEquals("77", dmsRequestPage.getRegions().get(1).getAttribute("value"));//Нужно вынести в отдельный метод
        dmsRequestPage.assertData(textToCheck, necessaryFields);

        dmsRequestPage.clickAgree();
        dmsRequestPage.clickSendButton();

        dmsRequestPage.checkEmailError();
        dmsRequestPage.fillEmail("trainee@aplana.ru");


    }


}
