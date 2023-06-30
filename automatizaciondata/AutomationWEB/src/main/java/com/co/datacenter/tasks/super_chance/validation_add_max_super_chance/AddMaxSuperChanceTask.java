package com.co.datacenter.tasks.super_chance.validation_add_max_super_chance;

import com.co.datacenter.userinterfaces.super_chance.add_max_super_chance.AddMaxSuperChanceInterface;
import com.co.datacenter.userinterfaces.super_chance.bet_three_figures_super_chance.BetThreeSuperChanceInterface;
import com.co.datacenter.userinterfaces.super_chance.data_super_chance.DataSuperChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.apache.commons.math3.analysis.function.Add;

import java.util.Calendar;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddMaxSuperChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
            WaitUntil.the(AddMaxSuperChanceInterface.TITLE_SCROLL_1, isVisible()),
            Scroll.to(AddMaxSuperChanceInterface.TITLE_SCROLL_1));

        //Juego No 1

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.BTN_RANDOM_THREE, isVisible()),
                Click.on(AddMaxSuperChanceInterface.BTN_RANDOM_THREE)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.SELECT_VALUE, isVisible()),
                Click.on(AddMaxSuperChanceInterface.SELECT_VALUE)
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.SELECTED_VALUE, isVisible()),
                Click.on(AddMaxSuperChanceInterface.SELECTED_VALUE)
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on(AddMaxSuperChanceInterface.BTN_ADD_GAME)
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.BTN_ACCEPT_ADD_GAME, isVisible()),
                Click.on(AddMaxSuperChanceInterface.BTN_ACCEPT_ADD_GAME)
        );

        //Juego No 2

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.TITLE_SCROLL_1, isVisible()),
                Scroll.to(AddMaxSuperChanceInterface.TITLE_SCROLL_1));

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.BTN_RANDOM_FOUR, isVisible()),
                Click.on(AddMaxSuperChanceInterface.BTN_RANDOM_FOUR)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.SELECT_VALUE_2 , isVisible()),
                Click.on(AddMaxSuperChanceInterface.SELECT_VALUE_2 )
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.SELECTED_VALUE_2 , isVisible()),
                Click.on(AddMaxSuperChanceInterface.SELECTED_VALUE_2 )
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on(AddMaxSuperChanceInterface.BTN_ADD_GAME)
        );



        //Juego No 3


        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.BTN_RANDOM_TRHEE_3, isVisible()),
                Click.on(AddMaxSuperChanceInterface.BTN_RANDOM_TRHEE_3)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.SELECT_VALUE_3 , isVisible()),
                Click.on(AddMaxSuperChanceInterface.SELECT_VALUE_3 )
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.SELECTED_VALUE_3, isVisible()),
                Click.on(AddMaxSuperChanceInterface.SELECTED_VALUE_3 )
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on(AddMaxSuperChanceInterface.BTN_ADD_GAME)
        );

        //Juego No 4



        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.BTN_RANDOM_FOUR_4, isVisible()),
                Click.on(AddMaxSuperChanceInterface.BTN_RANDOM_FOUR_4)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.SELECT_VALUE_4 , isVisible()),
                Click.on(AddMaxSuperChanceInterface.SELECT_VALUE_4 )
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.SELECTED_VALUE_4, isVisible()),
                Click.on(AddMaxSuperChanceInterface.SELECTED_VALUE_4 )
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on(AddMaxSuperChanceInterface.BTN_ADD_GAME)
        );

        // Juego No 5


        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.BTN_RANDOM_FOUR_5, isVisible()),
                Click.on(AddMaxSuperChanceInterface.BTN_RANDOM_FOUR_5)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.SELECT_VALUE_5 , isVisible()),
                Click.on(AddMaxSuperChanceInterface.SELECT_VALUE_5 )
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.SELECTED_VALUE_5, isVisible()),
                Click.on(AddMaxSuperChanceInterface.SELECTED_VALUE_5 )
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on(AddMaxSuperChanceInterface.BTN_ADD_GAME)
        );

        actor.attemptsTo(
                WaitUntil.the(AddMaxSuperChanceInterface.BTN_ACCEPT_ALERT, isVisible()),
                Click.on(AddMaxSuperChanceInterface.BTN_ACCEPT_ALERT)
        );







    }
    public static AddMaxSuperChanceTask on(){
        return instrumented(AddMaxSuperChanceTask.class);
    }

}
