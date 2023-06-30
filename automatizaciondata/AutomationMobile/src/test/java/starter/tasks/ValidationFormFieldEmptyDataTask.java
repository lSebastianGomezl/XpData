package starter.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.interaccion.Swipe;
import starter.ui.AvoidRechargeView;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidationFormFieldEmptyDataTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Swipe.scrollUp(),
                Click.on(AvoidRechargeView.BTN_NEXT),
                Swipe.scrollDown()
        );


    }

    public static ValidationFormFieldEmptyDataTask send() {
        return instrumented(ValidationFormFieldEmptyDataTask.class);
    }

}