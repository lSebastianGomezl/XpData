package com.co.datacenter.tasks.chance.validation_of_max_value_chance;

import com.co.datacenter.userinterfaces.chance_tradicional.validation_of_max_value_chance.MaxValueChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MaxValueChanceElementIframeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        /*
        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.SCROLL_1, isVisible()),
                Scroll.to((MaxValueChanceInterface.SCROLL_1)));


        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.BTN_SELECT_LOTTERY, isVisible()),
                Click.on((MaxValueChanceInterface.BTN_SELECT_LOTTERY)));

        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.DAY_LOTTERY, isVisible()),
                Click.on((MaxValueChanceInterface.DAY_LOTTERY)));


        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.CKECK_BOX_LOTTERY, isVisible()),
                Click.on((MaxValueChanceInterface.CKECK_BOX_LOTTERY)));


        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.BTN_ACCEPT_LOTTERY, isVisible()),
                Click.on((MaxValueChanceInterface.BTN_ACCEPT_LOTTERY)));


         */

        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.SCROLL_1, isVisible()),
                Scroll.to((MaxValueChanceInterface.SCROLL_1)));

        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.BUTTON_GENERATE_NUM, isVisible()),
                Click.on(MaxValueChanceInterface.BUTTON_GENERATE_NUM));

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.SCROLL_2, isVisible()),
                Scroll.to((MaxValueChanceInterface.SCROLL_2)));

        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.CLICK_UPDATE, isVisible()),
                Click.on((MaxValueChanceInterface.CLICK_UPDATE)));

        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Click.on((MaxValueChanceInterface.INPUT_PLENO_DIRECTO)));


        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Enter.theValue("1000000").into(MaxValueChanceInterface.INPUT_PLENO_DIRECTO));

        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((MaxValueChanceInterface.INPUT_PLENO_CONVINADO)));


        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("1000000").into(MaxValueChanceInterface.INPUT_PLENO_CONVINADO));


        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.BTN_SIGUIENTE, isVisible()),
                Click.on((MaxValueChanceInterface.BTN_SIGUIENTE)));



    }

    public static MaxValueChanceElementIframeTask on() {
        return instrumented(MaxValueChanceElementIframeTask.class);
    }
}
