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
import starter.questions.LoginQuestion;
import starter.tasks.LoginTask;

import static org.hamcrest.Matchers.equalTo;

public class LogInStepDefinitions {
    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    //Implementado
    private final Actor Samuel = Actor.named("Samuel");

    //Implementado
    @Before
    //public void set_the_stage() {
    //    OnStage.setTheStage(new OnlineCast());
    //}
    public void setUp() {
        Samuel.can(BrowseTheWeb.with(hisMobileDevice));
    }


    @Given("Samuel wants to access the services")
    public void samuelWantsToAccessTheServices() {

        Samuel.attemptsTo(

        );

    }

    @When("he sends his credentials")
    public void sendsHisCredentials() throws InterruptedException {
        Samuel.wasAbleTo(
                LoginTask.in());
    }

    @Then("He should see title digita la colilla")
    public void shouldSeeTitleDigitaLaColilla(){
        String expectedTitle = "Digita la Colilla";
        Samuel.should(
                GivenWhenThen.seeThat("Digita la Colilla", LoginQuestion.value(),
                        equalTo(expectedTitle))
        );
    }

}
