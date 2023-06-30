package com.co.datacenter.tasks.chance_millonario.confirm_chance_millonario;

import com.co.datacenter.userinterfaces.chance_millonario.confirm_chance_millonario.ConfirmChanceMillonarioInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConfirmChanceMillonarioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ConfirmChanceMillonarioInterface.SCROLL_1, isVisible()),
                Scroll.to(ConfirmChanceMillonarioInterface.SCROLL_1),

                WaitUntil.the(ConfirmChanceMillonarioInterface.CHECK_BOX_PAY, isVisible()),
                Click.on(ConfirmChanceMillonarioInterface.CHECK_BOX_PAY),

                WaitUntil.the(ConfirmChanceMillonarioInterface.BTN_NEXT, isVisible()),
                Click.on(ConfirmChanceMillonarioInterface.BTN_NEXT)
        );


    }

    public static ConfirmChanceMillonarioTask on(){
        return instrumented(ConfirmChanceMillonarioTask.class);
    }
}
