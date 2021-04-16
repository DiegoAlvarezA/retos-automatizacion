package co.com.choucair.certification.proyectobase.dalvareza.questions;

import co.com.choucair.certification.proyectobase.dalvareza.userinterface.ColorlibForms;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class TheForm {

    public static Question<String> formTitle(Target formTitle) {
        return actor -> Text.of(formTitle).viewedBy(actor).asString();
    }

    public static Question<String> validationStateIn(Target form) {
        return actor -> Text.of(form).viewedBy(actor).asString();
    }
}
