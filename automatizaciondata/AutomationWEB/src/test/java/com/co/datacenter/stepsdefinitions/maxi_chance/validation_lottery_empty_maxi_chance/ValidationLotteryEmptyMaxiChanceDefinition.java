package com.co.datacenter.stepsdefinitions.maxi_chance.validation_lottery_empty_maxi_chance;


import com.co.datacenter.questions.maxi_chance.data_maxi_chance.DataMaxiChanceQuestion;
import com.co.datacenter.questions.maxi_chance.validation_lottery_empty_maxi_chance.ValidationLotteryEmptyQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.maxi_chance.maxi_chance_element_frame.MaxiChanceElementIframeTask;
import com.co.datacenter.tasks.maxi_chance.validation_lottery_empty_maxi_chance.LotteryEmptyMaxiChanceTask;
import com.co.datacenter.tasks.maxi_chance.validation_value_empty_maxi_chance.ValueEmptyMaxiChanceTask;
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

public class ValidationLotteryEmptyMaxiChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp() {
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants to make lottery empty bets maxi chance$")
    public void sebastian_wants_to_make_lottery_empty_bets_maxi_chance() throws InterruptedException {
        /*
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);
        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on(),
                MaxiChanceElementIframeTask.on()
        );

         */
    }


    @When("^He makes the field lottery empty bets maxi chance$")
    public void he_makes_the_field_lottery_empty_bets_maxi_chance() {
        Sebas.wasAbleTo(
                LotteryEmptyMaxiChanceTask.on()
        );
    }

    @Then("^He should sees the title Validacion Seleccionar loteria$")
    public void he_should_sees_the_title_Validacion_Seleccionar_loteria() {
        System.out.println("El titulo de validacion es \n : " + ValidationLotteryEmptyQuestion.lotteryEmpty().answeredBy(Sebas));

    }

}






