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
import starter.questions.AvoidRechargeQuestion;
import starter.tasks.*;

import static org.hamcrest.Matchers.equalTo;

public class AvoidRechargeStepDefinitions {

    @Managed(driver = "Appium")

    public WebDriver hisMobileDevice;


    private final Actor Samuel = Actor.named("Samuel");


    @Before
    public void setUp(){
        Samuel.can(BrowseTheWeb.with(hisMobileDevice));
    }


    @Given("Samuel wants to avoid a recharge")
    public void samuelWantsToAvoidARecharge() {
        Samuel.wasAbleTo(
                LoginFielValidationTask.go(),
                ValidationIncorrectDataTask.go(),
                ValidationEmptyUserTask.go(),
                ValidationEmptyPasswordTask.go(),
                LoginTask.in(),
                ValidationButtEmptyTask.on(),
                ValidationButtEmptySerie1Task.on(),
                ValidationButtEmptySerie2Task.on(),
                ValidationButtIncorrectDataTask.on(),
                DigitalpaperTask.on(),
                DashBoardTask.done(),
                SelectRefillTask.select(),
                ValidationFormFieldEmptyDataTask.send(),
                ValidationFormEmptyOperatorFieldTask.send(),
                ValidationFormDiferentNumbersTask.send(),
                ValidationFormOtherValueTask.send()
        );
    }
    @When("he enters the information in the form and avoid")
    public void heEntersTheInformationInTheFormAndAvoid() {
        Samuel.wasAbleTo(
                AvoidRechargeTask.avoid()
        );
    }
    @Then("He should see text recarga exitosa")
    public void heShouldSeeTextRecargaExitosa() {
        String expectativeTitle = "Recarga exitosa.";

        Samuel.should(
                GivenWhenThen.seeThat("Recarga exitosa.", AvoidRechargeQuestion.value(),
                        equalTo(expectativeTitle))
        );

    }

}
