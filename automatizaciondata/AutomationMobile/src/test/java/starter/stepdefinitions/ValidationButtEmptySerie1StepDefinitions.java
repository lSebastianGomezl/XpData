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
import starter.questions.ValidationButtEmptySerie1Question;
import starter.tasks.ValidationButtEmptySerie1Task;
import starter.tasks.ValidationButtEmptyTask;

import static org.hamcrest.Matchers.equalTo;

public class ValidationButtEmptySerie1StepDefinitions {


    @Managed(driver = "Appium")

    public WebDriver hisMobileDevice;



    private final Actor Samuel = Actor.named("Samuel");

    @Before

    public void setUp() {
        Samuel.can(BrowseTheWeb.with(hisMobileDevice));
    }

    @Given("Samuel wants to go to the services with series1 without data")
    public void samuelWantsToGoToServicesWithSeries1WithoutData() {
        Samuel.wasAbleTo(
        );
    }
    @When("he presses the next button without serial1 data")
    public void hePressesTheNextButtonWithoutSerial1Data() {
        Samuel.wasAbleTo(
                ValidationButtEmptySerie1Task.on()
        );
    }
    @Then("he should sees the title Debe ingresar las series de las colillas.")
    public void heShouldSeeTheTitleDebeIngresarLasSeriesDeLasColillas() {
        String expectedTitle = "Debe ingresar las series de las colillas.";
        Samuel.should(
                GivenWhenThen.seeThat("Debe ingresar las series de las colillas.", ValidationButtEmptySerie1Question.value(),
                        equalTo(expectedTitle))
        );
    }
}
