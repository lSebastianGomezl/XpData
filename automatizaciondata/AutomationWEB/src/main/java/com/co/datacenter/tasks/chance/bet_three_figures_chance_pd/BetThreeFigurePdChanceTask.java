package com.co.datacenter.tasks.chance.bet_three_figures_chance_pd;

import com.co.datacenter.userinterfaces.chance_tradicional.bet_three_figures_chance_pd.BetThreeFigureChancePdInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Calendar;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BetThreeFigurePdChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.SCROLL_1, isVisible()),
                Scroll.to((BetThreeFigureChancePdInterface.SCROLL_1)));


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.BTN_SELECT_LOTTERY, isVisible()),
                Click.on((BetThreeFigureChancePdInterface.BTN_SELECT_LOTTERY)));

        int dayOdWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        switch (dayOdWeek){
            case 1:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePdInterface.DAY_DOM, isVisible()),
                        Click.on((BetThreeFigureChancePdInterface.DAY_DOM)));
                /*
                actor.attemptsTo(
                    WaitUntil.the(MinValueChanceInterface.C, isVisible()),
                    Click.on((MinValueChanceInterface.CKECK_BOX_LOTTERY)));

                 */
                break;
            case 2:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePdInterface.DAY_LUN, isVisible()),
                        Click.on((BetThreeFigureChancePdInterface.DAY_LUN)));

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePdInterface.DAY_LUN, isVisible()),
                        Click.on((BetThreeFigureChancePdInterface.CHECK_BOX_LUN)));
                break;
            case 3:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePdInterface.DAY_MAR, isVisible()),
                        Click.on((BetThreeFigureChancePdInterface.DAY_MAR)));

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePdInterface.DAY_MAR, isVisible()),
                        Click.on((BetThreeFigureChancePdInterface.CHECK_BOX_MAR)));
                break;
            case 4:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePdInterface.DAY_MIE, isVisible()),
                        Click.on((BetThreeFigureChancePdInterface.DAY_MIE)));

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePdInterface.DAY_MIE, isVisible()),
                        Click.on((BetThreeFigureChancePdInterface.CHECK_BOX_MIE)));
                break;
            case 5:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePdInterface.DAY_JUE, isVisible()),
                        Click.on((BetThreeFigureChancePdInterface.DAY_JUE)));

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePdInterface.DAY_JUE, isVisible()),
                        Click.on((BetThreeFigureChancePdInterface.CHECK_BOX_JUE)));
                break;
            case 6:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePdInterface.DAY_VIE, isVisible()),
                        Click.on((BetThreeFigureChancePdInterface.DAY_VIE)));

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePdInterface.DAY_VIE, isVisible()),
                        Click.on((BetThreeFigureChancePdInterface.CHECK_BOX_VIE)));
                break;
            case 7:
                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePdInterface.DAY_SAB, isVisible()),
                        Click.on((BetThreeFigureChancePdInterface.DAY_SAB)));

                actor.attemptsTo(
                        WaitUntil.the(BetThreeFigureChancePdInterface.DAY_SAB, isVisible()),
                        Click.on((BetThreeFigureChancePdInterface.CHECK_BOX_SAB)));
                break;

        }

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.BTN_ACCEPT_LOTTERY, isVisible()),
                Click.on((BetThreeFigureChancePdInterface.BTN_ACCEPT_LOTTERY)));




        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.INPUT_NUM, isVisible()),
                Enter.theValue("052").into(BetThreeFigureChancePdInterface.INPUT_NUM));


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.SCROLL_2, isVisible()),
                Scroll.to((BetThreeFigureChancePdInterface.SCROLL_2)));

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.CLICK_UPDATE, isVisible()),
                Click.on((BetThreeFigureChancePdInterface.CLICK_UPDATE)));

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Click.on((BetThreeFigureChancePdInterface.INPUT_PLENO_DIRECTO)));


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Enter.theValue("1600").into(BetThreeFigureChancePdInterface.INPUT_PLENO_DIRECTO));


        /*

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((BetThreeFigureChancePdInterface.INPUT_PLENO_CONVINADO)));


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("2500").into(BetThreeFigureChancePdInterface.INPUT_PLENO_CONVINADO));



         */


        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.BTN_SIGUIENTE, isVisible()),
                Click.on((BetThreeFigureChancePdInterface.BTN_SIGUIENTE)));

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.SCROLL_4, isVisible()),
                Scroll.to(BetThreeFigureChancePdInterface.SCROLL_4)

        );

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.CHECK_BOX_BALANCE_PAY, isVisible()),
                Click.on(BetThreeFigureChancePdInterface.CHECK_BOX_BALANCE_PAY)
        );

        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.BTN_NEXT, isVisible()),
                Click.on(BetThreeFigureChancePdInterface.BTN_NEXT)
        );
        /*
        actor.attemptsTo(
                WaitUntil.the(BetThreeFigureChancePdInterface.BTN_ACCEP, isVisible()),
                Click.on(BetThreeFigureChancePdInterface.BTN_ACCEP)
        );

         */

    }

    public static BetThreeFigurePdChanceTask on(){
        return instrumented(BetThreeFigurePdChanceTask.class);
    }
}
