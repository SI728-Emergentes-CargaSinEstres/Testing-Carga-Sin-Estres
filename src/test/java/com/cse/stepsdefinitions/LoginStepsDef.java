package com.cse.stepsdefinitions;

import com.cse.steps.LoginSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.cse.core.DriverManager.getDriver;
import static com.cse.core.DriverManager.screenShot;


public class LoginStepsDef {

    private WebDriver driver;


    @Dado("que soy un usuario tipo cliente registrado en la plataforma")
    public void queSoyUnUsuarioTipoClienteRegistradoEnLaPlataforma() {
        driver = getDriver();
        driver.get("https://cse-frontend-arquitectura.web.app/#/login");
        screenShot();
    }

    @Cuando("ingreso mi dirección de correo electronico {string} y contraseña: {string}")
    public void ingresoMiDirecciónDeCorreoElectronicoYContraseña(String user, String password) {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.typeUser(user);
        loginSteps.typePassword(password);
        loginSteps.login();
        screenShot();
    }

    @Entonces("soy redirigido a la página de inicio")
    public void soyRedirigidoALaPáginaDeInicio() {
        String expectedUrl = "https://cse-frontend-arquitectura.web.app/#/client";

        // Esperar hasta que la URL cambie a la esperada
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.urlMatches(".*#/client.*"));
        String currentUrl = driver.getCurrentUrl();
        screenShot();
        Assertions.assertTrue(currentUrl.startsWith(expectedUrl), "No se redirigió a la página de cliente correctamente. La URL actual es: " + currentUrl);
    }

}
