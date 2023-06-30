package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.ValidationEmptyPasswordView;
import starter.ui.ValidationEmptyUserView;

public class ValidationEmptytUserQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return ValidationEmptyUserView.TITLE_VALIDATE_USER_EMPTY.resolveFor(actor).getText();
    }

    public static Question<String> value(){
        return new ValidationEmptytUserQuestion();
    }
}

