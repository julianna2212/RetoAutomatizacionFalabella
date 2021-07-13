package co.com.falabella.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FalabellaSearchPage extends PageObject {
    public static final Target PRODUCT = Target.the("Producto").located(By.id("testId-pod-2539336"));
    public static final Target ADD_SHOPPING_BAG_BUTTON = Target.the("Boton de agregar a la bolsa").located(By.id("testId-Pod-action-prod7150013"));
    public static final Target SEE_SHOPPING_BAG_BUTTON = Target.the("Boton de ver a la bolsa de compra").located(By.id("linkButton"));

    public FalabellaSearchPage(){super();}
}
