package com.co.datacenter.stepsdefinitions.maxi_chance.select_maxi_chance;


import com.co.datacenter.questions.chance.select_chance.SelectChanceQuestion;
import com.co.datacenter.questions.maxi_chance.select_maxi_chance.SelectMaxiChanceQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.chance.chance_element_iframe.ChanceElementIframeTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.maxi_chance.maxi_chance_element_frame.MaxiChanceElementIframeTask;
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

public class SelectMaxiChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian in the maxi chance  page$")
    public void sebastianInTheMaxiChancePage() throws InterruptedException {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                LoginUserTask.on()
        );
        Thread.sleep(40000);
        Sebas.wasAbleTo(
                SelectBetTask.on(),
                SwitchToIframeTask.on()
        );
    }

    @When("^He select maxi chance service$")
    public void heSelectMaxiChanceService() {
        Sebas.wasAbleTo(
                MaxiChanceElementIframeTask.on()
        );
    }

    @Then("^He should sees the title MI JUEGO$")
    public void heShouldSeesTheTitleMIJUEGO() {
        System.out.println("Bienvenido a el servicio de maxi chance ?  \n el titulo de bievenida es: "+ SelectMaxiChanceQuestion.selectMaxiChance().answeredBy(Sebas));
    }


}
