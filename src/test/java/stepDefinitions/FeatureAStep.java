package stepDefinitions;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;


public class FeatureAStep {

    private WebDriver driver = null;

    // PicoContainer injects stepDefinitions.BaseStep class
    public FeatureAStep(BaseStep baseStep) {
        System.out.println("Driver is: \"" + baseStep.driver + "\"");
        this.driver = baseStep.driver;
    }

    @Given("^I am at the Login page$")
    public void givenIAmAtTheLoginPage() throws Exception {
//        driver.get(ConfigUtil.readKey("base_url"));
        System.out.println("Driver is: \"" + driver + "\"");
        driver.get("http://google.com/");
    }

//    @When
//    @When
//    @Then
//    @Then
}
