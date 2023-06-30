package com.co.datacenter.userinterfaces.recarga.select_operator;

import net.serenitybdd.screenplay.targets.Target;



public class SelectOperatorInterface {

    public static Target WELCOME_OPERATOR = Target.the("titulo de bienvenida").
            locatedBy("//*[@id=\"formRecarga:j_idt30\"]");

    public static Target CLARO= Target.the("operador claro").
            locatedBy("//*[@id=\"formRecarga:j_idt48:1:j_idt53\"]");

    public static Target CELULARES = Target.the("titulo celulares").
            locatedBy("//*[@id=\"formRecarga:wizard_recarga_content\"]/div/div[2]/li/div[1]/div[1]/h3");



}
