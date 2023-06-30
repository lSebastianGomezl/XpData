package starter.tasks;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.LoginView;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(LoginView.alertPhoneCalls),
                //Click.on(LoginView.alertFiles),
                Enter.theValue("40429963").into(LoginView.userName),
                Enter.theValue("25836").into(LoginView.password),
                Click.on(LoginView.BTN_LOGIN)
        );
    }

    public static LoginTask in(){
        return instrumented(LoginTask.class);
    }
}
