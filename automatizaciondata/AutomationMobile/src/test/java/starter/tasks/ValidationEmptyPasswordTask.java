package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.ValidationEmptyPasswordView;
import starter.ui.ValidationEmptyUserView;
import starter.ui.ValidationIncorrectDataView;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidationEmptyPasswordTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(ValidationEmptyPasswordView.alertPhoneCalls),
                //Click.on(ValidationEmptyPasswordView.alertFiles),
                Enter.theValue("222222").into(ValidationEmptyPasswordView.userName),
                Enter.theValue("").into(ValidationEmptyPasswordView.password),
                Click.on(ValidationEmptyPasswordView.BTN_LOGIN),
                Click.on(ValidationEmptyPasswordView.BTN_ACCEPT)


        );

        actor.attemptsTo(


        );
    }
    public static ValidationEmptyPasswordTask go(){
        return instrumented(ValidationEmptyPasswordTask.class);
    }
}
