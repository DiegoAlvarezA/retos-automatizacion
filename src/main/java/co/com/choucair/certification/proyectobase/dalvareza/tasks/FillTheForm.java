package co.com.choucair.certification.proyectobase.dalvareza.tasks;

import co.com.choucair.certification.proyectobase.dalvareza.model.BlockValidation;
import co.com.choucair.certification.proyectobase.dalvareza.userinterface.ColorlibForms;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;

public class FillTheForm implements Task {

    private BlockValidation formData;

    public FillTheForm(BlockValidation formData) {
        this.formData = formData;
    }

    public static FillTheForm with(BlockValidation formData) {
        return Tasks.instrumented(FillTheForm.class, formData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(formData.getRequired()).into(ColorlibForms.REQUIRED_FIELD),
                Enter.theValue(formData.getEmail()).into(ColorlibForms.EMAIL_FIELD),
                Enter.theValue(formData.getPassword()).into(ColorlibForms.PASSWORD_FIELD),
                Enter.theValue(formData.getConfirmPassword()).into(ColorlibForms.CONFIRMPASSWORD_FIELD),
                Enter.theValue(formData.getDate()).into(ColorlibForms.DATE_FIELD),
                Enter.theValue(formData.getUrl()).into(ColorlibForms.URL_FIELD),
                Enter.theValue(formData.getDigits()).into(ColorlibForms.DIGITS_FIELD),
                Enter.theValue(formData.getRange()).into(ColorlibForms.RANGE_FIELD),
                Check.whether(formData.isAgreeToPolicy()).andIfSo(Click.on(ColorlibForms.CHECKBOX_FIELD)).otherwise(),
                Click.on(ColorlibForms.VALIDATE_BUTTON),
                Scroll.to(ColorlibForms.BLOCKVALIDATION_FORM)
        );
    }
}
