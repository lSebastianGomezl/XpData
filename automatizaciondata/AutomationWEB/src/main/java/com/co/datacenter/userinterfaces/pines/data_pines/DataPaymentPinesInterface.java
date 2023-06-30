package com.co.datacenter.userinterfaces.pines.data_pines;

import net.serenitybdd.screenplay.targets.Target;

public class DataPaymentPinesInterface {

    public static Target XBOX_PRODUCT = Target.the("Localizador del producto Xbox")
            .locatedBy("//a[@id=\"formPagaPines:j_idt36:1:j_idt39\"]");
    public static Target SCROLL_TITLE_COMPRA_PINES = Target.the("Scroll hasta el titulo compra pines")
            .locatedBy("//a[@id=\"formPagaPines:j_idt47\"]");
    public static  Target INPUT_SELECT_PIN = Target.the("Select del valor del pin")
            .locatedBy("//label[@id=\"formPagaPines:j_idt56_label\"]");

    public static Target VALUE_CUPON = Target.the("localizador del valor 30000")
            .locatedBy("//li[@id=\"formPagaPines:j_idt56_1\"]");

    public static Target CHECK_BOX_PERSONAL_DATE = Target.the("Check box de datos personales")
            .locatedBy("//div[@id=\"formPagaPines:j_idt67\"]");


    // FORMULARIO DE DATOS PERSONALES

    public static Target INPUT_NUM_CEL = Target.the("Espacio de numero de celular")
            .locatedBy("//input[@id=\"formPagaPines:field_telefono_input\"]");

    public static Target CONFIRM_NUM_CEL = Target.the("Espacio de confirmacion de numero de celular")
            .locatedBy("//input[@id=\"formPagaPines:field_confirma_telefono_input\"]");

    public static Target CORREO_ELECTRONICO = Target.the("Espacio de correo electronico")
            .locatedBy("//input[@id=\"formPagaPines:field_correo\"]");

    public static Target CONFIRM_CORREO_ELECTRONICO = Target.the("Espacio de confirmar correo electronico")
            .locatedBy("//input[@id=\"formPagaPines:field_confirma_correo\"]");

    public static Target BTN_NEXT = Target.the("Boton de siguiente de datos")
            .locatedBy("//button[@id=\"formPagaPines:wizard_pagapines_next\"]");


    //CONFIRMACION DE COMPRA
    public static Target CHECK_BOX_METHOD_PAY = Target.the("Check box de metodo de pago")
            .locatedBy("//div[@id=\"mainForm:opt_22500\"]");
    public static Target BTN_PAYMENT = Target.the("Boton de pagar pin")
            .locatedBy("//button[@id=\"mainForm:j_idt118\"]");

    //BOTONES DE ALERTA DE DATOS INCORRECTO

    public static Target BTN_ACCEPT_ALERT = Target.the("Boton de aceptar alerta")
            .locatedBy("//button[@id=\"j_idt100\"]");

    public static Target SUCCESSFUL_TRANSACTION = Target.the("Titulo de valdiacion de paga exitoso")
            .locatedBy("//span[contains(text(), 'Pago exitoso')]");


}
