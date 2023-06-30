package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RefillsAndPackagesView {

    public static Target CARD_NEW_REFILLS = Target.the("card de recargas y paquetes").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                    "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
                    "android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/" +
                    "android.widget.LinearLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/" +
                    "android.widget.TextView"));
}
