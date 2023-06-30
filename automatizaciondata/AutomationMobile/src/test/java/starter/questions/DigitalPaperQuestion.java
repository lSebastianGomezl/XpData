package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import starter.ui.ServicesView;

public class DigitalPaperQuestion implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return ServicesView.TITLE_WELCOME.resolveFor(actor).getTextContent();
    }

    public static Question<String> value(){
        return new DigitalPaperQuestion();
    }
}

