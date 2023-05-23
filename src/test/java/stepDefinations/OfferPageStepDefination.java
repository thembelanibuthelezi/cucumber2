package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.TestContextSetup;

import java.util.Iterator;
import java.util.Set;

public class OfferPageStepDefination {
    TestContextSetup testContextSetup;
    String offerPageProductName;

    public  OfferPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
    }

    @Then("User searched for {string} shortname in offers page to check if product exist")
    public void userSearchedForShortnameInOffersPageToCheckIfProductExist(String arg0) throws InterruptedException {

        testContextSetup.driver.findElement(By.linkText(("Top Deals"))).click();
        Set<String> s1 = testContextSetup.driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();
        testContextSetup.driver.switchTo().window(childWindow);
        testContextSetup.driver.findElement(By.xpath("//input[@type ='search']")).sendKeys(arg0);
        Thread.sleep(5000);
        offerPageProductName = testContextSetup.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();


    }

    @And("Validate product name in offers matches with Landing Page")
    public void validateProductNameInOffersMatchesWithLandingPage() {
        System.out.println(offerPageProductName);

        System.out.println(testContextSetup.landingPageProductName);

    }


}
