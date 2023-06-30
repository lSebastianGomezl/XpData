package com.co.datacenter.stepsdefinitions.maxi_chance.data_maxi_chance;


import com.co.datacenter.questions.maxi_chance.data_maxi_chance.DataMaxiChanceQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.maxi_chance.data_maxi_chance.DataMaxiChanceTask;
import com.co.datacenter.tasks.maxi_chance.maxi_chance_element_frame.MaxiChanceElementIframeTask;
import com.co.datacenter.tasks.select_bets.SelectBetTask;
import com.co.datacenter.tasks.super_astro.select_super_astro.SelectSuperAstroTask;
import com.co.datacenter.tasks.switch_iframe.SwitchToIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import javax.xml.crypto.Data;

public class DataMaxiChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }



    @Given("^Sebastian wants to take a maxichance$")
    public void sebastianWantsToTakeAMaxichance() throws InterruptedException {
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
    }


    @When("^He insert the data in the form$")
    public void heInsertTheDataInTheForm() {
        Sebas.wasAbleTo(
                DataMaxiChanceTask.on()
        );
    }

    @Then("^He should sees the title Confirmación de compra$")
    public void heShouldSeesTheTitleConfirmaciónDeCompra() {
        System.out.println("El titulo de validacion es Confirmacion de compra ?" +
                " \n El titulo es : " + DataMaxiChanceQuestion.dataMaxiChance().answeredBy(Sebas));
    }

}
