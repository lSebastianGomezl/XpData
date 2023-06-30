package com.co.datacenter.tasks.chance_millonario.data_chance_millonario;

import com.co.datacenter.userinterfaces.chance_millonario.data_chance_millonario.DataTwoPageChanceMillonarioInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DataTwoChanceMillonarioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {



        actor.attemptsTo(
                //WaitUntil.the(DataTwoPageChanceMillonarioInterface.SCROLL_1, isVisible()),
                //Scroll.to(DataTwoPageChanceMillonarioInterface.SCROLL_1),
                WaitUntil.the(DataTwoPageChanceMillonarioInterface.INPUT_1, isVisible()),
                Enter.theValue("5236").into(DataTwoPageChanceMillonarioInterface.INPUT_1),

                WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_CLEAN, isVisible()),
                Click.on(DataTwoPageChanceMillonarioInterface.BTN_CLEAN)
                );

            actor.attemptsTo(
                    //WaitUntil.the(DataTwoPageChanceMillonarioInterface.SCROLL_1, isVisible()),
                    //Scroll.to(DataTwoPageChanceMillonarioInterface.SCROLL_1),

                    WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_1, isVisible()),
                    Click.on(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_1));

            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            actor.attemptsTo(
                    WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_2, isVisible()),
                    Click.on(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_2)
            );

            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            actor.attemptsTo(
                    WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_3, isVisible()),
                    Click.on(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_3)
            );

            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            actor.attemptsTo(
                    WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_4, isVisible()),
                    Click.on(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_4)
            );

            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            actor.attemptsTo(
                    WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_5, isVisible()),
                    Click.on(DataTwoPageChanceMillonarioInterface.BTN_RANDOM_5)
            );

            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            actor.attemptsTo(
                    WaitUntil.the(DataTwoPageChanceMillonarioInterface.BTN_NEXT, isVisible()),
                    Click.on(DataTwoPageChanceMillonarioInterface.BTN_NEXT)
            );


    }

    public static DataTwoChanceMillonarioTask on(){
        return instrumented(DataTwoChanceMillonarioTask.class);
    }
}
