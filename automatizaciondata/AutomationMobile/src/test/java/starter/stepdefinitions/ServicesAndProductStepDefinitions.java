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

public class ServicesAndProductStepDefinitions {


    @Managed(driver = "Appium")

    public WebDriver hisMobileDevice;

    private final Actor Samuel = Actor.named("Samuel");

    //Implementado
    @Before
    public void setUp() {
        Samuel.can(BrowseTheWeb.with(hisMobileDevice));
    }

    @Given("Samuel wants to select the services")
    public void samuelWantsToSelectTheServices() {
        Samuel.wasAbleTo(
                LoginTask.in(),
                DigitalpaperTask.on()
        );
    }
    @When("he select the services and product")
    public void heSelectTheServicesAndProduct() {
        Samuel.wasAbleTo(
                DashBoardTask.done()
        );
    }
    @Then("He should see title recargas")
    public void heShouldSeeTitleRecargas() {

    }



}
