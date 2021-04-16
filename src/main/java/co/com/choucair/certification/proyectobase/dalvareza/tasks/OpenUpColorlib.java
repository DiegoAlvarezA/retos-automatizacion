package co.com.choucair.certification.proyectobase.dalvareza.tasks;

import co.com.choucair.certification.proyectobase.dalvareza.userinterface.ColorlibPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUpColorlib implements Task {

    private ColorlibPage colorlibPage;

    public static OpenUpColorlib thePage() {
        return Tasks.instrumented(OpenUpColorlib.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(colorlibPage));
    }
}
