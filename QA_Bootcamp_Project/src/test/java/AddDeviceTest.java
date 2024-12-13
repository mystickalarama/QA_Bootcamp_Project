import Base.BaseTest;
import Pages.MainPage;
import org.testng.annotations.Test;

public class AddDeviceTest extends BaseTest {

    MainPage mainPage = new MainPage();

    @Test(description = "Adding a device")
    public void AddDevice() throws InterruptedException {
        login();
        mainPage.clickMyWorkbench();
        sleep(1000);
        mainPage.clickAddDevice();
        sleep(1000);
        mainPage.searchDevice();
        sleep(1000);
        mainPage.selectDevice();
        sleep(500);
        mainPage.addDevice();
        sleep(500);
        assertEqualsText("Added", mainPage.getAddStatus());
        sleep(500);
        mainPage.removeDevice();
    }

}
