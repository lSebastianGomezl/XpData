package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidationButtEmptyView {

    public static Target BTN_NEXT = Target.the("btn siguiente").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/btnNext"));

    public static Target BTN_ACCEPT = Target.the("button aceptar").
            located(AppiumBy.id("android:id/button1"));

    public static Target TITLE_ERROR = Target.the("Debe ingresar las series de las colillas.").
            located(AppiumBy.id("android:id/message"));




}
