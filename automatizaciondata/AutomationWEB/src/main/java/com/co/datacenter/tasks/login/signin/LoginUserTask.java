package com.co.datacenter.tasks.login.signin;

import com.co.datacenter.userinterfaces.login.LoginUserUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginUserTask implements Task {
    @Step("{0} Sebas login to successful")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
        Enter.theValue("sebastian.gomez@dcsas.com.co").into(LoginUserUserInterface.USERNAME),
                Enter.theValue("1094956106Sg").into(LoginUserUserInterface.PASSWORD),

                /*Comentar CheckBox 1 y 3 para lanzar el test secuencial de recarga*/

                Click.on(LoginUserUserInterface.CHECK_BOX_1),
                Click.on(LoginUserUserInterface.CHECK_BOX_2),
                Click.on(LoginUserUserInterface.CHECK_BOX_3),


                Scroll.to(LoginUserUserInterface.BTN_LOGIN),
                Click.on(LoginUserUserInterface.BTN_LOGIN)
        );


    }
    public static LoginUserTask on(){
        return instrumented(LoginUserTask.class);
    }
}
