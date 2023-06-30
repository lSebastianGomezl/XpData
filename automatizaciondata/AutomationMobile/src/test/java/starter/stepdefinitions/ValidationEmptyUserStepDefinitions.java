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
import starter.questions.ValidationEmptytPasswordQuestion;
import starter.questions.ValidationEmptytUserQuestion;
import starter.tasks.ValidationEmptyPasswordTask;
import starter.tasks.ValidationEmptyUserTask;

import static org.hamcrest.Matchers.equalTo;

public class ValidationEmptyUserStepDefinitions {


    @Managed(driver = "Appium")

    public WebDriver hisMobileDevice;



    private final Actor Samuel = Actor.named("Samuel");

    @Before

    public void setUp() {
        Samuel.can(BrowseTheWeb.with(hisMobileDevice));
    }



    @Given("Samuel to log in to the app")
    public void samuelToLogInToTheApp() {

    }
    @When("he submits submit credentials without a user")
    public void heSubmitsSubmitCredentialsWithoutAUser() {
        Samuel.wasAbleTo(
                ValidationEmptyUserTask.go()
        );
    }
    @Then("he should sees the text Debe ingresar un asesor")
    public void heShouldSeesTheTextDebeIngresarUnAsesor() {
        String expectedTitle = "Debe ingresar un asesor";
        Samuel.should(
                GivenWhenThen.seeThat("Debe ingresar un asesor", ValidationEmptytUserQuestion.value(),
                        equalTo(expectedTitle))
        );
    }
}
