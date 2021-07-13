package co.com.falabella.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.falabella.com.co/falabella-co")
public class FalabellaHomePage extends PageObject {
    public static final Target CLOSE_ALERT = Target.the("Cerrar aviso importante").located(By.id("fake-close"));
    public static final Target CLOSE_ALERT2 = Target.the("Cerrar aviso de suscripción").located(By.id("acc-alert-close"));
    public static final Target SEARCH = Target.the("Campo de busqueda").located(By.id("testId-SearchBar-Input"));
    public static final Target SEARCH_BUTTON = Target.the("Boton de busqueda").located(By.xpath("//*[@class='SearchBar-module_searchBtnIcon__VR3f5 SearchBar-module_showFlatEdges__1GPM7 SearchBar-module_overlap__2KHbe']"));

    public FalabellaHomePage(){super();}
}
