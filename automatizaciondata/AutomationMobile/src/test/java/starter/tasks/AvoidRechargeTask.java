package starter.tasks;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;


import starter.interaccion.Swipe;
import starter.ui.AvoidRechargeView;


import static java.time.Duration.ofSeconds;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AvoidRechargeTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {



        actor.attemptsTo(
                Click.on(AvoidRechargeView.SELECT_OPERATOR),
                Click.on(AvoidRechargeView.VALUE_OPERATOR),
                Click.on(AvoidRechargeView.SELECT_PACKAGE),
                Click.on(AvoidRechargeView.PACKAGE_VALUE),
                Enter.theValue("3006593822").into(AvoidRechargeView.NUMBER_CELLPHONE),
                Enter.theValue("3006593822").into(AvoidRechargeView.CONFIRM_CELLPHONE)
                );

        actor.attemptsTo(
                Swipe.scrollUp(),
                Click.on(AvoidRechargeView.BTN_NEXT),
                Click.on(AvoidRechargeView.BTN_PAY
        ));


    }

    public static AvoidRechargeTask avoid() {
        return instrumented(AvoidRechargeTask.class);
    }

}