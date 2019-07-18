
import org.junit.Assert;
import org.junit.Test;
import pages.DriverManager;
import pages.InsuranceTravelersPage;
import pages.RegistrationPage;
import pages.SberPersonPage;

public class SberTest  {

    @Test
    public void sberTest(){



        DriverManager.initialDriver("http://www.sberbank.ru/ru/person");

        SberPersonPage sberPersonPage = new SberPersonPage();

        sberPersonPage.elemClick(sberPersonPage.mainPage);
        sberPersonPage.elemClick(sberPersonPage.travel);

        Assert.assertEquals("\nНет надписи ", "Страхование путешественников", sberPersonPage.title.getText());

        DriverManager.changePageByClickWebElement(sberPersonPage.makeOnline);

        InsuranceTravelersPage insuranceTravelersPage = new InsuranceTravelersPage();

        insuranceTravelersPage.elemClick(insuranceTravelersPage.buttonMin);
        insuranceTravelersPage.elemClick(insuranceTravelersPage.issue);

        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.fillText(registrationPage.getOwnerName(), "Ivan");
        registrationPage.fillText(registrationPage.getOwnerSurname(), "Ivanov");
        registrationPage.fillText(registrationPage.getOwnerBday(), "14.05.1994");
        registrationPage.fillText(registrationPage.getTargerSurname(), "Шультц");
        registrationPage.fillText(registrationPage.getTargerName(), "Андрей");
        registrationPage.fillText(registrationPage.getTargerMiddleName(), "Петрович");
        registrationPage.fillText(registrationPage.getTargerBday(), "12.09.1999");
        registrationPage.fillText(registrationPage.getTargerPaspSer(), "1234");
        registrationPage.fillText(registrationPage.getTargerPaspNum(), "567890");
        registrationPage.fillText(registrationPage.getTargetPaspDay(), "12.10.2013");

        Assert.assertEquals("Ivan", registrationPage.getOwnerName().getAttribute("value"));
        Assert.assertEquals("Ivanov", registrationPage.getOwnerSurname().getAttribute("value"));
        Assert.assertEquals("14.05.1994", registrationPage.getOwnerBday().getAttribute("value"));
        Assert.assertEquals("Шультц", registrationPage.getTargerSurname().getAttribute("value"));
        Assert.assertEquals("Андрей", registrationPage.getTargerName().getAttribute("value"));
        Assert.assertEquals("Петрович", registrationPage.getTargerMiddleName().getAttribute("value"));
        Assert.assertEquals("12.09.1999", registrationPage.getTargerBday().getAttribute("value"));
        Assert.assertEquals("1234", registrationPage.getTargerPaspSer().getAttribute("value"));
        Assert.assertEquals("567890", registrationPage.getTargerPaspNum().getAttribute("value"));
        Assert.assertEquals("12.10.2013", registrationPage.getTargetPaspDay().getAttribute("value"));

        registrationPage.elemClick(registrationPage.getContinueButton());

        DriverManager.getDriver().close();
        DriverManager.getDriver().quit();

    }
    //@Step("Перейти на страницу http://www.sberbank.ru/ru/person")
    private void initWeb(){
        DriverManager.initialDriver("http://www.sberbank.ru/ru/person");
    }

}
