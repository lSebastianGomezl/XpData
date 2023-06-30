package com.co.datacenter.stepsdefinitions.super_chance.validation_of_add_max_super_chance;


import com.co.datacenter.questions.super_chance.add_max_super_chance.AddMaxSuperChanceQuestion;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.super_chance.select_super_chance.SuperChanceElementIframeTask;
import com.co.datacenter.tasks.super_chance.validation_add_max_super_chance.AddMaxSuperChanceTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ValidationAddMaxSuperChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp() {
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to make maximum bets super chance$")
    public void sebastianWantsToMakeMaximumBetsSuperChance() throws InterruptedException {
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


    @When("^He makes the maximum bets super chance$")
    public void heMakesTheMaximumBetsSuperChance() {
        Sebas.wasAbleTo(
                AddMaxSuperChanceTask.on()
        );
    }

    @Then("^He should sees the title Máximo Numeros$")
    public void heShouldSeesTheTitleMáximoNumeros() {
        System.out.println("Alerta de validacion Máximo 5 Numeros ?  \n el titulo de la alerta es: " + AddMaxSuperChanceQuestion.addMaxSuperChance().answeredBy(Sebas));

    }

}






