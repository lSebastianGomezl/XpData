package com.co.datacenter.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:8080/")
public class HomePageInterface extends PageObject {


    public static Target TITLE = Target.the("titulo de bienvenida").
            locatedBy("//*[@id=\"sentinel-highlight\"]/div/div/div/h1");



    public static Target BUTTON_INICIAR_SESION = Target.the("Boton de iniciar sesion").
            locatedBy("//span[contains(text(), 'Inicia Sesión')]");

}
