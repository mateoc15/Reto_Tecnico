package com.amazon.automatizacion.stepdefinitions;

import static com.amazon.automatizacion.userinterface.ResultSearchPage.BUTTON_CART;

import com.amazon.automatizacion.tasks.AgregarProductosAlCarrito;
import com.amazon.automatizacion.tasks.BuscarProducto;
import com.amazon.automatizacion.userinterface.ExitoPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AgregarAlCarritoDeCompras {
  @Managed(driver="chrome")
  WebDriver hisBrowser;

  private final Actor user = Actor.named("Mateo");
  static WebDriver browser;

  @Before
  public void setup() throws IOException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Usuario\\Documents\\Template_Automatizacion_SQA\\src\\test\\resources\\chromedriver.exe");
    browser = new ChromeDriver();

  }
  ExitoPage amazonPage;
  @Given("que el usuario ingresa al sitio web de Amazon")
  public void queElUsuarioIngresaAlSitioWebDeAmazon() {
    browser.get("https://www.exito.com/");
  }
  @When("el usuario busca productos de tecnología")
  public void elUsuarioBuscaProductosDeTecnología() {
    user.attemptsTo(BuscarProducto.deTecnologia(browser));
  }
  @When("Agrega los dos primeros productos al carrito")
  public void agregaLosDosPrimerosProductosAlCarrito() {
    user.attemptsTo(AgregarProductosAlCarrito.paraComprarlos(browser));
  }
  @When("voy al carrito de compras")
  public void voyAlCarritoDeCompras() {
    user.attemptsTo(
        Click.on(BUTTON_CART)
    );
  }
  @Then("deberia visualizar los dos productos agregados al carrito de compras")
  public void deberiaVisualizarLosDosProductosAgregadosAlCarritoDeCompras() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }


}
