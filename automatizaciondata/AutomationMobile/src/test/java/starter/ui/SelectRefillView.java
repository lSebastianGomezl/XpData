package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectRefillView {

    public static Target CARD_REFILLS = Target.the("card de recargas y paquetes").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget." +
                    "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android." +
                    "widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]" +
                    "/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/" +
                    "android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView"));




}
