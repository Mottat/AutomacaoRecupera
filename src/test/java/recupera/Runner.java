package recupera;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "recupera.steps",
//        tags = "@LoginExecution",
        tags = "@ConsultaExecution",
//        tags = "@AcordoExecution",
//        tags = "@CancelaAcordoExecution",

//        tags = "@LoginExecution or @ConsultaExecution or @AcordoExecution or @CancelaAcordoExecution",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false,
        plugin = {
                "pretty",
                "html:reports/cucumber.html",
                "json:reports/cucumber.json",
                "junit:reports/cucumber.xml",
        }
)
public class Runner {
}