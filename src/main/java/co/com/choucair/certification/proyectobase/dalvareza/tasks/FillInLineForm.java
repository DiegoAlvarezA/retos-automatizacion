package co.com.choucair.certification.proyectobase.dalvareza.tasks;

import co.com.choucair.certification.proyectobase.dalvareza.model.InLineValidation;
import co.com.choucair.certification.proyectobase.dalvareza.userinterface.ColorlibForms;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;

public class FillInLineForm implements Task {

    private InLineValidation formData;

    public FillInLineForm(InLineValidation formData) {
        this.formData = formData;
    }

    public static FillInLineForm with(InLineValidation formData) {
        return Tasks.instrumented(FillInLineForm.class, formData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(formData.getRequired()).into(ColorlibForms.INLINE_REQUIRED_FIELD),
                Enter.theValue(formData.getEmail()).into(ColorlibForms.INLINE_EMAIL_FIELD),
                Enter.theValue(formData.getPassword()).into(ColorlibForms.INLINE_PASSWORD_FIELD),
                Enter.theValue(formData.getConfirmPassword()).into(ColorlibForms.INLINE_CONFIRMPASSWORD_FIELD),
                Enter.theValue(formData.getDate()).into(ColorlibForms.INLINE_DATE_FIELD),
                Enter.theValue(formData.getUrl()).into(ColorlibForms.INLINE_URL_FIELD),
                Check.whether(formData.isAgreeToPolicy()).andIfSo(Click.on(ColorlibForms.INLINE_CHECKBOX_FIELD)).otherwise(),
                Enter.theValue(formData.getMinimumChars()).into(ColorlibForms.INLINE_MINIMUM_CHARS_FIELD),
                Enter.theValue(formData.getMaximumChars()).into(ColorlibForms.INLINE_MAXIMUM_CHARS_FIELD),
                Enter.theValue(formData.getMinimum()).into(ColorlibForms.INLINE_MINIMUM_FIELD),
                Enter.theValue(formData.getMaximum()).into(ColorlibForms.INLINE_MAXIMUM_FIELD),
                Click.on(ColorlibForms.INLINE_VALIDATE_BUTTON),
                Scroll.to(ColorlibForms.INLINEVALIDATION_FORM)
        );
    }
}
