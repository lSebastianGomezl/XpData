package com.co.datacenter.tasks.paga_millonario.confirm_buy_paga_millonario;

import com.co.datacenter.userinterfaces.paga_millonario.confirm_paga_millonario.ConfirmPagaMillonarioInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConfirmPagaMillonarioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(

                WaitUntil.the(ConfirmPagaMillonarioInterface.SCROLL_1 , isVisible()),
                    Scroll.to(ConfirmPagaMillonarioInterface.SCROLL_1),
                WaitUntil.the(ConfirmPagaMillonarioInterface.BTN_NEXT, isVisible()),
                    Click.on(ConfirmPagaMillonarioInterface.BTN_NEXT));

                    try {
                                Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            actor.attemptsTo(
                   WaitUntil.the(ConfirmPagaMillonarioInterface.BTN_ACCEPT_VALDIATION,isVisible()),
                            Click.on(ConfirmPagaMillonarioInterface.BTN_ACCEPT_VALDIATION),
                            Scroll.to(ConfirmPagaMillonarioInterface.SCROLL_1),
                   WaitUntil.the(ConfirmPagaMillonarioInterface.CHECK_BOX_PAY,isVisible()),
                            Click.on(ConfirmPagaMillonarioInterface.CHECK_BOX_PAY),

                    WaitUntil.the(ConfirmPagaMillonarioInterface.BTN_NEXT, isVisible()),
                    Click.on(ConfirmPagaMillonarioInterface.BTN_NEXT));


    }

    public static ConfirmPagaMillonarioTask on(){
        return instrumented(ConfirmPagaMillonarioTask.class);
    }
}
