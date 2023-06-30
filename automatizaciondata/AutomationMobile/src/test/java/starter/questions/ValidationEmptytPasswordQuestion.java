package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.ValidationEmptyPasswordView;
import starter.ui.ValidationIncorrectDataView;

public class ValidationEmptytPasswordQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return ValidationEmptyPasswordView.TITLE_VALIDATE_PASSWORD_EMPTY.resolveFor(actor).getText().substring(0,26);
    }

    public static Question<String> value(){
        return new ValidationEmptytPasswordQuestion();
    }
}

