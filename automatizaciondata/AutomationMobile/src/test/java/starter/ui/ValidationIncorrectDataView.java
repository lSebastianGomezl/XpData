package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidationIncorrectDataView {

    public static Target alertPhoneCalls = Target.the("alert phonecalls").
            located(AppiumBy.id("com.android.packageinstaller:id/permission_allow_button"));

    public static Target alertFiles = Target.the("alert files").
            located(AppiumBy.id("com.android.packageinstaller:id/permission_allow_button"));

    public static Target userName = Target.the("input User").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/tvSellerCode"));

    public static Target password = Target.the("input password").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/tvPassword"));

    public static Target BTN_LOGIN = Target.the("button Login").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.Button"));

    public static Target TITLE_VALIDATE_USER_INCORRECT = Target.the("titulo El vendedor no existe").
            located(AppiumBy.id("android:id/message"));

    public static Target BTN_ACCEPT = Target.the("button aceptar").
            located(AppiumBy.id("android:id/button1"));


}
