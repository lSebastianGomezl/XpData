package com.co.datacenter.stepsdefinitions.combo_millonario.select_combo_millonario;


import com.co.datacenter.questions.chance_millonario.select_chance_millonario.SelectChanceMillonarioQuestion;
import com.co.datacenter.questions.combo_millonario.select_combo_millonario.SelectComboMillonarioQuestion;
import com.co.datacenter.tasks.OpenThePage;
import com.co.datacenter.tasks.chance_millonario.select_chance_millonario.SelectChanceMillonarioTask;
import com.co.datacenter.tasks.combo_millonario.select_combo_millonario.SelectComboMillonarioTask;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
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

public class SelectComboMillonarioDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp() {
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian in the combo millonario  page$")
    public void sebastianInTheComboMillonarioPage() throws InterruptedException {
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

    @When("^He select combo millonario service$")
    public void heSelectComboMillonarioService() {
        Sebas.wasAbleTo(
                SelectComboMillonarioTask.on()
        );
    }

    @Then("^He should sees the title MI JUEGO$")
    public void heShouldSeesTheTitleMIJUEGO() {
        System.out.println("Bienvenido a el servicio de combo millonario ?  \n el titulo de bievenida es: " + SelectComboMillonarioQuestion.selectComboMillonario().answeredBy(Sebas));

    }
}
