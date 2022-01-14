package co.com.automatizacion.prueba.task;

import co.com.automatizacion.prueba.model.UtestDatos;
import co.com.automatizacion.prueba.userinterface.LocationUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

public class EnterLocationData implements Task {

    public EnterLocationData(List<UtestDatos> datos) {
        this.datos = datos;
    }

    private List<UtestDatos> datos;

    public static EnterLocationData theUtestPage(List<UtestDatos> datos) {
        return Tasks.instrumented(EnterLocationData.class, datos);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrCiudad()).into(LocationUser.CIUDAD),
                Hit.the(Keys.ARROW_DOWN).into(LocationUser.CIUDAD),
                Hit.the(Keys.ENTER).into(LocationUser.CIUDAD),
                Enter.theValue(datos.get(0).getStrCodigoPostal()).into(LocationUser.CODIGO_POSTAL),
                Click.on(LocationUser.CONTENEDOR_PAIS),
                Enter.theValue(datos.get(0).getStrPais()).into(LocationUser.PAIS),
                Click.on(LocationUser.BOTON_DEVICES)


                );
    }
}
