package stepDefinitions;

import org.openqa.selenium.WebDriver;

public class FeatureBStep {

    private WebDriver driver = null;

    // PicoContainer injects BaseStep class
    public FeatureBStep(BaseStep baseStep) {
        this.driver = baseStep.driver;
    }
//
//    @When
//    @Then
}
