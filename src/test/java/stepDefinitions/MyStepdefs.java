package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyStepdefs {

    @Given("^user opens browser$")
    public void userOpensBrowser() throws Throwable {
        System.out.println("\n" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
    }

    @Then("^landing page is home page verify by title$")
    public void landingPageIsHomePageVerifyByTitle() throws Throwable {
        System.out.println("\n" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
    }

    @Given("^user reach to login page by clicking login button on home page$")
    public void userReachToLoginPageByClickingLoginButtonOnHomePage() throws Throwable {
        System.out.println("\n" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
    }

    @Then("^validate login page title$")
    public void validateLoginPageTitle() throws Throwable {
        System.out.println("\n" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
    }

    @Then("^user enters username and password$")
    public void userEntersUsernameAndPassword() throws Throwable {
        System.out.println("\n" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
    }

    @Then("^user clicks on sign in button$")
    public void userClicksOnSignInButton() throws Throwable {
        System.out.println("\n" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
    }

    @Then("^validate my programs page is displayed by page title$")
    public void validateMyProgramsPageIsDisplayedByPageTitle() throws Throwable {
        System.out.println("\n" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
    }

    @Then("^validate logged in username$")
    public void validateLoggedInUsername() throws Throwable {
        System.out.println("\n" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
    }

    @Given("^user is on my programs page$")
    public void userIsOnMyProgramsPage() throws Throwable {
        System.out.println("\n" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
    }

    @Then("^user clicks on biology link$")
    public void userClicksOnBiologyLink() throws Throwable {
        System.out.println("\n" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
    }

    @Then("^user should navigated to biology subject activity section$")
    public void userShouldNavigatedToBiologySubjectActivitySection() throws Throwable {
        System.out.println("\n" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
    }

    @Given("^User is on$")
    public void userIsOn() throws Throwable {
        System.out.println("\n" + Thread.currentThread().getStackTrace()[1].getMethodName() + "\n");
    }
}
