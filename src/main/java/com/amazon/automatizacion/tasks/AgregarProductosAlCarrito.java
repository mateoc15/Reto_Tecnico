package com.amazon.automatizacion.tasks;

import static com.amazon.automatizacion.userinterface.ResultSearchPage.ADD_CART_LIST_RESULT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import org.openqa.selenium.WebDriver;

public class AgregarProductosAlCarrito implements Task {

  WebDriver driver;

  public AgregarProductosAlCarrito(WebDriver driver) {
    this.driver = driver;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Scroll.to(ADD_CART_LIST_RESULT),
        Click.on(ADD_CART_LIST_RESULT.resolveAllFor(actor).get(0)),
        Click.on(ADD_CART_LIST_RESULT.resolveAllFor(actor).get(1))
    );
  }

  public static AgregarProductosAlCarrito paraComprarlos(WebDriver driver) {
    return instrumented(AgregarProductosAlCarrito.class, driver);
  }

}
