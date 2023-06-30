package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.ValidationEmptyPasswordView;
import starter.ui.ValidationEmptyUserView;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidationEmptyUserTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(ValidationEmptyUserView.alertPhoneCalls),
                //Click.on(ValidationEmptyUserView.alertFiles),
                Enter.theValue("").into(ValidationEmptyUserView.userName),
                Enter.theValue("1111111").into(ValidationEmptyUserView.password),
                Click.on(ValidationEmptyUserView.BTN_LOGIN),
                Click.on(ValidationEmptyUserView.BTN_ACCEPT)
        );
    }
    public static ValidationEmptyUserTask go(){
        return instrumented(ValidationEmptyUserTask.class);
    }
}
