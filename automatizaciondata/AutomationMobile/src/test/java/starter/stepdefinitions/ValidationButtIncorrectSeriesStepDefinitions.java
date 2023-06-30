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
import starter.questions.ValidationButtEmptyQuestion;
import starter.questions.ValidationButtIncorrectQuestion;
import starter.tasks.LoginTask;
import starter.tasks.ValidationButtEmptyTask;
import starter.tasks.ValidationButtIncorrectDataTask;

import static org.hamcrest.Matchers.equalTo;

public class ValidationButtIncorrectSeriesStepDefinitions {


    @Managed(driver = "Appium")

    public WebDriver hisMobileDevice;



    private final Actor Samuel = Actor.named("Samuel");

    @Before

    public void setUp() {
        Samuel.can(BrowseTheWeb.with(hisMobileDevice));
    }

    @Given("he wants to go to the services by entering incorrect data")
    public void heWantsToGoToTheServicesByEnteringIncorrectData() {
        Samuel.wasAbleTo(
        );
    }
    @When("he presses the next button incorrect date series")
    public void hePressesTheNextButtonIncorrectDateSeries() {
        Samuel.wasAbleTo(
                ValidationButtIncorrectDataTask.on()
        );
    }
    @Then("he should see the text No se pudo guardar la colilla, por favor vuelva a intentarlo.")
    public void heShouldSeeTheTextNoSePudoGuardarLaColillaPorFavorVuelvaIntentarlo() {
        String expectedTitle = "No se pudo guardar la colilla, por favor vuelva a intentarlo.";
        Samuel.should(
                GivenWhenThen.seeThat("No se pudo guardar la colilla, por favor vuelva a intentarlo.", ValidationButtIncorrectQuestion.value(),
                        equalTo(expectedTitle))
        );
    }
}
