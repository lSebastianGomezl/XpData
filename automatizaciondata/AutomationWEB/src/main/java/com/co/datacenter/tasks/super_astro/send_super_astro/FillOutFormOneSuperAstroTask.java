package com.co.datacenter.tasks.super_astro.send_super_astro;

import com.co.datacenter.userinterfaces.super_astro.send_super_astro.SendSuperAstroOneInterface;
import com.co.datacenter.userinterfaces.super_astro.send_super_astro.SendSuperAstroTwoInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.LocalTime;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillOutFormOneSuperAstroTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroOneInterface.MANUAL_TYPE_BET, isVisible()),
                Click.on(SendSuperAstroOneInterface.MANUAL_TYPE_BET)
        );

        LocalTime horaActual = LocalTime.now();
        LocalTime horaCondicional = LocalTime.of(14,05);

        if (horaActual.isBefore(horaCondicional)){
            actor.attemptsTo(
                    WaitUntil.the(SendSuperAstroOneInterface.CHECK_BOX_ASTRO_SOL, isVisible()),
                    Click.on(SendSuperAstroOneInterface.CHECK_BOX_ASTRO_SOL)
            );

        }else {

            actor.attemptsTo(
                    WaitUntil.the(SendSuperAstroOneInterface.CHECK_BOX_ASTRO_LUNA, isVisible()),
                    Click.on(SendSuperAstroOneInterface.CHECK_BOX_ASTRO_LUNA)
            );

        }

        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroOneInterface.SCROLL_SELECT_TYPE, isVisible()),
                Scroll.to(SendSuperAstroOneInterface.SCROLL_SELECT_TYPE)
        );

        actor.attemptsTo(
                WaitUntil.the(SendSuperAstroOneInterface.NEXT_BUTTON, isVisible()),
                Click.on(SendSuperAstroOneInterface.NEXT_BUTTON));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


    public static FillOutFormOneSuperAstroTask on(){
        return instrumented(FillOutFormOneSuperAstroTask.class);
    }
}

