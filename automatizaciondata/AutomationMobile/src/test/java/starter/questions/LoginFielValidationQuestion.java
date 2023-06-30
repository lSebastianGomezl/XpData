package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.LoginFielValidationView;

public class LoginFielValidationQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return LoginFielValidationView.TITLE_VALIDATE.resolveFor(actor).getText();
    }

    public static Question<String> value(){
        return new LoginFielValidationQuestion();
    }
}

