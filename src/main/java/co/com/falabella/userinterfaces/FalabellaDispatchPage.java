package co.com.falabella.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FalabellaDispatchPage extends PageObject {
    public static final Target REGION = Target.the("Seleccionar departamento").located(By.id("region"));
    public static final Target SELECT_REGION = Target.the("Escoge el departamento deseado").locatedBy("//*[//*[@id='region']//child::text() and text()='{0}']");
    public static final Target CITY = Target.the("Seleccionar ciudad").located(By.id("ciudad"));
    public static final Target SELECT_CITY = Target.the("Escoge la ciudad deseada").locatedBy("//*[//*[@id='ciudad']//child::text() and text()='{0}']");
    public static final Target NEIGHBORHOOD = Target.the("Seleccionar barrio").located(By.id("comuna"));
    public static final Target SELECT_NEIGHBORHOOD = Target.the("Escoge el barrio deseado").locatedBy("//*[@id='comuna']/option[@value='{0}']");
    public static final Target CONTINUE_BUTTON = Target.the("Boton de continuar").located(By.xpath("//*[@class='fbra_button fbra_test_button fbra_formItem__field04']"));
    public static final Target ADDRESS = Target.the("Direccion").located(By.id("address"));
    public static final Target DEPARTMENT_NUMBER = Target.the("Numero de departamento").located(By.id("departmentNumber"));
    public static final Target ADDRESS_BUTTON = Target.the("Boton de ingresar direccion").located(By.xpath("//*[@class='fbra_button fbra_test_button fbra_formItem__useAddress']"));
    public static final Target CONTINUE_BUTTON2 = Target.the("Boton de continuar").located(By.xpath("//*[@class='fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton']"));

    public FalabellaDispatchPage(){super();}
}
