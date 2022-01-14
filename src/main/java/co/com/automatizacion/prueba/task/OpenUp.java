package co.com.automatizacion.prueba.task;

import co.com.automatizacion.prueba.userinterface.OpenHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private OpenHomePage openHomePage;

    public static OpenUp theUtestPage() {
        return Tasks.instrumented(OpenUp.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(openHomePage),
                Click.on(OpenHomePage.JOIN_TODAY));
    }
}
