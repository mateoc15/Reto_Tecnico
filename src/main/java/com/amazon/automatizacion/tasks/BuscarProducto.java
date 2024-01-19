package com.amazon.automatizacion.tasks;

import static com.amazon.automatizacion.userinterface.ExitoPage.BUTTON_SEARCH;
import static com.amazon.automatizacion.userinterface.ExitoPage.INPUT_SEARCHBAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

public class BuscarProducto implements Task {
  WebDriver driver;

  public BuscarProducto(WebDriver driver) {
    this.driver = driver;
  }
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        WaitUntil.the(INPUT_SEARCHBAR, isVisible()),
        Click.on(INPUT_SEARCHBAR),
        Enter.theValue("Tecnologia").into(INPUT_SEARCHBAR),
        Click.on(BUTTON_SEARCH)
    );
  }

  @Override
  public Performable then(Performable nextPerformable) {
    return Task.super.then(nextPerformable);
  }
  public static BuscarProducto deTecnologia(WebDriver driver){
    return instrumented(BuscarProducto.class, driver);
  }
}
