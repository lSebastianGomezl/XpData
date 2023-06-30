package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginView {

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
}
