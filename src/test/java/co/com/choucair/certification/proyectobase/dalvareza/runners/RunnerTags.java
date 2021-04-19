package co.com.choucair.certification.proyectobase.dalvareza.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        //features = "src/test/resources/features/block_validation_colorlib.feature",
        features = "src/test/resources/features",
        tags = "@bancolombia",
        glue = {"co.com.choucair.certification.proyectobase.dalvareza.stepdefinitions", "co.com.choucair.certification.proyectobase.dalvareza.util"},
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}


