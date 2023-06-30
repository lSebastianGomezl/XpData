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
import starter.questions.ValidationFormDiferentNumbersQuesion;
import starter.questions.ValidationFormEmptyOperatorFieldQuesion;
import starter.tasks.ValidationFormDiferentNumbersTask;
import starter.tasks.ValidationFormEmptyOperatorFieldTask;

import static org.hamcrest.Matchers.equalTo;

public class ValidationFormDiferentNumbersStepDefinitions {

    @Managed(driver = "Appium")

    public WebDriver hisMobileDevice;


    private final Actor Samuel = Actor.named("Samuel");


    @Before
    public void setUp(){
        Samuel.can(BrowseTheWeb.with(hisMobileDevice));
    }


    @Given("Samuel to send a form with different recharge numbers")
    public void samuelToSendAFormWithDifferentRechargeNumbers() {
        Samuel.wasAbleTo(

        );
    }
    @When("he enters the fields and presses the next button")
    public void heEntersTheFieldsAndPressesTheNextButton() {
        Samuel.wasAbleTo(
                ValidationFormDiferentNumbersTask.send()
        );
    }
    @Then("he should then see the text Los numeros a recargar no coinciden")
    public void heShouldThenSeeTheTextLosNumerosARecargarNoCoinciden() {
        String expectativeTitle = "Los numeros a recargar no coinciden";

        Samuel.should(
                GivenWhenThen.seeThat("Los numeros a recargar no coinciden", ValidationFormDiferentNumbersQuesion.value(),
                        equalTo(expectativeTitle))
        );

    }

}
