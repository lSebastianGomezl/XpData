package com.co.datacenter.tasks.maxi_chance.validation_value_empty_maxi_chance;

import com.co.datacenter.userinterfaces.maxi_chance.data_maxi_chance.DataMaxiChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import javax.xml.crypto.Data;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValueEmptyMaxiChanceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.TITLE_SCROLL_1, isVisible()),
                Scroll.to(DataMaxiChanceInterface.TITLE_SCROLL_1),


                WaitUntil.the(DataMaxiChanceInterface.BTN_SELEC_LOTTERY,isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_SELEC_LOTTERY),


                WaitUntil.the(DataMaxiChanceInterface.CHECK_BOX_LOTTERY, isVisible()),
                Click.on(DataMaxiChanceInterface.CHECK_BOX_LOTTERY),


                WaitUntil.the(DataMaxiChanceInterface.BTN_SAVE_LOTTERY, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_SAVE_LOTTERY),


                WaitUntil.the(DataMaxiChanceInterface.BTN_RAMDON_THREE, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_RAMDON_THREE));

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            actor.attemptsTo(
                    WaitUntil.the(DataMaxiChanceInterface.BTN_ADD_GAME, isVisible()),
                    Click.on(DataMaxiChanceInterface.BTN_ADD_GAME)
            );

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ACCEP_VALUE_EMPTY, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_ACCEP_VALUE_EMPTY)
        );

        actor.attemptsTo(
                WaitUntil.the(DataMaxiChanceInterface.BTN_ACCEP_ADDITIONAL_INFO, isVisible()),
                Click.on(DataMaxiChanceInterface.BTN_ACCEP_ADDITIONAL_INFO));


    }

    public static ValueEmptyMaxiChanceTask on(){
        return instrumented(ValueEmptyMaxiChanceTask.class);
    }
}
