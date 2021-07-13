package co.com.falabella.stepdefinitions;

import co.com.falabella.questions.PaginaPago;
import co.com.falabella.tasks.AbrirElNavegador;
import co.com.falabella.tasks.AgregaElProducto;
import co.com.falabella.tasks.AgregarDireccion;
import co.com.falabella.tasks.BuscarProducto;
import co.com.falabella.userinterfaces.FalabellaHomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class FalabellaStepDefinitions {
    @Managed(driver = "chrome")
    WebDriver herBrowser;

    Actor Juliana = Actor.named("Juliana");

    private FalabellaHomePage falabellaHomePage;

    @Before
    public void setUp(){
        Juliana.can(BrowseTheWeb.with(herBrowser));
        herBrowser.manage().window().maximize();
    }

    @Given("Juliana ingresa al sitio web")
    public void julianaIngresaAlSitioWeb() {
        Juliana.wasAbleTo(AbrirElNavegador.on(falabellaHomePage));
    }

    @When("Juliana agrega el producto a la bolsa de compra")
    public void julianaAgregaElProductoALaBolsaDeCompra(DataTable dataTable) {
        Juliana.attemptsTo(BuscarProducto.conLaData(dataTable));
        Juliana.attemptsTo(AgregaElProducto.on());
    }

    @When("Juliana realiza proceso de compra")
    public void julianaRealizaProcesoDeCompra(DataTable dataTable) {
        Juliana.attemptsTo(AgregarDireccion.conLaData(dataTable));
    }

    @Then("Juliana revisa opcion de pago")
    public void julianaRevisaOpcionDePago() {
        Juliana.should(seeThat(PaginaPago.Continue(), equalTo("Elige tu medio de pago")));
    }


}
