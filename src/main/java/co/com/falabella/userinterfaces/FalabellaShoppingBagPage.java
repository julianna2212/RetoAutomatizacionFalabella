package co.com.falabella.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FalabellaShoppingBagPage extends PageObject {
    public static final Target BUY_BUTTON = Target.the("Boton de ir a comprar").located(By.xpath("//*[@class='fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase']"));

    public FalabellaShoppingBagPage(){super();}
}
