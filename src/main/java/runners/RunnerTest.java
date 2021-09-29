package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"}, // imprir as informação mais organizadas
		features = "src\\main\\resources\\features", //vai procurar as features
		glue = "stepsDefenitions",
		tags = "@Funcionalidade",//vai utilizar as steps
		snippets = SnippetType.CAMELCASE, //formatar os metodos
		monochrome = true, //melhorar a visualização no console
		dryRun = true // iniciar as featrues
		)

public class RunnerTest {

}
