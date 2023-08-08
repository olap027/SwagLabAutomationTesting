package SwagLabs.Login;

import configuration.DriverConfig;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static configuration.DriverConfig.getDriverWait;
import static utils.AppUtil.getElementWithPolling;

public class LoginSteps {

    private static WebDriver driver;
    private static WebDriverWait wait ;

    private final static String USERNAME_FIELD = "/input[@id='user-name'";
    @BeforeAll
    public static void setup(){
        driver = DriverConfig.getChromeConfig();
        wait = getDriverWait(driver);

    }
    @Given("I am Email - Login page")
    public void Login(){
        WebElement usernameField = getElementWithPolling(wait, By.ByXPath.xpath(USERNAME_FIELD));
        usernameField.click();

    }



}
