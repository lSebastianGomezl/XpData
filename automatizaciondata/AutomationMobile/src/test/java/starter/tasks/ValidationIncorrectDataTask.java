package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.ValidationIncorrectDataView;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidationIncorrectDataTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(ValidationIncorrectDataView.alertPhoneCalls),
                //Click.on(ValidationIncorrectDataView.alertFiles),
                Enter.theValue("363636").into(ValidationIncorrectDataView.userName),
                Enter.theValue("88888").into(ValidationIncorrectDataView.password),
                Click.on(ValidationIncorrectDataView.BTN_LOGIN),
                Click.on(ValidationIncorrectDataView.BTN_ACCEPT)

        );
        //try {
        //    Thread.sleep(7000);
        //} catch (InterruptedException e) {
        //    throw new RuntimeException(e);
        //}
        actor.attemptsTo(

        );
    }
    public static ValidationIncorrectDataTask go(){
        return instrumented(ValidationIncorrectDataTask.class);
    }
}
