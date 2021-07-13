package co.com.falabella.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.util.List;

import static co.com.falabella.userinterfaces.FalabellaShoppingBagPage.BUY_BUTTON;
import static co.com.falabella.userinterfaces.FalabellaDispatchPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarDireccion implements Task {
    List<String> direccion;

    public AgregarDireccion(DataTable direccion){this.direccion = direccion.asList();}

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(BUY_BUTTON), Click.on(REGION), Click.on(SELECT_REGION.of(direccion.get(0))),
                Click.on(CITY), Click.on(SELECT_CITY.of(direccion.get(1))),
                Click.on(NEIGHBORHOOD), Click.on(SELECT_NEIGHBORHOOD.of(direccion.get(2))),
                Click.on(CONTINUE_BUTTON),Enter.theValue(direccion.get(3)).into(ADDRESS),
                Enter.theValue(direccion.get(4)).into(DEPARTMENT_NUMBER),Click.on(ADDRESS_BUTTON),
                Click.on(CONTINUE_BUTTON2));

    }

    public static AgregarDireccion conLaData(DataTable direccion){return instrumented(AgregarDireccion.class,direccion);}
}
