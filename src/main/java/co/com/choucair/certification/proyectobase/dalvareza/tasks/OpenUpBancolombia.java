package co.com.choucair.certification.proyectobase.dalvareza.tasks;

import co.com.choucair.certification.proyectobase.dalvareza.userinterface.BancolombiaPortalEmpresasPage;
import co.com.choucair.certification.proyectobase.dalvareza.userinterface.ColorlibPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUpBancolombia implements Task {
    private BancolombiaPortalEmpresasPage bancolombiaPortalEmpresasPage;

    public static OpenUpBancolombia portalEmpresasPage() {
        return Tasks.instrumented(OpenUpBancolombia.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(bancolombiaPortalEmpresasPage));
    }
}
