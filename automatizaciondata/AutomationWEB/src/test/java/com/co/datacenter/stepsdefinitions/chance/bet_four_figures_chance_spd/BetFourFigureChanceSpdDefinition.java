package com.co.datacenter.stepsdefinitions.chance.bet_four_figures_chance_spd;

import com.co.datacenter.questions.chance.bet_four_figure_chance_spd.BetFourFigureChanceSpdQuestion;
import com.co.datacenter.tasks.chance.bet_four_figure_chance_spd.BetFourFigureSpdChanceTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class BetFourFigureChanceSpdDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Sebastian wants make  four figure a chance$")
    public void sebastianWantsMakeFourFigureAChance() throws InterruptedException {
        Sebas.wasAbleTo(
                /*
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);

        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                ChanceElementIframeTask.on()

                 */

        );
    }


    @When("^He makes four figure to chance$")
    public void heMakesFourFigureToChance()  {
       Sebas.wasAbleTo(
               BetFourFigureSpdChanceTask.on()
       );
    }

    @Then("^He should sees the text Pago exitoso$")
    public void heShouldSeesTheTextPagoExitoso() {
        System.out.println("Chance realizado exitosamente ?  \n el titulo de confirmacion es: "+ BetFourFigureChanceSpdQuestion.betFourFigureChance().answeredBy(Sebas));
    }

    /*
    @Given("^Sebastian wants to confirm a chance$")
    public void sebastianWantsToConfirmAChance() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);

        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                ChanceElementIframeTask.on(),
                MinValueChanceElementIframeTask.on(),
                MaxValueChanceElementIframeTask.on(),
                DeleteChanceElementIframeTask.on(),
                DeleteChanceElementIframeTask.on(),
                BetSameNumberChanceElementIframeTask.on(),
                DeleteChanceElementIframeTask.on(),
                AddMaxChanceElementIframeTask.on(),
                DeleteChanceElementIframeTask.on(),
                DeleteChanceElementIframeTask.on(),
                AddChanceElementIframeTask.on(),
                DeleteChanceElementIframeTask.on(),
                DataChanceElementIframeTask.on(),
                ConfirmChanceTask.on()


        );
    }


    @When("^He confirm the chance$")
    public void heConfirmTheChance() {
        Sebas.wasAbleTo(
                ConfirmChanceTask.on()
        );
    }

    @Then("^He should sees the title Pago exitoso$")
    public void heShouldSeesTheTitlePagoExitoso() {
        System.out.println("Chance realizado exitosamente ?  \n el titulo de confirmacion es: "+ ConfirmChanceQuestion.confirmChance().answeredBy(Sebas));
    }

     */


}
