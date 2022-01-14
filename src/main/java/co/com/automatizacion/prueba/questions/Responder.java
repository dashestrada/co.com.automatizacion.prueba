package co.com.automatizacion.prueba.questions;

import co.com.automatizacion.prueba.model.UtestDatos;
import co.com.automatizacion.prueba.userinterface.FinalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Responder implements Question<Boolean> {

    private List<UtestDatos> datos;

    public Responder(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static Responder thoThe(List<UtestDatos> datos) {
        return new Responder(datos);

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto_boton_final = Text.of(FinalPage.BOTON_COMPLETADO).viewedBy(actor).asString();
        return datos.get(0).getStrTextoFinal().equals(texto_boton_final);
    }
}
