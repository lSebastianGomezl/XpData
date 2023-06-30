package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.HomeView;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DigitalpaperTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue("VV10").into(HomeView.SERIE_1),
                    Enter.theValue("0000015").into(HomeView.SERIE_2),
                    Click.on(HomeView.BTN_NEXT)
            );
    }

    public static DigitalpaperTask on(){
        return instrumented(DigitalpaperTask.class);
    }
}
