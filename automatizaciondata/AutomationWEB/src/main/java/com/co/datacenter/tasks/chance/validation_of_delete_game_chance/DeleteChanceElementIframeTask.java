package com.co.datacenter.tasks.chance.validation_of_delete_game_chance;

import com.co.datacenter.userinterfaces.chance_tradicional.validation_of_delete_game_chance.DeleteChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DeleteChanceElementIframeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        /*
        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.SCROLL_1, isVisible()),
                Scroll.to((DeleteChanceInterface.SCROLL_1)));


        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.BTN_SELECT_LOTTERY, isVisible()),
                Click.on((DeleteChanceInterface.BTN_SELECT_LOTTERY)));

        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.DAY_LOTTERY, isVisible()),
                Click.on((DeleteChanceInterface.DAY_LOTTERY)));


        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.CKECK_BOX_LOTTERY, isVisible()),
                Click.on((DeleteChanceInterface.CKECK_BOX_LOTTERY)));


        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.BTN_ACCEPT_LOTTERY, isVisible()),
                Click.on((DeleteChanceInterface.BTN_ACCEPT_LOTTERY)));




        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.BTN_RANDOM_NUM, isVisible()),
                Click.on(DeleteChanceInterface.BTN_RANDOM_NUM));

        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.SCROLL_2, isVisible()),
                Scroll.to((DeleteChanceInterface.SCROLL_2)));


        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.CLICK_UPDATE, isVisible()),
                Click.on((DeleteChanceInterface.CLICK_UPDATE)));

        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Click.on((DeleteChanceInterface.INPUT_PLENO_DIRECTO)));


        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Enter.theValue("10000").into(DeleteChanceInterface.INPUT_PLENO_DIRECTO));

        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((DeleteChanceInterface.INPUT_PLENO_CONVINADO)));


        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("2000").into(DeleteChanceInterface.INPUT_PLENO_CONVINADO));

        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.BTN_DISTRIBUTE, isVisible()),
                Click.on((DeleteChanceInterface.BTN_DISTRIBUTE)));

        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.BTN_ACCEPT_DISTRIBUTE, isVisible()),
                Click.on((DeleteChanceInterface.BTN_ACCEPT_DISTRIBUTE)));

        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.BTN_ADD_GAME, isVisible()),
                Click.on((DeleteChanceInterface.BTN_ADD_GAME)));
        */
        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.SCROLL_1, isVisible()),
                Scroll.to((DeleteChanceInterface.SCROLL_1)));


        actor.attemptsTo(
                WaitUntil.the(DeleteChanceInterface.BTN_DELETE, isVisible()),
                Click.on((DeleteChanceInterface.BTN_DELETE)));



        /*
        actor.attemptsTo(
                WaitUntil.the(MaxValueChanceInterface.BTN_SIGUIENTE, isVisible()),
                Click.on((MaxValueChanceInterface.BTN_SIGUIENTE)));

         */

    }

    public static DeleteChanceElementIframeTask on() {
        return instrumented(DeleteChanceElementIframeTask.class);
    }
}
