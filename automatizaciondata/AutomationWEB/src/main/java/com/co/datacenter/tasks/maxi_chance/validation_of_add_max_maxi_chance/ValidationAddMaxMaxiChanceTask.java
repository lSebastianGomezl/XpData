package com.co.datacenter.tasks.maxi_chance.validation_of_add_max_maxi_chance;

import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidationAddMaxMaxiChanceTask implements Task {

    public static final String VALUE1 = "1";
    public static final String VALUE2 = "4";

    public static final String VALUE3 = "1";
    public static final String VALUE4 = "0";

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_RAMDON_FOUR, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_RAMDON_FOUR)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECT_VALUE)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECTED_VALUE, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECTED_VALUE)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_ADD_GAME)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ACCEP_ADDITIONAL_INFO,isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_ACCEP_ADDITIONAL_INFO)
        );


        //Num 2

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_RAMDON_FOUR_1, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_RAMDON_FOUR_1)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE_1, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECT_VALUE_1)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECTED_VALUE_1, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECTED_VALUE_1)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_ADD_GAME)
        );

        // Num 3

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_RAMDON_FOUR_2, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_RAMDON_FOUR_2)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE_2, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECT_VALUE_2)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECTED_VALUE_2, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECTED_VALUE_2)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_ADD_GAME)
        );

        //Num 4

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_RAMDON_FOUR_3, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_RAMDON_FOUR_3)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECT_VALUE_3, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECT_VALUE_3)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.SELECTED_VALUE_3, isVisible()),
                Click.on(DataMaxiChanceInterface.SELECTED_VALUE_3)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_ADD_GAME)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ACCEP_MAX_NUM, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_ACCEP_MAX_NUM)
        );



        /*
        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_NEXT, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_NEXT)
        );

         */
        }

        public static ValidationAddMaxMaxiChanceTask on(){
        return instrumented(ValidationAddMaxMaxiChanceTask.class);
        }

}
