package starter.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.interaccion.Swipe;
import starter.ui.AvoidRechargeView;
import starter.ui.ValidationFormEmptyOperatorFieldView;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidationFormEmptyOperatorFieldTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(ValidationFormEmptyOperatorFieldView.SELECT_OPERATOR),
                Click.on(ValidationFormEmptyOperatorFieldView.VALUE_OPERATOR),
                Click.on(ValidationFormEmptyOperatorFieldView.SELECT_PACKAGE),
                Click.on(ValidationFormEmptyOperatorFieldView.PACKAGE_VALUE),
                Click.on(ValidationFormEmptyOperatorFieldView.SELECT_OPERATOR),
                Click.on(ValidationFormEmptyOperatorFieldView.SELECT_OPERATOR_1),
                Enter.theValue("3006593822").into(ValidationFormEmptyOperatorFieldView.NUMBER_CELLPHONE),
                Enter.theValue("3006593822").into(ValidationFormEmptyOperatorFieldView.CONFIRM_CELLPHONE),
                Swipe.scrollUp(),
                Click.on(ValidationFormEmptyOperatorFieldView.SELECT_RECHARGE_VALUE),
                Click.on(ValidationFormEmptyOperatorFieldView.RECHARGE_VALUE),
                Swipe.scrollUp(),
                Click.on(ValidationFormEmptyOperatorFieldView.BTN_NEXT),
                Swipe.scrollDown()
        );


    }

    public static ValidationFormEmptyOperatorFieldTask send() {
        return instrumented(ValidationFormEmptyOperatorFieldTask.class);
    }

}