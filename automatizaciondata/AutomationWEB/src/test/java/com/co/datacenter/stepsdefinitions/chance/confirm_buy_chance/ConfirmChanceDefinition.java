package com.co.datacenter.stepsdefinitions.chance.confirm_buy_chance;


import com.co.datacenter.questions.chance.confirm_chance.ConfirmChanceQuestion;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.OpenThePage;

import com.co.datacenter.tasks.chance.bet_four_figure_chance_spd.BetFourFigureSpdChanceTask;
import com.co.datacenter.tasks.chance.bet_four_figures_chance_spc.BetFourFigureSpcChanceTask;
import com.co.datacenter.tasks.chance.bet_three_figure_chance_una.BetThreeFigureUnaChanceTask;
import com.co.datacenter.tasks.chance.bet_three_figures_chance_pc.BetThreeFigurePcChanceTask;
import com.co.datacenter.tasks.chance.bet_three_figures_chance_pd.BetThreeFigurePdChanceTask;
import com.co.datacenter.tasks.chance.bet_three_figures_chance_pta.BetThreeFigurePtaChanceTask;
import com.co.datacenter.tasks.chance.bet_three_figures_chance_pta.BtnAcceptChanceTask;
import com.co.datacenter.tasks.chance.chance_element_iframe.ChanceElementIframeTask;
import com.co.datacenter.tasks.chance.confirm_chance.ConfirmChanceTask;
import com.co.datacenter.tasks.chance.data_chance_element_iframe.DataChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_bet_same_number_chance.BetSameNumberChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_of_add_game_chance.AddChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_of_add_max_game_chance.AddMaxChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_of_delete_game_chance.DeleteChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_of_max_value_chance.MaxValueChanceElementIframeTask;
import com.co.datacenter.tasks.chance.validation_of_min_value_chance.MinValueChanceElementIframeTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ConfirmChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

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
                BetFourFigureSpcChanceTask.on()
        );


        Thread.sleep(20000);

        Sebas.wasAbleTo(
                BtnAcceptChanceTask.on()
        );


        Sebas.wasAbleTo(
                Switch.toDefaultContext(),
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                ChanceElementIframeTask.on(),
                BetFourFigureSpdChanceTask.on()
        );

        Thread.sleep(20000);

        Sebas.wasAbleTo(
                BtnAcceptChanceTask.on()
        );

        Sebas.wasAbleTo(
                Switch.toDefaultContext(),
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                ChanceElementIframeTask.on(),
                BetThreeFigurePcChanceTask.on()

        );

        Thread.sleep(20000);


        Sebas.wasAbleTo(
                BtnAcceptChanceTask.on()
        );

        Sebas.wasAbleTo(
                Switch.toDefaultContext(),
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                ChanceElementIframeTask.on(),
                BetThreeFigurePdChanceTask.on()
        );
        Thread.sleep(20000);

        Sebas.wasAbleTo(
                BtnAcceptChanceTask.on()
        );

        Sebas.wasAbleTo(
                Switch.toDefaultContext(),
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                ChanceElementIframeTask.on(),
                BetThreeFigurePtaChanceTask.on()
        );

        Thread.sleep(20000);

        Sebas.wasAbleTo(
                BtnAcceptChanceTask.on()
        );

        Sebas.wasAbleTo(
               Switch.toDefaultContext(),
               SelectBetTask.on(),
               SwitchToIframeTask.on(),
               ChanceElementIframeTask.on(),
               BetThreeFigureUnaChanceTask.on()
        );



        Thread.sleep(20000);
        Sebas.wasAbleTo(
                BtnAcceptChanceTask.on()
        );



        Sebas.wasAbleTo(
                Switch.toDefaultContext(),
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
                DataChanceElementIframeTask.on()


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


}
