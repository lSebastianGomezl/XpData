package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.ValidationFormFieldEmptyDataView;
import starter.ui.ValidationFormOtherValueView;

public class ValidationFormEmptyOtheValueQuesion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return ValidationFormOtherValueView.TITLE_SELECT_OPERATOR.resolveFor(actor).getTextValue();
    }
    public static Question<String> value(){
        return new ValidationFormEmptyOtheValueQuesion();
    }
}

