package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.tasks.DashBoardTask;
import starter.tasks.DigitalpaperTask;
import starter.tasks.LoginTask;
import starter.tasks.SelectRefillTask;

public class SelectRefillStepDefinitions {

    @Managed(driver = "Appium")

    public WebDriver hisMobileDevice;

    private final Actor Samuel = Actor.named("Samuel");

    @Before
    public void setUp() {
        Samuel.can(BrowseTheWeb.with(hisMobileDevice));
    }

    @Given("Samuel wants to do a recharge")
    public void samuelWantsToDoARecharge() {
        Samuel.wasAbleTo(
                LoginTask.in(),
                DigitalpaperTask.on(),
                DashBoardTask.done()
        );
    }
    @When("he selects the recharge and package service")
    public void heSelectsTheRechargeAndPackageService() {
        Samuel.wasAbleTo(
                SelectRefillTask.select()
        );
    }
    @Then("He should see form of information")
    public void heShouldSeeFormOfInformation() {

    }

}
