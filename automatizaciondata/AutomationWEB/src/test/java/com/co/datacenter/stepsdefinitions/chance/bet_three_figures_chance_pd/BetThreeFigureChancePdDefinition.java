package com.co.datacenter.stepsdefinitions.chance.bet_three_figures_chance_pd;

import com.co.datacenter.questions.chance.bet_three_figure_chance_pd.BetThreeFigureChancePdQuestion;
import com.co.datacenter.tasks.chance.bet_three_figures_chance_pd.BetThreeFigurePdChanceTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class BetThreeFigureChancePdDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants make  three figure a chance pd$")
    public void sebastianWantsMakeThreeFigureAChancePd() throws InterruptedException {
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

    @When("^He makes three figure to chance pd$")
    public void heMakesThreeFigureToChancePd() {
        Sebas.wasAbleTo(

        BetThreeFigurePdChanceTask.on()
        );
    }

    @Then("^He should sees the text Pago exitoso$")
    public void heShouldSeesTheTextPagoExitoso() {
        System.out.println("Chance realizado exitosamente ?  \n el titulo de confirmacion es: "+ BetThreeFigureChancePdQuestion.betThreeFigurePdChance().answeredBy(Sebas));
    }


}
