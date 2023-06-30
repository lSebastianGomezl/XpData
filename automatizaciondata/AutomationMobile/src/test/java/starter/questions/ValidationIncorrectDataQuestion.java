package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.LoginFielValidationView;
import starter.ui.ValidationIncorrectDataView;

public class ValidationIncorrectDataQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return ValidationIncorrectDataView.TITLE_VALIDATE_USER_INCORRECT.resolveFor(actor).getText();
    }

    public static Question<String> value(){
        return new ValidationIncorrectDataQuestion();
    }
}

