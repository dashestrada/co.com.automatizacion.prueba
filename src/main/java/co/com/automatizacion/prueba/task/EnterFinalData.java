package co.com.automatizacion.prueba.task;

import co.com.automatizacion.prueba.model.UtestDatos;
import co.com.automatizacion.prueba.userinterface.FinalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class EnterFinalData implements Task {

    public EnterFinalData(List<UtestDatos> datos) {
        this.datos = datos;
    }

    private List<UtestDatos> datos;

    public static EnterFinalData theUtestPage(List<UtestDatos> datos) {
        return Tasks.instrumented(EnterFinalData.class, datos);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.get(0).getStrContrasena()).into(FinalPage.CONTRASENA),
                Enter.theValue(datos.get(0).getStrContrasena()).into(FinalPage.CONFIRMAR_CONTRASENA),
                Click.on(FinalPage.CHECKBOX_STAY_INFORMED),
                Click.on(FinalPage.CHECKBOX_TERMS),
                Click.on(FinalPage.CHECKBOX_PRIVACY),
                Click.on(FinalPage.BOTON_COMPLETADO)

        );
    }
}
