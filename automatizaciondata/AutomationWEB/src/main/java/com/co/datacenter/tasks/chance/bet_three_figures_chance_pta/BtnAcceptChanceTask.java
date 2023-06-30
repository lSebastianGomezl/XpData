package com.co.datacenter.tasks.chance.bet_three_figures_chance_pta;

import com.co.datacenter.userinterfaces.chance_tradicional.bet_three_figures_chance_pta.BetThreeFigureChancePtaInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BtnAcceptChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePtaInterface.BTN_ACCEP, isVisible()),
                Click.on(BetThreeFigureChancePtaInterface.BTN_ACCEP)
        );



    }

    public static BtnAcceptChanceTask on(){
        return instrumented(BtnAcceptChanceTask.class);
    }
}
