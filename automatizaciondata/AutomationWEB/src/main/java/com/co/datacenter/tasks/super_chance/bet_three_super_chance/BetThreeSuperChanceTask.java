package com.co.datacenter.tasks.super_chance.bet_three_super_chance;

import com.co.datacenter.userinterfaces.super_chance.bet_three_figures_super_chance.BetThreeSuperChanceInterface;
import com.co.datacenter.userinterfaces.super_chance.data_super_chance.DataSuperChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Calendar;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BetThreeSuperChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
            WaitUntil.the(BetThreeSuperChanceInterface.TITLE_SCROLL_1, isVisible()),
            Scroll.to(BetThreeSuperChanceInterface.TITLE_SCROLL_1));
        /*

        actor.attemptsTo(
                WaitUntil.the(BetThreeSuperChanceInterface.LOTTERY_BTN_SELECT, isVisible()),
                Click.on(BetThreeSuperChanceInterface.LOTTERY_BTN_SELECT)
        );



        int dayWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        switch(dayWeek){
            case 1:
                /*
                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_DOM, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_DOM)));


                break;
            case 2:
                /*
                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_LUN, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_LUN)));



                actor.attemptsTo(
                        WaitUntil.the(BetThreeSuperChanceInterface.CHECK_BOX_LUN, isVisible()),
                        Click.on((BetThreeSuperChanceInterface.CHECK_BOX_LUN)));
                break;
            case 3:
                /*
                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_MAR, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_MAR)));

                actor.attemptsTo(
                        WaitUntil.the(BetThreeSuperChanceInterface.CHECK_BOX_MAR, isVisible()),
                        Click.on((BetThreeSuperChanceInterface.CHECK_BOX_MAR)));
                break;
            case 4:
                /*
                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_MIE, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_MIE)));


                actor.attemptsTo(
                        WaitUntil.the(BetThreeSuperChanceInterface.CHECK_BOX_MIE, isVisible()),
                        Click.on((BetThreeSuperChanceInterface.CHECK_BOX_MIE)));
                break;
            case 5:
                /*
                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_JUE, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_JUE)));



                actor.attemptsTo(
                        WaitUntil.the(BetThreeSuperChanceInterface.DAY_JUE, isVisible()),
                        Click.on((BetThreeSuperChanceInterface.CHECK_BOX_JUE)));
                break;
            case 6:
                /*
                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_VIE, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_VIE)));



                actor.attemptsTo(
                        WaitUntil.the(BetThreeSuperChanceInterface.DAY_VIE, isVisible()),
                        Click.on((BetThreeSuperChanceInterface.CHECK_BOX_VIE)));
                break;
            case 7:
                /*
                actor.attemptsTo(
                        WaitUntil.the(DataSuperChanceInterface.DAY_SAB, isVisible()),
                        Click.on((DataSuperChanceInterface.DAY_SAB)));



                actor.attemptsTo(
                        WaitUntil.the(BetThreeSuperChanceInterface.DAY_SAB, isVisible()),
                        Click.on((BetThreeSuperChanceInterface.CHECK_BOX_SAB)));
                break;
        }




        actor.attemptsTo(
            WaitUntil.the(BetThreeSuperChanceInterface.BTN_SAVE, isVisible()),
            Click.on(BetThreeSuperChanceInterface.BTN_SAVE));

        /*
        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM1,isVisible()),
                Click.on(DataSuperChanceInterface.INPUT_NUM1)
        );

         */

        /*

        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM1,isVisible()),
                Enter.theValue("4").into(DataSuperChanceInterface.INPUT_NUM1)
        );
        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM2,isVisible()),
                Enter.theValue("2").into(DataSuperChanceInterface.INPUT_NUM2)
        );
        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM3,isVisible()),
                Enter.theValue("3").into(DataSuperChanceInterface.INPUT_NUM3)
        );
        actor.attemptsTo(
                WaitUntil.the(DataSuperChanceInterface.INPUT_NUM4,isVisible()),
                Enter.theValue("4").into(DataSuperChanceInterface.INPUT_NUM4)
        );

         */

        actor.attemptsTo(
                WaitUntil.the(BetThreeSuperChanceInterface.BTN_RANDOM_THREE, isVisible()),
                Click.on(BetThreeSuperChanceInterface.BTN_RANDOM_THREE)
        );

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                WaitUntil.the(BetThreeSuperChanceInterface.SELECT_VALUE, isVisible()),
                Click.on(BetThreeSuperChanceInterface.SELECT_VALUE)
        );

        actor.attemptsTo(
                WaitUntil.the(BetThreeSuperChanceInterface.SELECTED_VALUE, isVisible()),
                Click.on(BetThreeSuperChanceInterface.SELECTED_VALUE)
        );



        actor.attemptsTo(
                WaitUntil.the(BetThreeSuperChanceInterface.BUTTON_NEXT, isVisible()),
                Click.on(BetThreeSuperChanceInterface.BUTTON_NEXT)
        );

    }
    public static BetThreeSuperChanceTask on(){
        return instrumented(BetThreeSuperChanceTask.class);
    }

}
