package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.ValidationButtEmptyView;
import starter.ui.ValidationButtIncorrectDataView;

public class ValidationButtIncorrectQuestion implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return ValidationButtIncorrectDataView.TITLE_ERROR.resolveFor(actor).getTextContent();
    }

    public static Question<String> value(){
        return new ValidationButtIncorrectQuestion();
    }
}

