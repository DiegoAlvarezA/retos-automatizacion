package co.com.choucair.certification.proyectobase.dalvareza.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage {
    public static final Target BUTTON_UC = Target.the("selecciona cursos y certificaciones").located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_COURSE = Target.the("buscar el curso").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso").located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso").located(By.xpath("//h4//a[text()[contains(.,'AiU Certified Tester in Artificial Intelligence (CTAI)')]]"));
    public static final Target NAME_COURSE = Target.the("Extrae nombre del curso").located(By.xpath("//h1[contains(text(), 'AiU Certified Tester in Artificial Intelligence (CTAI)')]"));
}