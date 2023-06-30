package com.co.datacenter.tasks.paga_encime.confirm_paga_encime;

import com.co.datacenter.userinterfaces.loteries.confirm_loteries.ConfirmLoteriesInterface;
import com.co.datacenter.userinterfaces.paga_encime.confirm_paga_encime.ConfirmPagaEncimeInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConfirmPagaEncimeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                WaitUntil.the(ConfirmPagaEncimeInterface.SCROLL_1, isVisible()),
                Click.on(ConfirmPagaEncimeInterface.SCROLL_1),

                WaitUntil.the(ConfirmPagaEncimeInterface.BTN_NEXT, isVisible()),
                Click.on(ConfirmPagaEncimeInterface.BTN_NEXT),

                WaitUntil.the(ConfirmPagaEncimeInterface.BTN_ACCEPT_VALDIATION, isVisible()),
                Click.on(ConfirmPagaEncimeInterface.BTN_ACCEPT_VALDIATION),


                WaitUntil.the(ConfirmPagaEncimeInterface.CHECK_BOX_PAY,isVisible()),
                Click.on(ConfirmPagaEncimeInterface.CHECK_BOX_PAY),

                WaitUntil.the(ConfirmPagaEncimeInterface.BTN_PAY,isVisible()),
                Click.on(ConfirmPagaEncimeInterface.BTN_PAY)
        );
    }

    public static ConfirmPagaEncimeTask on(){
        return instrumented(ConfirmPagaEncimeTask.class);
    }
}
