package com.co.datacenter.stepsdefinitions.chance.validation_of_delete_game_chance;

import com.co.datacenter.questions.chance.validation_of_delete_game_chance.DeleteChanceQuestion;
import com.co.datacenter.tasks.chance.validation_of_delete_game_chance.DeleteChanceElementIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ValidationDeleteChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to delete a bet$")
    public void sebastianWantsToDeleteABet() throws InterruptedException {
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

    @When("^He deletes the bet$")
    public void heDeletesTheBet() {
        Sebas.wasAbleTo(
                DeleteChanceElementIframeTask.on()
        );
    }

    @Then("^He should sees the class change to next button$")
    public void heShouldSeesTheClassChangeToNextButton() {
        System.out.println("El estado del boton es bloqueado ?  \n el estado es: "+ DeleteChanceQuestion.deleteChance.answeredBy(Sebas));
    }


}
