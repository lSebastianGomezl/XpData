package com.co.datacenter.tasks.chance.data_chance_element_iframe;

import com.co.datacenter.userinterfaces.chance_tradicional.date_chance.DataChanceInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DataChanceElementIframeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        /*
        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.SCROLL_1, isVisible()),
                Scroll.to((DataChanceInterface.SCROLL_1)));


        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.BTN_SELECT_LOTTERY, isVisible()),
                Click.on((DataChanceInterface.BTN_SELECT_LOTTERY)));

        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.DAY_LOTTERY, isVisible()),
                Click.on((DataChanceInterface.DAY_LOTTERY)));


        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.CKECK_BOX_LOTTERY, isVisible()),
                Click.on((DataChanceInterface.CKECK_BOX_LOTTERY)));


        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.BTN_ACCEPT_LOTTERY, isVisible()),
                Click.on((DataChanceInterface.BTN_ACCEPT_LOTTERY)));


         */

        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.SCROLL_1, isVisible()),
                Scroll.to((DataChanceInterface.SCROLL_1)));

        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.INPUT_NUM, isVisible()),
                Enter.theValue("0526").into(DataChanceInterface.INPUT_NUM));


        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.SCROLL_2, isVisible()),
                Scroll.to((DataChanceInterface.SCROLL_2)));

        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.CLICK_UPDATE, isVisible()),
                Click.on((DataChanceInterface.CLICK_UPDATE)));

        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Click.on((DataChanceInterface.INPUT_PLENO_DIRECTO)));


        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.INPUT_PLENO_DIRECTO, isVisible()),
                Enter.theValue("500").into(DataChanceInterface.INPUT_PLENO_DIRECTO));

        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Click.on((DataChanceInterface.INPUT_PLENO_CONVINADO)));


        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.INPUT_PLENO_CONVINADO, isVisible()),
                Enter.theValue("500").into(DataChanceInterface.INPUT_PLENO_CONVINADO));


        actor.attemptsTo(
                WaitUntil.the(DataChanceInterface.BTN_SIGUIENTE, isVisible()),
                Click.on((DataChanceInterface.BTN_SIGUIENTE)));



    }

    public static DataChanceElementIframeTask on() {
        return instrumented(DataChanceElementIframeTask.class);
    }
}
