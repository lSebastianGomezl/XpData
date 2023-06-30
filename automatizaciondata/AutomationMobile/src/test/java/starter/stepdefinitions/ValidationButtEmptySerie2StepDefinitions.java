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
import starter.questions.ValidationButtEmptySerie2Question;
import starter.tasks.ValidationButtEmptySerie1Task;
import starter.tasks.ValidationButtEmptySerie2Task;

import static org.hamcrest.Matchers.equalTo;

public class ValidationButtEmptySerie2StepDefinitions {


    @Managed(driver = "Appium")

    public WebDriver hisMobileDevice;



    private final Actor Samuel = Actor.named("Samuel");

    @Before

    public void setUp() {
        Samuel.can(BrowseTheWeb.with(hisMobileDevice));
    }

    @Given("Samuel wants to go to the services with series2 without data")
    public void samuelWantsToGoToServicesWithSeries2WithoutData() {
        Samuel.wasAbleTo(
        );
    }
    @When("he presses the next button without serial2 data")
    public void hePressesTheNextButtonWithoutSerial2Data() {
        Samuel.wasAbleTo(
                ValidationButtEmptySerie2Task.on()
        );
    }
    @Then("he should sees the title with text Debe ingresar las series de las colillas.")
    public void heShouldSeeTheTitleWithTextDebeIngresarLasSeriesDeLasColillas() {
        String expectedTitle = "Debe ingresar las series de las colillas.";
        Samuel.should(
                GivenWhenThen.seeThat("Debe ingresar las series de las colillas.", ValidationButtEmptySerie2Question.value(),
                        equalTo(expectedTitle))
        );
    }
}
