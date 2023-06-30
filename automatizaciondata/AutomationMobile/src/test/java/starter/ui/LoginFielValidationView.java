package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginFielValidationView {

    public static Target alertPhoneCalls = Target.the("alert phonecalls").
            located(AppiumBy.id("com.android.packageinstaller:id/permission_allow_button"));

    public static Target alertFiles = Target.the("alert files").
            located(AppiumBy.id("com.android.packageinstaller:id/permission_allow_button"));

    public static Target BTN_LOGIN = Target.the("button Login").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/btnLogin"));

    public static Target BTN_ACCEPT = Target.the("button aceptar").
            located(AppiumBy.id("android:id/button1"));


    public static Target TITLE_VALIDATE = Target.the("titulo de ingresar asesor").
            located(AppiumBy.id("android:id/message"));


}
