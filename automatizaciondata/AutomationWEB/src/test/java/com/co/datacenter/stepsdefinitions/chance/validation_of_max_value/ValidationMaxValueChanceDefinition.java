package com.co.datacenter.stepsdefinitions.chance.validation_of_max_value;

import com.co.datacenter.questions.chance.validation_of_max_value_chance.MaxValueChanceQuestion;
import com.co.datacenter.tasks.chance.validation_of_max_value_chance.MaxValueChanceElementIframeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ValidationMaxValueChanceDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");
    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian wants insert 1000000 how min value")
    public void sebastianWantsInsertHowMinValue() throws InterruptedException {
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


    @When("^He insert the 1000000 in the form")
    public void heInsertTheInTheForm() {
        Sebas.wasAbleTo(
                MaxValueChanceElementIframeTask.on()
        );
    }

    @Then("^He should sees the title Total tiquete no permitido")
    public void heShouldSeesTheTitleTotalTiqueteNoPermitido() {
        System.out.println("Alerta de validacion Total tiquete no permitido máximo $ 100000 ?  \n el titulo de la alerta es: "+ MaxValueChanceQuestion.maxValueChance().answeredBy(Sebas));
    }

    /*
    @Given("^Sebastian wants insert 50 how min value")
    public void sebastianWantsInsertHowMinValue() throws InterruptedException {
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


    @When("^He insert the 50 in the form")
    public void heInsertTheInTheForm() {
        Sebas.wasAbleTo(
                MinValueChanceElementIframeTask.on()
        );
    }

    @Then("^He should sees the title Total tiquete no permitido")
    public void heShouldSeesTheTitleTotalTiqueteNoPermitido() {
        System.out.println("Alerta de validacion Total tiquete no permitido minimo $ 700 ?  \n el titulo de la alerta es: "+ MinValueChanceQuestion.minValueChance().answeredBy(Sebas));
    }

     */



}
