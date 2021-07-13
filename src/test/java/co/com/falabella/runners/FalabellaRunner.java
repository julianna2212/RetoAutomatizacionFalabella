package co.com.falabella.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = { "co.com.falabella.stepdefinitions" },
        features = { "src/test/resources/features/falabella.feature" },
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true
)

public class FalabellaRunner {
}
