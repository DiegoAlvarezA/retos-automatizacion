package co.com.choucair.certification.proyectobase.dalvareza.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ColorlibLoginPage {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(), 'Ingresar')]"));
    public static final Target INPUT_USER = Target.the("Where do we write the user").located(By.xpath("//input[@placeholder='Username']"));
    public static final Target INPUT_PASSWORD = Target.the("Where do we write the password").located(By.xpath("//input[@placeholder='Password']"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm login").located(By.xpath("//button[contains(text(),'Sign in')]"));
}
