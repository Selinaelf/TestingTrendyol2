package stepDef;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        driver.navigate().to("https://www.trendyol.com/");
    }

    @And("close popups")
    public void close_popups(){

        WebElement x2=driver.findElement(By.id("Rating-Review"));
        x2.click();
        WebElement x3=driver.findElement(By.id("onetrust-accept-btn-handler"));
    x3.click();
    }


    @When("user clicks signin")
    public void user_enters_mail_and_password() {

        WebElement loginButton=driver.findElement(By.xpath("//body/div[@id='container']/div[@id='header']/div[@id='headerMain']/div[@id='sticky-header']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]"));
        loginButton.click();
    }
@And("set email and password")
public void setMailAndPassword(){
      driver.findElement(By.id("login-email")).sendKeys("selinaesit@icloud.com");
      driver.findElement(By.id("login-password-input")).sendKeys("*****");

}
    @And("hits Enter")
    public void hits_enter() {
       WebElement signinButton=driver.findElement(By.xpath("//body/div[@id='container']/div[@id='login-register']/div[3]/div[1]/form[1]/button[1]"));
   signinButton.click();
    }

    @Then("user is navigated to the site")
    public void user_is_navigated_to_the_site() {
     driver.getPageSource().contains("Tüm ürünler");

    }
}
