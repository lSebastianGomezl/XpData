package starter.ui;

import io.appium.java_client.AppiumBy;

import io.appium.java_client.MobileCommand;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class AvoidRechargeView {




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

    public static Target NUMBER_CELLPHONE = Target.the("numero de celular").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/txtNumberRecharge"));

    public static Target CONFIRM_CELLPHONE = Target.the("confirmar numero de celular").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/txtNumberRechargeConfirm"));

    public static Target BTN_BACK = Target.the("boton atras").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/btnBack"));


    public static Target BTN_NEXT = Target.the("boton siguiente").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/btnNext"));

    public static Target BTN_PAY = Target.the("boton pagar recarga").
            located(AppiumBy.id("android:id/button1"));


    public static Target TITLE_SUCESSFULL_RECHARGET = Target.the("recarga exitosa").
            located(AppiumBy.id("co.com.pagatodo.core.dataphone.testrelease:id/alertTitle"));



    }

























