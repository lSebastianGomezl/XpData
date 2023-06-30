package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.HomeView;

public class LoginQuestion implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return HomeView.TITLE_DIGITAL_BUTT.resolveFor(actor).getText();
    }


    public static Question<String> value(){
        return new LoginQuestion();
    }
}
