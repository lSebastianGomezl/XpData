package starter.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.interaccion.Swipe;
import starter.ui.ValidationFormDiferentNumbersView;
import starter.ui.ValidationFormEmptyOperatorFieldView;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidationFormDiferentNumbersTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(ValidationFormDiferentNumbersView.SELECT_OPERATOR),
                Click.on(ValidationFormDiferentNumbersView.VALUE_OPERATOR),
                Click.on(ValidationFormDiferentNumbersView.SELECT_PACKAGE),
                Click.on(ValidationFormDiferentNumbersView.PACKAGE_VALUE),
                Enter.theValue("3006593800").into(ValidationFormDiferentNumbersView.NUMBER_CELLPHONE),
                Enter.theValue("3006593822").into(ValidationFormDiferentNumbersView.CONFIRM_CELLPHONE),
                Swipe.scrollUp(),
                Click.on(ValidationFormDiferentNumbersView.BTN_NEXT),
                Swipe.scrollDown()
        );


    }

    public static ValidationFormDiferentNumbersTask send() {
        return instrumented(ValidationFormDiferentNumbersTask.class);
    }

}