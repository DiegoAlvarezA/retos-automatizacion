package co.com.choucair.certification.proyectobase.dalvareza.tasks;

import co.com.choucair.certification.proyectobase.dalvareza.userinterface.ColorlibForms;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

public class GoToForms implements Task {

    private Target formSubmoduleTarget;
    private Target typeOfValidation;

    public GoToForms(Target formSubmodule, Target typeOfValidation) {
        this.formSubmoduleTarget = formSubmodule;
        this.typeOfValidation = typeOfValidation;
    }

    public static GoToForms formSubmoduleAndValidation(Target formSubmodule, Target typeOfValidation) {
        return Tasks.instrumented(GoToForms.class, formSubmodule, typeOfValidation);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ColorlibForms.FORMS_BUTTON),
                Click.on(formSubmoduleTarget),
                Scroll.to(typeOfValidation)
        );
    }
}
