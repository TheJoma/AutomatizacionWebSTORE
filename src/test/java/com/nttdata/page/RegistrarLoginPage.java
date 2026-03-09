package com.nttdata.page;

import org.openqa.selenium.By;

public class RegistrarLoginPage {

    public static By tratamientoSr = By.id("field-id_gender-1");
    public static By nombre = By.id("field-firstname");
    public static By apellido = By.id("field-lastname");
    public static By correo = By.id("field-email");
    public static By password = By.id("field-password");
    public static By mostrar = By.cssSelector("span.input-group-btn");
    public static By fechaNacimiento = By.id("field-birthday");
    public static By ofertas = By.cssSelector("input[name='optin']");
    //public static By ofertas = By.name("input.optin");
    public static By terminosYCondiciones = By.cssSelector("input[name='psgdpr']");
    public static By suscribirse = By.cssSelector("input[name='newsletter']");
    public static By privacidad = By.cssSelector("input[name='customer_privacy']");
    public static By guardarButton = By.cssSelector("button.form-control-submit");


}
