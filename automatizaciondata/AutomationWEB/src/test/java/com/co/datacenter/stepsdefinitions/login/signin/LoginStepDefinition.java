package com.co.datacenter.stepsdefinitions.login.signin;



import com.co.datacenter.questions.login.signin.LoginUserQuestion;
import com.co.datacenter.tasks.login.signin.LoginUserTask;
import com.co.datacenter.tasks.login.validation_of_empty_briefcase.BriefCaseTask;
import com.co.datacenter.tasks.login.validation_of_empty_email.EmailTask;
import com.co.datacenter.tasks.login.validation_of_empty_password.EmptyPasswordTask;
import com.co.datacenter.tasks.login.validation_of_empty_policy.EmptyPolicyTask;
import com.co.datacenter.tasks.login.validation_of_empty_terms.EmptyTermsTask;
import com.co.datacenter.tasks.login.validation_of_incorrect_data_login.IncorrectDataLoginTask;
import com.co.datacenter.tasks.OpenThePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinition {

    @Managed(driver = "chrome")

    private WebDriver hisBrowser;


    private Actor Sebas = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebas.can(BrowseTheWeb.with(hisBrowser));
    }



    @Given("^Sebastian in the my account page$")
    public void sebastianInTheMyAccountPage() {
        Sebas.wasAbleTo(
                OpenThePage.on(),
                IncorrectDataLoginTask.on()

        );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Sebas.wasAbleTo(
                EmptyPasswordTask.on(),
                EmailTask.on()
        );
        Sebas.wasAbleTo(
                EmptyTermsTask.on(),
                BriefCaseTask.on(),
                EmptyPolicyTask.on()
        );

    }

    @When("^He fills in the form login$")
    public void heFillsInTheFormLogin(){
        Sebas.wasAbleTo(LoginUserTask.on());

        try {
            Thread.sleep(40000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Then("^He should into page Paga todo$")
    public void heShouldIntoPagePagaTodo() {
        System.out.println("Login successful ?  \n el nombre de usario es: "+ LoginUserQuestion.loginUser().answeredBy(Sebas));
    }


}
