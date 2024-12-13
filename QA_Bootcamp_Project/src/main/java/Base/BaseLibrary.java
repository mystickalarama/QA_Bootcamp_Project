package Base;

import Pages.MainPage;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import static Base.BaseTest.driver;

public class BaseLibrary extends Data {

    @Step("Waited for {time}ms")
    public void sleep(int time) throws InterruptedException {
        Thread.sleep(time);
    }

    @Step("Checked the field")
    public void assertEqualsText(String text, String value) {
        screenshot();
        Assert.assertEquals(text, value);
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] screenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Step("Log in user account")
    public void login() throws InterruptedException {
        MainPage mainPage = new MainPage();

        mainPage.enterLogin();
        sleep(1000);
        mainPage.fillMail(mail)
                .fillPassword(password)
                .clickLogin();
        sleep(2500);
    }
}
