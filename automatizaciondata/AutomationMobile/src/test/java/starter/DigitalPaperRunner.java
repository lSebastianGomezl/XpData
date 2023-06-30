package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/digital"
//        glue = "starter.stepdefinitions.DigitalPaperStepDefinitions",
//        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class DigitalPaperRunner {
}
