package stepDefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.TestContextSetup;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class stepDefination {

    TestContextSetup testContextSetup;
    String landingPageProductName;

    public  stepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
    }

    // Create an instance of the ChromeDriver


    @Given("User is on NetBanking landing page")
    public void  user_is_on_net_banking_landing_page(){
        System.out.println("user_is_on_net_banking_landing_page");
    }



    @Then("Home page is populated")
    public void homePageIsPopulated() {
        System.out.println("Home page is populated");

    }


    @When("User login into application with {string} and password {string}")
    public void userLoginIntoApplicationWithAndPassword(String arg0, String arg1) {
        System.out.println("User name = " + arg0 + "  Password = " + arg1);

    }


    @And("Cards are display are {string}")
    public void cardsAreDisplayAre(String arg0) {
        System.out.println(arg0);
    }

    @When("User sign up with following details")
    public void userSignUpWithFollowingDetails(DataTable data) {

        System.out.println(data.toString());
    }



    @When("User login into application with {} and passwordd {}")
    public void userLoginIntoApplicationWithAndPasswordd(String arg0, String arg1) {
        System.out.println(arg0);
    }

    @Given("validate the browser")
    public void validateTheBrowser(){
        System.out.println("brouser is trigered");

    }

    @When("Browser is triggered")
    public void browserIsTriggered() {
        System.out.println("brouser is trigered");

    }



    @Then("Check if browser is displayed")
    public void checkIfBrowserIsDisplayed() {
        System.out.println("browser is displayed");


    }

    @Given("User is on GreenCart Landing page")
    public void userIsOnGreenCartLandingPage() {

            System.setProperty("web-driver.chrome.driver", "src/test/java/chromedriver_linux64/chromedriver");
        testContextSetup.driver = new ChromeDriver();

           testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

            // Now you can use the WebDriver methods on the driver instance
            // Example: String pageTitle = driver.getTitle();



    }
    @When("User searched with Shortname {string} and extracted actual name of product")
    public void userSearchedWithShortnameAndExtractedActualNameOfProduct(String arg0) {
       testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(arg0);
        landingPageProductName =testContextSetup.driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();

        System.out.println("This is product name form landing page"+landingPageProductName);

    }


}
