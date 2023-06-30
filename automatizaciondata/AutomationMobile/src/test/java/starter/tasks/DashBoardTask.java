package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.ServicesView;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DashBoardTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ServicesView.BTN_ACCEPT),
                Click.on(ServicesView.PRODUCT_AND_SERVICES)
        );
    }

    public static DashBoardTask done(){
        return instrumented(DashBoardTask.class);
    }
}
