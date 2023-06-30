package com.co.datacenter.stepsdefinitions.chance.bet_four_figures_chance_spc;


import com.co.datacenter.questions.chance.bet_four_figure_chance_spc.BetFourFigureChanceSpcQuestion;

import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.OpenThePage;

import com.co.datacenter.tasks.chance.bet_four_figures_chance_spc.BetFourFigureSpcChanceTask;
import com.co.datacenter.tasks.chance.chance_element_iframe.ChanceElementIframeTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class BetFourFigureChanceSpcDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants make  four figure a chance spc$")
    public void sebastianWantsMakeFourFigureAChanceSpc() throws InterruptedException {
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
    }

    @When("^He makes four figure to chance spc$")
    public void heMakesFourFigureToChanceSpc() {
        Sebas.wasAbleTo(BetFourFigureSpcChanceTask.on()
        );
    }

    @Then("^He should sees the text Pago exitoso$")
    public void heShouldSeesTheTextPagoExitoso() {
        System.out.println("Chance realizado exitosamente ?  \n el titulo de confirmacion es: "+ BetFourFigureChanceSpcQuestion.betFourFigureChanceSpc().answeredBy(Sebas));
    }



}
