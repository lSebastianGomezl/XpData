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
import starter.tasks.LoginFielValidationTask;
import starter.tasks.ValidationEmptyPasswordTask;
import starter.tasks.ValidationIncorrectDataTask;

import static org.hamcrest.Matchers.equalTo;

public class ValidationEmptyPasswordStepDefinitions {


    @Managed(driver = "Appium")

    public WebDriver hisMobileDevice;



    private final Actor Samuel = Actor.named("Samuel");

    @Before

    public void setUp() {
        Samuel.can(BrowseTheWeb.with(hisMobileDevice));
    }

    @Given("Samuel to log in to the application")
    public void samuelWantsToLogTheApplication() {
        Samuel.wasAbleTo(

        );
    }
    @When("he submits submit credentials without a password")
    public void heSubmitsCredentialsWithoutData() {
        Samuel.wasAbleTo(
                ValidationEmptyPasswordTask.go()
        );


    }
    @Then("he should see the text Debe ingresar una contrase")
    public void heShouldSeeTheTextDebeIngresarUnaContrase() {
        String expectedTitle = "Debe ingresar una contrase";
        Samuel.should(
                GivenWhenThen.seeThat("Debe ingresar una contrase", ValidationEmptytPasswordQuestion.value(),
                        equalTo(expectedTitle))
        );
    }
}
