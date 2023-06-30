package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.HomeView;
import starter.ui.ValidationButtEmptyView;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidationButtEmptyTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(ValidationButtEmptyView.BTN_NEXT),
                    Click.on(ValidationButtEmptyView.BTN_ACCEPT)
            );

    }

    public static ValidationButtEmptyTask on(){
        return instrumented(ValidationButtEmptyTask.class);
    }
}
