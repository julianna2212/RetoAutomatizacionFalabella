package co.com.falabella.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirElNavegador implements Task {
    private final PageObject page;

    public AbrirElNavegador(PageObject page){
        this.page = page;
    }

    @Override
    @Step("{0} Abrir el navegador en la pagina principal de Falabella")
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(page));
    }

    public static AbrirElNavegador on (PageObject page){
        return instrumented(AbrirElNavegador.class,page);
    }
}
