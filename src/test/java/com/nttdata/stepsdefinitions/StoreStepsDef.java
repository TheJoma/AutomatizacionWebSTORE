package com.nttdata.stepsdefinitions;

import com.nttdata.steps.HomeSteps;
import com.nttdata.steps.LoginSteps;
import com.nttdata.steps.RegistrarLoginSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.*;

public class StoreStepsDef {


    private WebDriver driver;

    @Dado("estoy en la página de la tienda")
    public void estoy_en_la_página_de_la_tienda(){
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/");
        screenShot();
    }

    @Cuando("doy click en la opción iniciar sesión")
    public void doyClickEnLaOpciónIniciarSesión() {
        HomeSteps homeSteps = new HomeSteps(driver);
        homeSteps.login();
    }

    @Y("doy click en el link text cree una cuenta aquí")
    public void doyClickEnElLinkTextCreeUnaCuentaAquí() {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login();
        esperaImplicita();
        screenShot();
    }

    @Y("lleno los campos del formulario para el registro")
    public void llenoLosCamposDelFormularioParaElRegistro() {
        RegistrarLoginSteps registrarLoginSteps = new RegistrarLoginSteps(driver);
        String correo = "test" + System.currentTimeMillis() + "@mail.com";

        registrarLoginSteps.ingresarData("Jose","Pariasca",correo,"123123123@@testes","06/03/2001");
    }

    @Y("doy click en el botón guardar")
    public void doyClickEnElBotónGuardar() {
        RegistrarLoginSteps registrarLoginSteps = new RegistrarLoginSteps(driver);
        registrarLoginSteps.typeGuardar();
    }

    @Entonces("debería visualizar mi usuario logeado en la pantalla")
    public void deberíaVisualizarMiUsuarioLogeadoEnLaPantalla() {
        HomeSteps homeSteps = new HomeSteps(driver);
        Assertions.assertTrue(homeSteps.verUsuario());
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/");
        screenShot();
    }
}
