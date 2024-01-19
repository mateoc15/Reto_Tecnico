package com.amazon.automatizacion.userinterface;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;



public class ExitoPage extends PageObject {

  public static final Target INPUT_SEARCHBAR = Target.the("searchbar")
      .locatedBy("//form//input[@data-testid='store-input' and @placeholder='¿Que buscas?']");
  public static final Target BUTTON_SEARCH = Target.the("searchbutton")
      .locatedBy("//form//button[@data-testid='store-button' and @type='submit']");

}
