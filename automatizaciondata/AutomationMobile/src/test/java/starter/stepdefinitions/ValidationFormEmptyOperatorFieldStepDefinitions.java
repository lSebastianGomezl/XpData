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
import starter.questions.ValidationFormEmptyOperatorFieldQuesion;
import starter.questions.ValidationFormFieldEmptyDataQuesion;
import starter.tasks.ValidationFormEmptyOperatorFieldTask;
import starter.tasks.ValidationFormFieldEmptyDataTask;

import static org.hamcrest.Matchers.equalTo;

public class ValidationFormEmptyOperatorFieldStepDefinitions {

    @Managed(driver = "Appium")

    public WebDriver hisMobileDevice;


    private final Actor Samuel = Actor.named("Samuel");


    @Before
    public void setUp(){
        Samuel.can(BrowseTheWeb.with(hisMobileDevice));
    }


    @Given("Samuel wants to send the recharge without operator data")
    public void samuelWantsToSendTheRechargeWithoutOperatorData() {
        Samuel.wasAbleTo(

        );
    }
    @When("he introduce data fields and press the next button")
    public void heIntroduceDataFieldsAndPressTheNextButton() {
        Samuel.wasAbleTo(
            ValidationFormEmptyOperatorFieldTask.send()
        );
    }
    @Then("he should then see the title Selecciona un operador.")
    public void heShouldThenSeeTheTitleSeleccionaUnOperador() {
        String expectativeTitle = "Selecciona un operador.";

        Samuel.should(
                GivenWhenThen.seeThat("Selecciona un operador.", ValidationFormEmptyOperatorFieldQuesion.value(),
                        equalTo(expectativeTitle))
        );

    }

}
