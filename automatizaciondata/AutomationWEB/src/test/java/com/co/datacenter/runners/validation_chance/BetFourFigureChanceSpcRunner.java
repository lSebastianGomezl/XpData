package com.co.datacenter.runners.validation_chance;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/bet_four_figures_chance_spc.feature",
        glue = "com.co.datacenter.stepsdefinitions.chance.bet_four_figures_chance_spc",
        tags = "@BetFourFigureChanceSpdSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class BetFourFigureChanceSpcRunner {


}
