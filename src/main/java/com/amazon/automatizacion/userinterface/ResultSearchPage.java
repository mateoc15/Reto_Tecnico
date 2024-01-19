package com.amazon.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class ResultSearchPage extends PageObject {
  public static final Target ADD_CART_LIST_RESULT = Target.the("listresultproduct")
      .locatedBy("//div[contains(@class,'product-grid')]//ul//li//button[contains(@class,'DefaultStyle')]");

  public static final Target BUTTON_CART = Target.the("CartButton")
      .locatedBy("//button[@data-testid='cart-toggle']");
}
