package com.co.datacenter.userinterfaces.recarga.validation_of_empty_data_recharge;

import net.serenitybdd.screenplay.targets.Target;

public class DataRechargeEmptyInterface {

    public static Target TITLE_REHCARGE_DATA = Target.the("realizar recarga").
            locatedBy("//*[@id=\"formRecarga:j_idt30\"]");
    //*[@id="formRecarga:wizard_recarga_content"]/div[1]/div[1]/div

    public static Target INPUT_CELLPHONE_NUM = Target.the("numero de celular").
            locatedBy("//input[@id=\"formRecarga:field_celular\"]");

    public static Target SELECT_PACKAGE = Target.the("seleccion de paquete").
            locatedBy("//label[@id=\"formRecarga:j_idt85_label\"]");

    public static Target VALUE_PACKAGE = Target.the("valor del paquete").
            locatedBy("//*[@id=\"formRecarga:j_idt85_1\"]");

    public static Target BTN_NEXT_RECHARGE_DATE = Target.the("valor del paquete").
            locatedBy("//button[@id=\"formRecarga:wizard_recarga_next\"]");


    public static Target TITLE_ALERT= Target.the("titulo de alerta").
            locatedBy("//*[@id=\"formRecarga:j_idt77\"]/span[2]\n");






}
