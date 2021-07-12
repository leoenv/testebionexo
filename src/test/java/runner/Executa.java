package runner;





import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/features/combatista.feature",
		glue = {""},
		dryRun = false,
		monochrome = true,
		tags = " @janela",
		plugin = {"pretty", "html:target/cucumber-report.html"})
public class Executa {
	

}
