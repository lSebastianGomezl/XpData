package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ServicesView {

    public static Target BTN_ACCEPT = Target.the("boton de aceptar").
            located(AppiumBy.id("android:id/button1"));

    public static Target TITLE_WELCOME = Target.the("titulo de exito en su venta").
            located(AppiumBy.id("android:id/message"));

    public static Target PRODUCT_AND_SERVICES = Target.the("Productos y servicios")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
                    "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget." +
                    "FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/" +
                    "android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout"));



}
