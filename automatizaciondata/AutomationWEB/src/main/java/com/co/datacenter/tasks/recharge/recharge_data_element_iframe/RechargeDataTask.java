package com.co.datacenter.tasks.recharge.recharge_data_element_iframe;

import com.co.datacenter.userinterfaces.recarga.recharge_data.RechargeDataInterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RechargeDataTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo(
                        WaitUntil.the(RechargeDataInterface.TITLE_REHCARGE_DATA, isVisible()),
                        Scroll.to((RechargeDataInterface.TITLE_REHCARGE_DATA))
                );

                actor.attemptsTo(
                        WaitUntil.the(RechargeDataInterface.INPUT_CELLPHONE_NUM,isVisible()),
                        Enter.theValue("3006593822").into(RechargeDataInterface.INPUT_CELLPHONE_NUM)
                );

                actor.attemptsTo(
                        WaitUntil.the(RechargeDataInterface.SELECT_PACKAGE,isVisible()),
                        Click.on(RechargeDataInterface.SELECT_PACKAGE)
                );

                actor.attemptsTo(
                        WaitUntil.the(RechargeDataInterface.VALUE_PACKAGE,isVisible()),
                        Click.on(RechargeDataInterface.VALUE_PACKAGE)

                );

                actor.attemptsTo(
                        WaitUntil.the(RechargeDataInterface.BTN_NEXT_RECHARGE_DATE, isVisible()),
                        Click.on(RechargeDataInterface.BTN_NEXT_RECHARGE_DATE)
                );

                actor.attemptsTo(
                        WaitUntil.the(RechargeDataInterface.BTN_ALERT,isVisible()),
                        Click.on(RechargeDataInterface.BTN_ALERT)
                );

                actor.attemptsTo(
                        WaitUntil.the(RechargeDataInterface.SELECT_PACKAGE,isVisible()),
                        Click.on(RechargeDataInterface.SELECT_PACKAGE)
                );

                actor.attemptsTo(
                        WaitUntil.the(RechargeDataInterface.VALUE_PACKAGE_x2,isVisible()),
                        Click.on(RechargeDataInterface.VALUE_PACKAGE_x2)
                );

                actor.attemptsTo(
                        WaitUntil.the(RechargeDataInterface.BTN_NEXT_RECHARGE_DATE, isVisible()),
                        Click.on(RechargeDataInterface.BTN_NEXT_RECHARGE_DATE)
                );

    }

    public static RechargeDataTask on(){
        return instrumented(RechargeDataTask.class);
    }
}
