package com.co.datacenter.runners.paga_millonario.bet_three_paga_millonario;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/paga_millonario/bet_three_paga_millonario.feature",
        glue = "com.co.datacenter.stepsdefinitions.paga_millonario.bet_three_paga_millonario",
        tags = "@BetThreePagaMillonarioSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class BetThreePagaMillonarioRunner {


}
