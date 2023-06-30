package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.ValidationFormDiferentNumbersView;
import starter.ui.ValidationFormFieldEmptyDataView;

public class ValidationFormDiferentNumbersQuesion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return ValidationFormDiferentNumbersView.TITLE_SELECT_OPERATOR.resolveFor(actor).getTextValue();
    }
    public static Question<String> value(){
        return new ValidationFormDiferentNumbersQuesion();
    }
}

