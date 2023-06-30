package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ValidationButtEmptySerie1View {

    public static Target SERIE_1 = Target.the("serie1 value").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/etSerie1"));

    public static Target SERIE_2 = Target.the("serie2 value").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/etSerie2"));

    public static Target BTN_NEXT = Target.the("btn siguiente").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/btnNext"));

    public static Target BTN_ACCEPT = Target.the("button aceptar").
            located(AppiumBy.id("android:id/button1"));

    public static Target TITLE_ERROR = Target.the("title error").
            located(AppiumBy.id("android:id/message"));




}
