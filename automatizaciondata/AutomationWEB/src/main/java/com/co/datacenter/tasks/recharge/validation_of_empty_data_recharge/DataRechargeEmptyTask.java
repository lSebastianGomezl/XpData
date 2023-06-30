package com.co.datacenter.tasks.recharge.validation_of_empty_data_recharge;

import com.co.datacenter.userinterfaces.recarga.validation_of_empty_data_recharge.DataRechargeEmptyInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DataRechargeEmptyTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DataRechargeEmptyInterface.TITLE_REHCARGE_DATA, isVisible()),
                Scroll.to((DataRechargeEmptyInterface.TITLE_REHCARGE_DATA))
        );

        actor.attemptsTo(
                WaitUntil.the(DataRechargeEmptyInterface.INPUT_CELLPHONE_NUM,isVisible()),
                Enter.theValue("").into(DataRechargeEmptyInterface.INPUT_CELLPHONE_NUM)
        );


        actor.attemptsTo(
                WaitUntil.the(DataRechargeEmptyInterface.BTN_NEXT_RECHARGE_DATE, isVisible()),
                Click.on(DataRechargeEmptyInterface.BTN_NEXT_RECHARGE_DATE)
        );
    }

    public static DataRechargeEmptyTask on(){
        return instrumented(DataRechargeEmptyTask.class);
    }
}
