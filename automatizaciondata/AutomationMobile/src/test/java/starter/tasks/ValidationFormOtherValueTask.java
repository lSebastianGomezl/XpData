package starter.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.interaccion.Swipe;
import starter.ui.ValidationFormDiferentNumbersView;
import starter.ui.ValidationFormEmptyOperatorFieldView;
import starter.ui.ValidationFormOtherValueView;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidationFormOtherValueTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(ValidationFormOtherValueView.SELECT_OPERATOR),
                Click.on(ValidationFormOtherValueView.VALUE_OPERATOR),
                //Click.on(ValidationFormOtherValueView.SELECT_PACKAGE),
                //Click.on(ValidationFormOtherValueView.PACKAGE_VALUE),
                Enter.theValue("3006593822").into(ValidationFormOtherValueView.NUMBER_CELLPHONE),
                Enter.theValue("3006593822").into(ValidationFormOtherValueView.CONFIRM_CELLPHONE),
                Swipe.scrollUp(),
                Click.on(ValidationFormOtherValueView.SELECT_RECHARGE_VALUE),
                Click.on(ValidationFormOtherValueView.RECHARGE_VALUE),
                Swipe.scrollUp(),
                Click.on(ValidationFormOtherValueView.BTN_NEXT),
                Swipe.scrollDown()
        );


    }

    public static ValidationFormOtherValueTask send() {
        return instrumented(ValidationFormOtherValueTask.class);
    }

}