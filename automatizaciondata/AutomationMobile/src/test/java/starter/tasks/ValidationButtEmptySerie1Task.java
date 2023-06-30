package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.ValidationButtEmptySerie1View;
import starter.ui.ValidationButtEmptySerie2View;
import starter.ui.ValidationButtEmptyView;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidationButtEmptySerie1Task implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue("").into(ValidationButtEmptySerie2View.SERIE_1),
                    Enter.theValue("0000333").into(ValidationButtEmptySerie1View.SERIE_2),
                    Click.on(ValidationButtEmptySerie1View.BTN_NEXT),
                    Click.on(ValidationButtEmptySerie1View.BTN_ACCEPT)
            );
    }

    public static ValidationButtEmptySerie1Task on(){
        return instrumented(ValidationButtEmptySerie1Task.class);
    }
}
