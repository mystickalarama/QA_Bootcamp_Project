package Pages;

import Base.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class MainPage extends BaseTest {

    @Step("Enter the 'Log in' field")
    public MainPage enterLogin() {
        driver.findElement(By.id("navLogin")).click();
        return this;
    }

    @Step("Fill the email")
    public MainPage fillMail(String mail) {
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(mail);
        screenshot();
        return this;
    }

    @Step("Fill the password")
    public MainPage fillPassword(String password) {
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
        screenshot();
        return this;
    }

    @Step("Click the 'Log in' button")
    public MainPage clickLogin() {
        driver.findElement(By.id("loginBtn")).click();
        return this;
    }

    @Step("Show user info")
    public MainPage showUserInfo() {
        driver.findElement(By.cssSelector("[class='chakra-avatar__img css-3a5bz2']")).click();
        screenshot();
        return this;
    }

    @Step("Get username")
    public String getUsername() {
        String userName = driver.findElement(By.cssSelector("[class='sc-tafSX jeJXoB']")).getText();
        return userName;
    }

    @Step("Click the 'My Workbench' button")
    public MainPage clickMyWorkbench() {
        driver.findElement(By.id("workbenchDropdownToggle")).click();
        return this;
    }

    @Step("Click the 'Add a Device' button")
    public MainPage clickAddDevice() {
        driver.findElement(By.cssSelector("[class='chakra-button css-11o83gh']")).click();
        return this;
    }

    @Step("Search for a device")
    public MainPage searchDevice() {
        driver.findElement(By.cssSelector("[class='chakra-input css-170np6j']")).clear();
        driver.findElement(By.cssSelector("[class='chakra-input css-170np6j']")).sendKeys(device);
        return this;
    }

    @Step("Click for select device")
    public MainPage selectDevice() {
        driver.findElement(By.cssSelector("[class='css-oenmm4']")).click();
        return this;
    }

    @Step("Click for add device to workbench")
    public MainPage addDevice() {
        driver.findElement(By.cssSelector("[class='chakra-button css-rr9f2q']")).click();
        return this;
    }

    @Step("Click for remove device from workbench")
    public MainPage removeDevice() {
        driver.findElement(By.cssSelector("[class='chakra-button css-e1j5q6']")).click();
        return this;
    }

    @Step("Get added status")
    public String getAddStatus() {
        String addStatus = driver.findElement(By.cssSelector("[class='chakra-button css-e1j5q6']")).getText();
        if (addStatus == "Added") {
            Allure.addAttachment("Device added successfully", "");
        }
        return addStatus;
    }
}
