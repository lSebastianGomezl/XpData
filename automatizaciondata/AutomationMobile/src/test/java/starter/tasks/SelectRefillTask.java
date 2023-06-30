package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.RefillsAndPackagesView;
import starter.ui.SelectRefillView;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectRefillTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectRefillView.CARD_REFILLS),
                Click.on(RefillsAndPackagesView.CARD_NEW_REFILLS)
        );
    }

    public static SelectRefillTask select(){
        return instrumented(SelectRefillTask.class);
    }
}
