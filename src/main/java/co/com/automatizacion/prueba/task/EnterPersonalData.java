package co.com.automatizacion.prueba.task;

import co.com.automatizacion.prueba.model.UtestDatos;
import co.com.automatizacion.prueba.userinterface.PersonalDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class EnterPersonalData implements Task {

    public EnterPersonalData(List<UtestDatos> datos) {
        this.datos = datos;
    }

    private List<UtestDatos> datos;




    public static EnterPersonalData theUtestPage(List<UtestDatos> datos) {
        return Tasks.instrumented(EnterPersonalData.class, datos);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrNombre()).into(PersonalDataPage.NOMBRE),
                Enter.theValue(datos.get(0).getStrApellido()).into(PersonalDataPage.APELLIDO),
                Enter.theValue(datos.get(0).getStrEmail()).into(PersonalDataPage.EMAIL),
                SelectFromOptions.byVisibleText(datos.get(0).getStrMesNacimiento()).from(PersonalDataPage.MES_NACIMIENTO),
                SelectFromOptions.byVisibleText(datos.get(0).getStrDiaNacimiento()).from(PersonalDataPage.DIA_NACIMIENTO),
                SelectFromOptions.byVisibleText(datos.get(0).getStrAnoNacimiento()).from(PersonalDataPage.ANO_NACIMIENTO),
                Click.on(PersonalDataPage.BOTON_LOCATION)
        );
    }
}
