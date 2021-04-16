package co.com.choucair.certification.proyectobase.dalvareza.tasks;

import co.com.choucair.certification.proyectobase.dalvareza.userinterface.ColorlibLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ColorlibLogin implements Task {
    private String strUser;
    private String strPassword;

    public ColorlibLogin(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    public static ColorlibLogin withCredentials(String strUser, String strPassword) {
        return Tasks.instrumented(ColorlibLogin.class, strUser, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strUser).into(ColorlibLoginPage.INPUT_USER),
                Enter.theValue(strPassword).into(ColorlibLoginPage.INPUT_PASSWORD),
                Click.on(ColorlibLoginPage.ENTER_BUTTON)
        );
    }
}
