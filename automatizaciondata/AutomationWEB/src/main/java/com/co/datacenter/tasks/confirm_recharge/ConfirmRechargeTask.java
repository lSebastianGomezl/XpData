package com.co.datacenter.tasks.confirm_recharge;

import com.co.datacenter.userinterfaces.recarga.confirm_recharge.ConfirmRechargeInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConfirmRechargeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(ConfirmRechargeInterface.TITLE_MET_PAY, isVisible()),
                Scroll.to(ConfirmRechargeInterface.TITLE_MET_PAY)

        );


        actor.attemptsTo(
                WaitUntil.the(ConfirmRechargeInterface.CHECK_BOX_PAY, isVisible()),
                Click.on(ConfirmRechargeInterface.CHECK_BOX_PAY)
        );

        actor.attemptsTo(
                WaitUntil.the(ConfirmRechargeInterface.TITLE_INFO_PAY, isVisible()),
                Scroll.to(ConfirmRechargeInterface.TITLE_INFO_PAY)
        );

        actor.attemptsTo(
                WaitUntil.the(ConfirmRechargeInterface.BTN_NEXT_PAY, isVisible()),
                Click.on(ConfirmRechargeInterface.BTN_NEXT_PAY)
        );
    }

    public static ConfirmRechargeTask on(){
        return instrumented(ConfirmRechargeTask.class);
    }
}
