package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.ServicesView;
import starter.ui.ValidationButtEmptyView;

public class ValidationButtEmptyQuestion implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return ValidationButtEmptyView.TITLE_ERROR.resolveFor(actor).getText();
    }

    public static Question<String> value(){
        return new ValidationButtEmptyQuestion();
    }
}

