package co.com.automatizacion.prueba.task;

import co.com.automatizacion.prueba.model.UtestDatos;
import co.com.automatizacion.prueba.userinterface.UserDevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

public class EnterDevices implements Task {

    public EnterDevices(List<UtestDatos> datos) {
        this.datos = datos;
    }

    private List<UtestDatos> datos;

    public static EnterDevices theUthestPage(List<UtestDatos> datos) {
        return Tasks.instrumented(EnterDevices.class, datos);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UserDevicesPage.CONTENEDOR_COMPUTADOR),
                Enter.theValue(datos.get(0).getStrComputador()).into(UserDevicesPage.COMPUTADOR).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(UserDevicesPage.CONTENEDOR_VERSION),
                Enter.theValue(datos.get(0).getStrVersionComputador()).into(UserDevicesPage.VERSION).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(UserDevicesPage.CONTENEDOR_LENGUAJE),
                Enter.theValue(datos.get(0).getStrLenguaje()).into(UserDevicesPage.LENGUAJE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(UserDevicesPage.CONTENEDOR_DISPOSITIVOS_MOVILES),
                Enter.theValue(datos.get(0).getStrDispositivosMoviles()).into(UserDevicesPage.DISPOSITIVOS_MOVILES).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(UserDevicesPage.CONTENEDOR_MODELO_DISPOSITIVO),
                Enter.theValue(datos.get(0).getStrModeloDispositivoMovil()).into(UserDevicesPage.MODELO_DISPOSITIVO).thenHit(Keys.ENTER),
                Click.on(UserDevicesPage.CONTENEDOR_SISTEMA_OPERATIVO),
                Enter.theValue(datos.get(0).getStrSoMovil()).into(UserDevicesPage.SISTEMA_OPERATIVO).thenHit(Keys.ENTER),
                Click.on(UserDevicesPage.ULTIMO_PASO)

        );
    }
}
