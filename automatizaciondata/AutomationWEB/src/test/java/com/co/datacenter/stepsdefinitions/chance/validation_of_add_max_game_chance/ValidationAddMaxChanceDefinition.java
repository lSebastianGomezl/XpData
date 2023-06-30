package com.co.datacenter.stepsdefinitions.chance.validation_of_add_max_game_chance;

import com.co.datacenter.questions.chance.validation_of_add_max_game_chance.AddMaxChanceQuestion;
import com.co.datacenter.tasks.chance.validation_of_add_max_game_chance.AddMaxChanceElementIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ValidationAddMaxChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to make maximum bets$")
    public void sebastianWantsToMakeMaximumBets() throws InterruptedException {
        /*
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);

        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                ChanceElementIframeTask.on()
        );


         */

    }


    @When("^He makes the maximum bets$")
    public void heMakesTheMaximumBets() {
        Sebas.wasAbleTo(
            AddMaxChanceElementIframeTask.on()
        );

    }

    @Then("^He should sees the class change to button$")
    public void heShouldSeesTheClassChangeToButton() {
        System.out.println("El titulo de la alerta es No se Permiten Mas de 5 Juegos ?  \n el estado es: "+ AddMaxChanceQuestion.addMaxChance().answeredBy(Sebas));
    }




}
