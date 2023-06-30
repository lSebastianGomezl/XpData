package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.ValidationButtEmptySerie1View;

public class ValidationButtEmptySerie2Question implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return ValidationButtEmptySerie1View.TITLE_ERROR.resolveFor(actor).getTextContent();
    }

    public static Question<String> value(){
        return new ValidationButtEmptySerie2Question();
    }
}

