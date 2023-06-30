package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeView {

    public static Target TITLE_DIGITAL_BUTT = Target.the("Titulo de interfaz colilla").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/tvTitleInput"));

    public static Target SERIE_1 = Target.the("serie1 value").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/etSerie1"));
    public static Target SERIE_2 = Target.the("serie2 value").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/etSerie2"));

    public static Target BTN_NEXT = Target.the("btn siguiente").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/btnNext"));



}
