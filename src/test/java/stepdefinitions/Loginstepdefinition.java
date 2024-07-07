package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.LoginPage;
import utilities.ConstantUtils;

import java.time.Duration;

import static browsercontrol.WebConnector.driver;

public class Loginstepdefinition {
     private LoginPage loginPage =new LoginPage();
    @Given("the user navigates to {string}")
    public void the_user_navigates_to(String URL) throws InterruptedException {

        driver.get(ConstantUtils.BASE_URL);

        Thread.sleep(2000);
    }


    @When("the user enters {string} in username field")
    public void the_user_enter_in_username_field(String userName) throws InterruptedException {
        LoginPage.setUsername(userName);
        Thread.sleep(2000);
    }
    @When("the user enters {string} in password field")
    public void the_user_enter_in_password_field(String passWord) {
        LoginPage.setPassword(passWord);
    }
    @And("the user clicks login button")
    public void the_user_clicks_login_button() throws InterruptedException {
        LoginPage.clickloginbutton();
        Thread.sleep(2000);
    }

    @When("the user enters {string} username and {string} password")
    public void the_user_login_with_username_and_password(String username ,String password) throws InterruptedException
    {
        LoginPage.setUsername(username);
        LoginPage.setPassword(password);
        LoginPage.clickloginbutton();

        Thread.sleep(2000);

    }
    @Then("the user should see {string} text on the page")
    public void the_user_should_see_text_on_the_page(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));
        //Assert.assertFalse(driver.getPageSource().contains(expectedText));

    }


}
