package com.co.datacenter.tasks.chance.bet_three_figure_chance_una;

import com.co.datacenter.userinterfaces.chance_tradicional.bet_three_figures_chance_una.BetThreeFigureChanceUnaInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Calendar;
import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BetThreeFigureUnaChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChanceUnaInterface.SCROLL_1, isVisible()),
                Scroll.to((BetThreeFigureChanceUnaInterface.SCROLL_1)));


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChanceUnaInterface.BTN_SELECT_LOTTERY, isVisible()),
                Click.on((BetThreeFigureChanceUnaInterface.BTN_SELECT_LOTTERY)));

        int dayOdWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        switch (dayOdWeek){
            case 1:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChanceUnaInterface.DAY_DOM, isVisible()),
                        Click.on((BetThreeFigureChanceUnaInterface.DAY_DOM)));
                /*
                actor.attemptsTo(
                    WaitUntil.the(MinValueChanceInterface.C, isVisible()),
                    Click.on((MinValueChanceInterface.CKECK_BOX_LOTTERY)));

                 */
                break;
            case 2:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChanceUnaInterface.DAY_LUN, isVisible()),
                        Click.on((BetThreeFigureChanceUnaInterface.DAY_LUN)));

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChanceUnaInterface.DAY_LUN, isVisible()),
                        Click.on((BetThreeFigureChanceUnaInterface.CHECK_BOX_LUN)));
                break;
            case 3:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChanceUnaInterface.DAY_MAR, isVisible()),
                        Click.on((BetThreeFigureChanceUnaInterface.DAY_MAR)));

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChanceUnaInterface.DAY_MAR, isVisible()),
                        Click.on((BetThreeFigureChanceUnaInterface.CHECK_BOX_MAR)));
                break;
            case 4:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChanceUnaInterface.DAY_MIE, isVisible()),
                        Click.on((BetThreeFigureChanceUnaInterface.DAY_MIE)));

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChanceUnaInterface.DAY_MIE, isVisible()),
                        Click.on((BetThreeFigureChanceUnaInterface.CHECK_BOX_MIE)));
                break;
            case 5:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChanceUnaInterface.DAY_JUE, isVisible()),
                        Click.on((BetThreeFigureChanceUnaInterface.DAY_JUE)));

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChanceUnaInterface.DAY_JUE, isVisible()),
                        Click.on((BetThreeFigureChanceUnaInterface.CHECK_BOX_JUE)));
                break;
            case 6:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChanceUnaInterface.DAY_VIE, isVisible()),
                        Click.on((BetThreeFigureChanceUnaInterface.DAY_VIE)));

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChanceUnaInterface.DAY_VIE, isVisible()),
                        Click.on((BetThreeFigureChanceUnaInterface.CHECK_BOX_VIE)));
                break;
            case 7:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChanceUnaInterface.DAY_SAB, isVisible()),
                        Click.on((BetThreeFigureChanceUnaInterface.DAY_SAB)));

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChanceUnaInterface.DAY_SAB, isVisible()),
                        Click.on((BetThreeFigureChanceUnaInterface.CHECK_BOX_SAB)));
                break;

        }

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChanceUnaInterface.BTN_ACCEPT_LOTTERY, isVisible()),
                Click.on((BetThreeFigureChanceUnaInterface.BTN_ACCEPT_LOTTERY)));

        Random numero = new Random();

        numero.setSeed(System.currentTimeMillis());

        int num = numero.nextInt(900)+100;


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChanceUnaInterface.INPUT_NUM, isVisible()),
                Enter.theValue(Integer.toString(num)).into(BetThreeFigureChanceUnaInterface.INPUT_NUM));


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChanceUnaInterface.SCROLL_2, isVisible()),
                Scroll.to((BetThreeFigureChanceUnaInterface.SCROLL_2)));

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChanceUnaInterface.CLICK_UPDATE, isVisible()),
                Click.on((BetThreeFigureChanceUnaInterface.CLICK_UPDATE)));

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChanceUnaInterface.INPUT_UNA, isVisible()),
                Click.on((BetThreeFigureChanceUnaInterface.INPUT_UNA)));


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChanceUnaInterface.INPUT_UNA, isVisible()),
                Enter.theValue("1700").into(BetThreeFigureChanceUnaInterface.INPUT_UNA));


        /*

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((BetThreeFigureChancePdInterface.INPUT_PLENO_CONVINADO)));


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("2500").into(BetThreeFigureChancePdInterface.INPUT_PLENO_CONVINADO));



         */


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChanceUnaInterface.BTN_SIGUIENTE, isVisible()),
                Click.on((BetThreeFigureChanceUnaInterface.BTN_SIGUIENTE)));

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChanceUnaInterface.SCROLL_4, isVisible()),
                Scroll.to(BetThreeFigureChanceUnaInterface.SCROLL_4)

        );

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChanceUnaInterface.CHECK_BOX_BALANCE_PAY, isVisible()),
                Click.on(BetThreeFigureChanceUnaInterface.CHECK_BOX_BALANCE_PAY)
        );

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChanceUnaInterface.BTN_NEXT, isVisible()),
                Click.on(BetThreeFigureChanceUnaInterface.BTN_NEXT)
        );

        /*

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChanceUnaInterface.BTN_ACCEP, isVisible()),
                Click.on(BetThreeFigureChanceUnaInterface.BTN_ACCEP)
        );

         */


    }

    public static BetThreeFigureUnaChanceTask on(){
        return instrumented(BetThreeFigureUnaChanceTask.class);
    }
}
