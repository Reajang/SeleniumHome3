import org.junit.*;
import org.openqa.selenium.WebElement;
import pages.DriverManager;
import pages.rgsPages.DmsRequestPage;
import pages.rgsPages.DmsRgsPage;
import pages.rgsPages.MainRgsPage;

import java.util.List;

public class RgsTest {

    @BeforeClass
    public static void initRsg(){
        DriverManager.initialDriver("https://www.rgs.ru");
    }

    @Test
    public void rgsTest(){
        MainRgsPage mainRgsPage = new MainRgsPage();
        mainRgsPage.clickInsurance();
        mainRgsPage.clickDms();

        DmsRgsPage dmsRgsPage = new DmsRgsPage();
        dmsRgsPage.assertData("��� " + "\u2014" +" ������������ ����������� �����������", dmsRgsPage.getDmsTitle());
        dmsRgsPage.clickSendRequest();

        DmsRequestPage dmsRequestPage = new DmsRequestPage();
        dmsRequestPage.assertData("������ �� ������������ ����������� �����������", dmsRequestPage.getFormTitleText());

        List<WebElement> necessaryFields = dmsRequestPage.getNesesseryElements();
        List<String> textToInput = dmsRequestPage.getTextToInputs();

        dmsRequestPage.fillFields(textToInput, necessaryFields);
        dmsRequestPage.assertData(textToInput, necessaryFields);

        dmsRequestPage.clickAgree();
        dmsRequestPage.clickSendButton();

        dmsRequestPage.checkEmailError();
        dmsRequestPage.fillEmail("trainee@aplana.ru");
    }

    @After
    public void after(){
        DriverManager.closePages();
    }
    @AfterClass
    public static void afterClass(){
        DriverManager.getDriver().quit();
    }
}
