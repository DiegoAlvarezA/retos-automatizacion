package co.com.choucair.certification.proyectobase.dalvareza.tasks;

import co.com.choucair.certification.proyectobase.dalvareza.model.FinancialCanonSimulator;
import co.com.choucair.certification.proyectobase.dalvareza.userinterface.BancolombiaPortalEmpresasPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class FillTheSimulationForm implements Task {

    private FinancialCanonSimulator formData;

    public FillTheSimulationForm(FinancialCanonSimulator formData) {
        this.formData = formData;
    }

    public static FillTheSimulationForm with(FinancialCanonSimulator formData) {
        return Tasks.instrumented(FillTheSimulationForm.class, formData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(formData.getAssetValue()).into(BancolombiaPortalEmpresasPage.ASSET_VALUE),
                Enter.theValue(formData.getTermContract()).into(BancolombiaPortalEmpresasPage.TERM_CONTRACT),
                Enter.theValue(formData.getPercentagePurchageOption()).into(BancolombiaPortalEmpresasPage.PERCENTAGE_PURCHASE_OPTION),
                SelectFromOptions.byVisibleText(formData.getRateType()).from(BancolombiaPortalEmpresasPage.RATE_TYPE),
                Click.on(BancolombiaPortalEmpresasPage.SIMULATE_BUTTON)
        );
    }
}