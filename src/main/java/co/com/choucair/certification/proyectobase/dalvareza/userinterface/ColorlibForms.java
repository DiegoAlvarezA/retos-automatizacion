package co.com.choucair.certification.proyectobase.dalvareza.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ColorlibForms {

    public static final Target FORMS_BUTTON = Target.the("forms button").located(By.xpath("//span[contains(text(), 'Forms')]"));

    // Form validation > Block validation targets
    public static final Target FORMVALIDATION_BUTTON = Target.the("form validation button").located(By.xpath("//a[@href='form-validation.html']//i"));
    public static final Target BLOCKVALIDATION_TITLE = Target.the("block validation title").located(By.xpath("(//h5)[3]"));
    public static final Target REQUIRED_FIELD = Target.the("required field").located(By.id("required2"));
    public static final Target EMAIL_FIELD = Target.the("email field").located(By.id("email2"));
    public static final Target PASSWORD_FIELD = Target.the("password field").located(By.id("password2"));
    public static final Target CONFIRMPASSWORD_FIELD = Target.the("confirm password field").located(By.id("confirm_password2"));
    public static final Target DATE_FIELD = Target.the("date field").located(By.id("date2"));
    public static final Target URL_FIELD = Target.the("url field").located(By.id("url2"));
    public static final Target DIGITS_FIELD = Target.the("digits only field").located(By.id("digits"));
    public static final Target RANGE_FIELD = Target.the("range field").located(By.id("range"));
    public static final Target CHECKBOX_FIELD = Target.the("checkbox field").located(By.id("agree2"));
    public static final Target VALIDATE_BUTTON = Target.the("validate button").located(By.xpath("//form[@id='block-validate']//input[@type='submit']"));
    public static final Target BLOCKVALIDATION_FORM = Target.the("block validation form").located(By.id("block-validate"));

    // Form validation > Inline validation targets
    public static final Target INLINEVALIDATION_TITLE = Target.the("block validation title").located(By.xpath("(//h5)[4]"));
    public static final Target INLINE_REQUIRED_FIELD = Target.the("required field").located(By.id("required"));
    public static final Target INLINE_EMAIL_FIELD = Target.the("email field").located(By.id("email"));
    public static final Target INLINE_PASSWORD_FIELD = Target.the("password field").located(By.id("password"));
    public static final Target INLINE_CONFIRMPASSWORD_FIELD = Target.the("confirm password field").located(By.id("confirm_password"));
    public static final Target INLINE_DATE_FIELD = Target.the("date field").located(By.id("date"));
    public static final Target INLINE_URL_FIELD = Target.the("url field").located(By.id("url"));
    public static final Target INLINE_CHECKBOX_FIELD = Target.the("checkbox field").located(By.id("agree"));
    public static final Target INLINE_MINIMUM_CHARS_FIELD = Target.the("Minimum 3 Chars field").located(By.id("minsize"));
    public static final Target INLINE_MAXIMUM_CHARS_FIELD = Target.the("Maximum 6 Chars field").located(By.id("maxsize"));
    public static final Target INLINE_MINIMUM_FIELD = Target.the("Minimum 3 field").located(By.id("minNum"));
    public static final Target INLINE_MAXIMUM_FIELD = Target.the("Maximum 16 field").located(By.id("maxNum"));
    public static final Target INLINE_VALIDATE_BUTTON = Target.the("validate button").located(By.xpath("//form[@id='inline-validate']//input[@type='submit']"));
    public static final Target INLINEVALIDATION_FORM = Target.the("block validation form").located(By.id("inline-validate"));
}
