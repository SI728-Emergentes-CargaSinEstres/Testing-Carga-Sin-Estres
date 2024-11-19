package com.cse.stepsdefinitions;

import com.cse.steps.ContractSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;

import static com.cse.core.DriverManager.getDriver;
import static com.cse.core.DriverManager.screenShot;

public class ContractStepsDef {
    private WebDriver driver;

    @Dado("que soy un usuario que tiene una solicitud programada")
    public void queSoyUnUsuarioQueTieneUnaSolicitudProgramada() {
        driver = getDriver();
        driver.get("https://cse-frontend-arquitectura.web.app/#/client/3/active-reservations");
        screenShot();
    }

    @Cuando("elija la opción de ver el contrato")
    public void elijaLaOpciónDeVerElContrato() {
        ContractSteps contractSteps = new ContractSteps(driver);
        contractSteps.selectViewDetails();
        screenShot();
    }


    @Entonces("la aplicación debe mostrarme el contrato")
    public void laAplicaciónDebeMostrarmeElContrato() {
        ContractSteps contractSteps = new ContractSteps(driver);
        contractSteps.findContract();
        screenShot();
    }
}
