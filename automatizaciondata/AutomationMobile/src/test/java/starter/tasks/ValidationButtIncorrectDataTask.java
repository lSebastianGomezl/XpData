package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.HomeView;
import starter.ui.ValidationButtEmptyView;
import starter.ui.ValidationButtIncorrectDataView;
import starter.ui.ValidationIncorrectDataView;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidationButtIncorrectDataTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue("7UY").into(ValidationButtIncorrectDataView.SERIE_1),
                    Enter.theValue("0004565").into(ValidationButtIncorrectDataView.SERIE_2),
                    Click.on(ValidationButtIncorrectDataView.BTN_NEXT),
                    Click.on(ValidationIncorrectDataView.BTN_ACCEPT)
            );
    }

    public static ValidationButtIncorrectDataTask on(){
        return instrumented(ValidationButtIncorrectDataTask.class);
    }
}
