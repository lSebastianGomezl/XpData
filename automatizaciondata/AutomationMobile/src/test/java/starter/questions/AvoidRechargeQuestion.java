package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.AvoidRechargeView;

public class AvoidRechargeQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return AvoidRechargeView.TITLE_SUCESSFULL_RECHARGET.resolveFor(actor).getTextValue();
    }
    public static Question<String> value(){
        return new AvoidRechargeQuestion();
    }
}

