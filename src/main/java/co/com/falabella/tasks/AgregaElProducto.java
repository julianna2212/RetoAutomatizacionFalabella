package co.com.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.falabella.userinterfaces.FalabellaSearchPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregaElProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(PRODUCT), Click.on(ADD_SHOPPING_BAG_BUTTON),
                Click.on(SEE_SHOPPING_BAG_BUTTON));

    }

    public static AgregaElProducto on() {return instrumented(AgregaElProducto.class);}
}
