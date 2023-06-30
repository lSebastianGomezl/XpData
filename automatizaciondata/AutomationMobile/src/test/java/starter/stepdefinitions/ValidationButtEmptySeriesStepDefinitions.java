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
import starter.questions.ValidationIncorrectDataQuestion;
import starter.tasks.LoginFielValidationTask;
import starter.tasks.LoginTask;
import starter.tasks.ValidationButtEmptyTask;
import starter.tasks.ValidationIncorrectDataTask;

import static org.hamcrest.Matchers.equalTo;

public class ValidationButtEmptySeriesStepDefinitions {


    @Managed(driver = "Appium")

    public WebDriver hisMobileDevice;



    private final Actor Samuel = Actor.named("Samuel");

    @Before

    public void setUp() {
        Samuel.can(BrowseTheWeb.with(hisMobileDevice));
    }

    @Given("Samuel wants to go to services without entering strings")
    public void samuelWantsToGoToServicesWithoutEnteringStrings() {
        Samuel.wasAbleTo(

        );
    }
    @When("he presses the next button without series")
    public void hePressesTheNextButtonWithoutSeries() {
        Samuel.wasAbleTo(
                ValidationButtEmptyTask.on()
        );
    }
    @Then("he should see the text Debe ingresar las series de las colillas.")
    public void heShouldSeeTheTextDebeIngresarLasSeriesDeLasColillas() {
        String expectedTitle = "Debe ingresar";
        Samuel.should(
                GivenWhenThen.seeThat("Debe ingresar las series de las colillas.", ValidationButtEmptyQuestion.value(),
                        equalTo(expectedTitle))
        );
    }
}
