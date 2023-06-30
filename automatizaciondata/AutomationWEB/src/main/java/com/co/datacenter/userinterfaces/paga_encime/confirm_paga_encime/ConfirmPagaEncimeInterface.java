package com.co.datacenter.userinterfaces.paga_encime.confirm_paga_encime;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmPagaEncimeInterface {

    public static Target SCROLL_1 = Target.the("Scroll 1 el titulo Apuesta 1")
            .locatedBy("//b[contains(text(), 'APUESTA')]");

    public static Target CHECK_BOX_PAY = Target.the("Check box de pagar mi saldo")
            .locatedBy("//span[@class=\"ui-radiobutton-icon ui-icon ui-icon-blank ui-c\"]");

    public static Target BTN_PAY = Target.the("Boton de siguiente")
            //.locatedBy("//button[@id=\"mainForm:j_idt109\"]");
            .located(By.id("mainForm:j_idt113"));

    public static Target BTN_NEXT = Target.the("Boton de siguiente")
            //.locatedBy("//button[@id=\"mainForm:j_idt109\"]");
            .located(By.id("mainForm:j_idt113"));

    public static Target BTN_ACCEPT_VALDIATION = Target.the("Boton aceptar alerta")
            .located(By.id("mainForm:j_idt451"));

    public static Target TITLE_VALIDATION = Target.the("Titulo de validacion de pago exitoso")
            .locatedBy("//span[contains(text(), 'Pago exitoso')]");
}
