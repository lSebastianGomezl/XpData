package com.co.datacenter.stepsdefinitions.paga_millonario.confirm_paga_millonario;


import com.co.datacenter.questions.paga_millonario.confirm_buy_paga_millonario.ConfirmPagaMillonarioQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.paga_millonario.bet_four_paga_millonario.BetFourOnePagePagaMillonarioTask;
import com.co.datacenter.tasks.paga_millonario.bet_four_paga_millonario.BetFourTwoPagePagaMillonarioTask;
import com.co.datacenter.tasks.paga_millonario.bet_three_paga_millonario.BetThreeOnePagePagaMillonarioTask;
import com.co.datacenter.tasks.paga_millonario.bet_three_paga_millonario.BetThreeTwoPagePagaMillonarioTask;
import com.co.datacenter.tasks.paga_millonario.confirm_buy_paga_millonario.ConfirmPagaMillonarioTask;
import com.co.datacenter.tasks.paga_millonario.select_paga_millonario.SelectPagaMillonarioTask;
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

public class ConfimPagaMillonarioDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to confirm a paga millonario$")
    public void sebastianWantsToConfirmAPagaMillonario() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(50000);
        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                SelectPagaMillonarioTask.on()
        );

        Thread.sleep(4000);

        Sebas.wasAbleTo(
                BetThreeOnePagePagaMillonarioTask.on(),
                BetThreeTwoPagePagaMillonarioTask.on()
        );

        Sebas.wasAbleTo(
                ConfirmPagaMillonarioTask.on()
        );
        Sebas.wasAbleTo(
                Switch.toDefaultContext(),
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                SelectPagaMillonarioTask.on()
        );

        Sebas.wasAbleTo(
                BetFourOnePagePagaMillonarioTask.on(),
                BetFourTwoPagePagaMillonarioTask.on()
        );

    }


    @When("^He confirm the paga millonario$")
    public void heConfirmThePagaMillonario() {
        Sebas.wasAbleTo(
                ConfirmPagaMillonarioTask.on()
        );
    }

    @Then("^He should sees the title Pago exitoso$")
    public void heShouldSeesTheTitlePagoExitoso() {
        System.out.println("El titulo de validacion es : \n " + ConfirmPagaMillonarioQuestion.confirmPagaMillonario().answeredBy(Sebas).equals("Pago exitoso"));
    }

}
