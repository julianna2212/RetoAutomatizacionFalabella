package co.com.falabella.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.falabella.userinterfaces.FalabellaHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarProducto implements Task {
    List<String> producto;

    public BuscarProducto(DataTable producto){this.producto = producto.asList();}

    @Override
    public <T extends Actor> void  performAs(T actor){
        actor.attemptsTo(Click.on(CLOSE_ALERT),Click.on(CLOSE_ALERT2),
                Enter.theValue(producto.get(0)).into(SEARCH),Click.on(SEARCH_BUTTON));
    }

    public static BuscarProducto conLaData(DataTable producto){return instrumented(BuscarProducto.class,producto);}
}
