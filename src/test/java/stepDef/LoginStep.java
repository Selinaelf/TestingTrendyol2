package stepDef;

import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginStep {
    WebDriver driver=null;
    @Given("browser is open")
    public void browser_is_open() {
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
   driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS );

    }

   @And("user is on trendyol login page")
    public void user_is_on_trendyol_login_page() {

    }

    @When("user enters mail and password")
    public void user_enters_mail_and_password() {

    }

    @And("hits Enter")
    public void hits_enter() {

    }

    @Then("user is navigated to the site")
    public void user_is_navigated_to_the_site() {


    }
}
