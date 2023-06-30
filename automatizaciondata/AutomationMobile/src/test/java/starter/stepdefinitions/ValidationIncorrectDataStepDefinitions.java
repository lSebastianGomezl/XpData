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
import starter.questions.ValidationIncorrectDataQuestion;
import starter.tasks.ValidationIncorrectDataTask;

import static org.hamcrest.Matchers.equalTo;

public class ValidationIncorrectDataStepDefinitions {


    @Managed(driver = "Appium")

    public WebDriver hisMobileDevice;



    private final Actor Samuel = Actor.named("Samuel");

    @Before

    public void setUp() {
        Samuel.can(BrowseTheWeb.with(hisMobileDevice));
    }

    @Given("Samuel wants to access the app")
    public void samuelWantsToAccessTheApp() {
        Samuel.wasAbleTo(
        );
    }
    @When("he submits credentials incorrect data")
    public void heSubmitsCredentialsIncorrectData() {
        Samuel.wasAbleTo(
                ValidationIncorrectDataTask.go()
        );
    }
    @Then("he should see the text El vendedor no existe")
    public void heShouldSeeTheTextElVendedorNoExiste() {
        String expectedTitle = "El vendedor no existe";
        Samuel.should(
                GivenWhenThen.seeThat("El vendedor no existe", ValidationIncorrectDataQuestion.value(),
                        equalTo(expectedTitle))
        );
    }
}
