package com.co.datacenter.tasks.paga_millonario.bet_three_paga_millonario;

import com.co.datacenter.userinterfaces.paga_millonario.data_paga_millonario.DataTwoPagaInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BetThreeTwoPagePagaMillonarioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DataTwoPagaInterface.BTN_RANDOM_ONE, isVisible()),
                Click.on(DataTwoPagaInterface.BTN_RANDOM_ONE)
        );

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                WaitUntil.the(DataTwoPagaInterface.BTN_RANDOM_TWO, isVisible()),
                Click.on(DataTwoPagaInterface.BTN_RANDOM_TWO)
        );

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                WaitUntil.the(DataTwoPagaInterface.BTN_RANDOM_THREE, isVisible()),
                Click.on(DataTwoPagaInterface.BTN_RANDOM_THREE)
        );

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                WaitUntil.the(DataTwoPagaInterface.BTN_RANDOM_FOUR, isVisible()),
                Click.on(DataTwoPagaInterface.BTN_RANDOM_FOUR)
        );

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                WaitUntil.the(DataTwoPagaInterface.BTN_RANDOM_FIVE, isVisible()),
                Click.on(DataTwoPagaInterface.BTN_RANDOM_FIVE)
        );

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                WaitUntil.the(DataTwoPagaInterface.BTN_NEXT, isVisible()),
                Click.on(DataTwoPagaInterface.BTN_NEXT)
        );

    }

    public static BetThreeTwoPagePagaMillonarioTask on(){
        return instrumented(BetThreeTwoPagePagaMillonarioTask.class);
    }
}
