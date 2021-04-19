package co.com.choucair.certification.proyectobase.dalvareza.userinterface;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.grupobancolombia.com/wps/portal/empresas/productos-servicios/leasing/inmobiliario/simulador-canon-financiero")
public class BancolombiaPortalEmpresasPage extends PageObject {
    public static final Target SERVICES_AND_PRODUCTS_LINK = Target.the("enlace a productos y servicios").located(By.xpath("//a[contains(text(), 'Productos y Servicios')]"));
    public static final Target LEASING_LINK = Target.the("enlace a leasing").located(By.xpath("//a[@href='/wps/portal/empresas/productos-servicios/leasing/']"));
    public static final Target LEASING_INMOBILIARIO_LINK = Target.the("enlace a leasing inmobiliario").located(By.xpath("//a[@title='”Leasing']"));
    public static final Target SIMULADOR_CANON_FINANCIERO_BUTTON = Target.the("enlace a leasing inmobiliario").located(By.xpath("//a[@title='Simular']"));

    //Simulador
    public static final Target ASSET_VALUE = Target.the("valor del activo (incluyendo IVA) ($)").located(By.name("valorActivo"));
    public static final Target TERM_CONTRACT = Target.the("plazo del contrato (meses)").located(By.name("plazo"));
    public static final Target PERCENTAGE_PURCHASE_OPTION = Target.the("porcentaje de la opción de compra (%)").located(By.name("opcionCompra"));
    public static final Target RATE_TYPE = Target.the("tipo de tasa").located(By.name("comboTipoTasa"));
    public static final Target SIMULATE_BUTTON = Target.the("botón simular").located(By.name("simular"));

    @FindBy(css="table table-datos")
    public static WebElement table;
}
