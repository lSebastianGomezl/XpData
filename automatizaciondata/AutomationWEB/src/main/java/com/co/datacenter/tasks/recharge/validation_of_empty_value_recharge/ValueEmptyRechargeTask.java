package com.co.datacenter.tasks.recharge.validation_of_empty_value_recharge;


import com.co.datacenter.userinterfaces.login.validation_of_empty_value.ValueEmptyRechargeInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValueEmptyRechargeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ValueEmptyRechargeInterface.TITLE_REHCARGE_DATA, isVisible()),
                Scroll.to((ValueEmptyRechargeInterface.TITLE_REHCARGE_DATA))
        );

        actor.attemptsTo(
                WaitUntil.the(ValueEmptyRechargeInterface.INPUT_CELLPHONE_NUM,isVisible()),
                Enter.theValue("3006593822").into(ValueEmptyRechargeInterface.INPUT_CELLPHONE_NUM)
        );

        actor.attemptsTo(
                WaitUntil.the(ValueEmptyRechargeInterface.VALUE_PACKAGE,isVisible()),
                Enter.theValue("").into(ValueEmptyRechargeInterface.VALUE_PACKAGE)
        );


        actor.attemptsTo(
                WaitUntil.the(ValueEmptyRechargeInterface.BTN_NEXT_RECHARGE_DATE, isVisible()),
                Click.on(ValueEmptyRechargeInterface.BTN_NEXT_RECHARGE_DATE)
        );
    }

    public static ValueEmptyRechargeTask on(){
        return instrumented(ValueEmptyRechargeTask.class);
    }

}
