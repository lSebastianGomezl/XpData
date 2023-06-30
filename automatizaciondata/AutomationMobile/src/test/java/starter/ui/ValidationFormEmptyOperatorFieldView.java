package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidationFormEmptyOperatorFieldView {




    public static Target SELECT_OPERATOR = Target.the("seleccionar un operador").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/spinner_operators"));

    public static Target VALUE_OPERATOR = Target.the("seleccionar un operador").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/" +
                    "android.widget.ListView/android.widget.TextView[2]"));

    public static Target SELECT_PACKAGE = Target.the("seleccionar un paquete").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/spinner_package"));

    public static Target PACKAGE_VALUE = Target.the("valor del paquete").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout" +
                    "/android.widget.ListView/android.widget.TextView[2]"));

    public static Target SELECT_OPERATOR_1 = Target.the("seleccionar un operador").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]"));

    public static Target NUMBER_CELLPHONE = Target.the("numero de celular").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/txtNumberRecharge"));

    public static Target CONFIRM_CELLPHONE = Target.the("confirmar numero de celular").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/txtNumberRechargeConfirm"));
    public static Target SELECT_RECHARGE_VALUE = Target.the("seleccionar valor de la recarga").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/spinner_value"));
    public static Target RECHARGE_VALUE = Target.the("valor de la recarga").
            located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]"));

    public static Target BTN_BACK = Target.the("boton atras").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/btnBack"));


    public static Target BTN_NEXT = Target.the("boton siguiente").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/btnNext"));


    public static Target TITLE_SELECT_OPERATOR = Target.the("Selecciona un operador").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/labelErrorNumberConfirm"));



    }

























