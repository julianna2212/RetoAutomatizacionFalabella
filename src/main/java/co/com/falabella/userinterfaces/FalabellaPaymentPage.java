package co.com.falabella.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FalabellaPaymentPage extends PageObject {
    public static final Target TITLE = Target.the("Titulo de la pagina").located(By.xpath("//*[@class='fbra_paymentOptionsTitle__heading__payment']"));
    public static Target getTitle1() {
        return TITLE;
    }

    public FalabellaPaymentPage(){super();}
}
