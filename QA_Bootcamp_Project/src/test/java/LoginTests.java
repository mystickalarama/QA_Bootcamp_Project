import Base.BaseTest;
import Pages.MainPage;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    MainPage mainPage = new MainPage();

    @Test(description = "Successful Sign in")
    public void SuccessfulSignIn() throws InterruptedException {
        login();
        mainPage.showUserInfo();

        assertEqualsText(username, mainPage.getUsername());
    }

}
