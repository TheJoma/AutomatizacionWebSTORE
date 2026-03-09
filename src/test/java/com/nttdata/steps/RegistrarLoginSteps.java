package com.nttdata.steps;

import com.nttdata.page.LoginPage;
import com.nttdata.page.RegistrarLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.nttdata.core.DriverManager.esperaImplicita;

public class RegistrarLoginSteps {


    private WebDriver driver;

    public RegistrarLoginSteps(WebDriver driver) {
        this.driver = driver;
    }


    public void seleccionarTratamiento(){
        driver.findElement(RegistrarLoginPage.tratamientoSr).click();
    }

    public void seleccionarOfertas(){
        driver.findElement(RegistrarLoginPage.ofertas).click();
    }

    public void aceptarTerminos(){
        driver.findElement(RegistrarLoginPage.terminosYCondiciones).click();
    }

    public void suscribirseNewsletter(){
        driver.findElement(RegistrarLoginPage.suscribirse).click();
    }

    public void aceptarPrivacidad(){
        driver.findElement(RegistrarLoginPage.privacidad).click();
    }
    public void typeGuardar(){
        this.driver.findElement(RegistrarLoginPage.guardarButton).click();
    }

    public void ingresarData(String nombre,String apellido,String correo,String password,String fechaNacimiento){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(RegistrarLoginPage.nombre));

        seleccionarTratamiento();
        driver.findElement(RegistrarLoginPage.nombre).sendKeys(nombre);
        driver.findElement(RegistrarLoginPage.apellido).sendKeys(apellido);
        driver.findElement(RegistrarLoginPage.correo).sendKeys(correo);
        driver.findElement(RegistrarLoginPage.password).sendKeys(password);
        driver.findElement(RegistrarLoginPage.fechaNacimiento).sendKeys(fechaNacimiento);
        seleccionarOfertas();
        aceptarTerminos();
        suscribirseNewsletter();
        aceptarPrivacidad();
    }

}
