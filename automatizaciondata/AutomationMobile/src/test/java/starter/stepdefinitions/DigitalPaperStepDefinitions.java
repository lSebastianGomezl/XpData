package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.questions.DigitalPaperQuestion;
import starter.tasks.DigitalpaperTask;
import starter.tasks.LoginTask;

import static org.hamcrest.Matchers.equalTo;

public class DigitalPaperStepDefinitions {

    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;


    private final Actor Samuel = Actor.named("Samuel");

    @Before

    public void setUp() {
        Samuel.can(BrowseTheWeb.with(hisMobileDevice));
    }


    @Given("Samuel wants to type the butt")
    public void samuelWantsToTypeTheButt() {
        Samuel.wasAbleTo(
                LoginTask.in()
        );
    }
    @When("he sends stationery credentials")
    public void heSendsStationeryCredentials() {
        Samuel.wasAbleTo(
                DigitalpaperTask.on()
        );
    }
    //@Then("He should see button aceptar")
    //public void heShouldSeeButtonAceptar() {
     //   String expectedTitle = "Asesor";
       // Samuel.should(
        //        GivenWhenThen.seeThat("Asesor", DigitalPaperQuestion.value(),
        //                equalTo(expectedTitle))
        //);
    }

