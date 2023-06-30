package com.co.datacenter.tasks.pines.data_pines;

import com.co.datacenter.userinterfaces.pines.data_pines.DataPaymentPinesInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickBtnPayTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                //WaitUntil.the(DataPaymentPinesInterface.INPUT_SELECT_PIN, isVisible()),
                Click.on(DataPaymentPinesInterface.BTN_PAYMENT)
        );
    }

    public static ClickBtnPayTask on(){
        return instrumented(ClickBtnPayTask.class);
    }
}
