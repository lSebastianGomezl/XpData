package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.LoginFielValidationView;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginFielValidationTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginFielValidationView.alertPhoneCalls),
                Click.on(LoginFielValidationView.alertFiles),
                Click.on(LoginFielValidationView.BTN_LOGIN),
                Click.on(LoginFielValidationView.BTN_ACCEPT)
        );
    }
    public static LoginFielValidationTask go(){
        return instrumented(LoginFielValidationTask.class);
    }
}
