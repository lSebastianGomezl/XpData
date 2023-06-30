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
import starter.questions.ValidationFormEmptyOtheValueQuesion;
import starter.tasks.ValidationFormDiferentNumbersTask;
import starter.tasks.ValidationFormOtherValueTask;

import static org.hamcrest.Matchers.equalTo;

public class ValidationFormOtherValueStepDefinitions {

    @Managed(driver = "Appium")

    public WebDriver hisMobileDevice;


    private final Actor Samuel = Actor.named("Samuel");


    @Before
    public void setUp(){
        Samuel.can(BrowseTheWeb.with(hisMobileDevice));
    }


    @Given("Samuel wants to send the recharge without input data of another value")
    public void samuelWantsToSendTheRechargeWithoutInputDataOfAnotherValue() {

    }
    @When("he enter data fields and press the next button")
    public void heEnterDataFieldsAndPressTheNextButton() {
        Samuel.wasAbleTo(
                ValidationFormOtherValueTask.send()
        );
    }
    @Then("he should then see the title Digita el valor a recargar")
    public void heShouldThenSeeTheTitleDigitaElValorARecargar() {
        String expectativeTitle = "Digita el valor a recargar";

        Samuel.should(
               GivenWhenThen.seeThat("Digita el valor a recargar", ValidationFormEmptyOtheValueQuesion.value(),
                        equalTo(expectativeTitle))
        );

    }




}
