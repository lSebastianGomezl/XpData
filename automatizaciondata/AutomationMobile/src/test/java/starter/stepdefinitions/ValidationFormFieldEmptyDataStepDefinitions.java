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
import starter.questions.ValidationFormFieldEmptyDataQuesion;
import starter.tasks.*;

import static org.hamcrest.Matchers.equalTo;

public class ValidationFormFieldEmptyDataStepDefinitions {

    @Managed(driver = "Appium")

    public WebDriver hisMobileDevice;


    private final Actor Samuel = Actor.named("Samuel");


    @Before
    public void setUp(){
        Samuel.can(BrowseTheWeb.with(hisMobileDevice));
    }


    @Given("Samuel wants to send the recharge")
    public void samuelWantsToSendTheRecharge() {
        Samuel.wasAbleTo(

        );
    }
    @When("he presses the next button")
    public void hePressesTheNexButton() {
        Samuel.wasAbleTo(
            ValidationFormFieldEmptyDataTask.send()
        );
    }
    @Then("he should see the text Confirma el número a recargar")
    public void heShouldSeeTheTextConfirmaElNumeroARecargar() {
        String expectativeTitle = "Confirma el número a recargar";

        Samuel.should(
                GivenWhenThen.seeThat("Confirma el número a recargar", ValidationFormFieldEmptyDataQuesion.value(),
                        equalTo(expectativeTitle))
        );

    }

}
