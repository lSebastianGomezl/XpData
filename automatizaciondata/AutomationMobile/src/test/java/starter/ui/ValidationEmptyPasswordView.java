package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidationEmptyPasswordView {

    public static Target alertPhoneCalls = Target.the("alert phonecalls").
            located(AppiumBy.id("com.android.packageinstaller:id/permission_allow_button"));

    public static Target alertFiles = Target.the("alert files").
            located(AppiumBy.id("com.android.packageinstaller:id/permission_allow_button"));

    public static Target userName = Target.the("input User").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/tvSellerCode"));

    public static Target password = Target.the("input password").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/tvPassword"));

    public static Target BTN_LOGIN = Target.the("button Login").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/btnLogin"));

    public static Target TITLE_VALIDATE_PASSWORD_EMPTY = Target.the("titulo Debe ingresar una contraseña").
            located(AppiumBy.id("android:id/message"));

    public static Target BTN_ACCEPT = Target.the("button aceptar").
            located(AppiumBy.id("android:id/button1"));


}
