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
import starter.questions.LoginFielValidationQuestion;
import starter.tasks.LoginFielValidationTask;
import starter.tasks.LoginTask;

import static org.hamcrest.Matchers.equalTo;

public class LoginFielValidationStepDefinitions {


    @Managed(driver = "Appium")

    public WebDriver hisMobileDevice;



    private final Actor Samuel = Actor.named("Samuel");

    @Before

    public void setUp() {
        Samuel.can(BrowseTheWeb.with(hisMobileDevice));
    }

    @Given("Samuel wants to access the application")
    public void samuelWantsToAccessTheApplication() {
        Samuel.wasAbleTo(
        );
    }
    @When("he submits credentials without data")
    public void heSubmitsCredentialsWithoutData() {
        Samuel.wasAbleTo(
                LoginFielValidationTask.go()
        );
    }
    @Then("he should see the text Debe ingresar un asesor")
    public void heShouldSeeTheTextDebeIngresarUnAsesor() {
        String expectedTitle = "Debe ingresar un asesor";
        Samuel.should(
                GivenWhenThen.seeThat("Debe ingresar un asesor", LoginFielValidationQuestion.value(),
                        equalTo(expectedTitle))
        );
    }
}
