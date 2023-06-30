package com.co.datacenter.stepsdefinitions.super_chance.validation_min_value_super_chance;


import com.co.datacenter.questions.super_chance.validation_min_value_super_chance.MinValueSuperChanceQuestion;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.super_chance.select_super_chance.SuperChanceElementIframeTask;
import com.co.datacenter.tasks.super_chance.validation_min_value_super_chance.MinValueSuperChanceTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ValidationMinValueSuperChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp() {
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants insert min value$")
    public void sebastianWantsInsertMinValue() throws InterruptedException {
        Sebas.wasAbleTo(

                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);

        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                SuperChanceElementIframeTask.on()
        );
    }


    @When("^He insert the min value in the form$")
    public void heInsertTheMinValueInTheForm() {
        Sebas.wasAbleTo(
                MinValueSuperChanceTask.on()
        );
    }

    @Then("^He should sees the title Total tiquete no permitido$")
    public void heShouldSeesTheTitleTotalTiqueteNoPermitido() {
        System.out.println("Alerta de validacion Total tiquete no permitido minimo $ 700 ?  \n el titulo de la alerta es: " + MinValueSuperChanceQuestion.minValueSuperChance().answeredBy(Sebas));
    }

}






