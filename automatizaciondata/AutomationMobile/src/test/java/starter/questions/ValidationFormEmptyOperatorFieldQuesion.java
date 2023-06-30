package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.ValidationFormFieldEmptyDataView;

public class ValidationFormEmptyOperatorFieldQuesion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return ValidationFormFieldEmptyDataView.TITLE_SELECT_OPERATOR.resolveFor(actor).getTextValue();
    }
    public static Question<String> value(){
        return new ValidationFormEmptyOperatorFieldQuesion();
    }
}

