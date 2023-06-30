package com.co.datacenter.tasks.select_bets;

import com.co.datacenter.userinterfaces.select_bets.SelectBetsInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectBetTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectBetsInterface.BETS)
        );

    }

    public static SelectBetTask on(){
        return instrumented(SelectBetTask.class);
    }
}
