package co.com.falabella.questions;

import co.com.falabella.userinterfaces.FalabellaPaymentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PaginaPago implements Question<String> {
    @Override
    public String answeredBy(Actor actor){
        return Text.of(FalabellaPaymentPage.getTitle1()).viewedBy(actor).asString();
    }
    public static PaginaPago Continue(){
        return new PaginaPago();
    }
}
