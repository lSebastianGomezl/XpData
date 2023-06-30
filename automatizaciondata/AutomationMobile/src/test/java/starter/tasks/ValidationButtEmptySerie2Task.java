package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.ValidationButtEmptySerie1View;
import starter.ui.ValidationButtEmptySerie2View;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidationButtEmptySerie2Task implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue("0000333").into(ValidationButtEmptySerie2View.SERIE_1),
                    Enter.theValue("").into(ValidationButtEmptySerie2View.SERIE_2),
                    Click.on(ValidationButtEmptySerie2View.BTN_NEXT),
                    Click.on(ValidationButtEmptySerie2View.BTN_ACCEPT)
            );
    }

    public static ValidationButtEmptySerie2Task on(){
        return instrumented(ValidationButtEmptySerie2Task.class);
    }
}
