package com.nttdata.steps;

import com.nttdata.page.HomePage;
import com.nttdata.page.LoginPage;
import org.openqa.selenium.WebDriver;

public class HomeSteps {


    private WebDriver driver;

    public HomeSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void login(){
        this.driver.findElement(HomePage.iniciarSessionButton).click();
    }

    public boolean verUsuario(){
        return !driver.findElements(HomePage.usuarioLogeado).isEmpty();
    }
}
