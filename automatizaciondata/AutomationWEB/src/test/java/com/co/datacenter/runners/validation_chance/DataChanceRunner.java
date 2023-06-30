package com.co.datacenter.runners.validation_chance;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/data_chance.feature",
        glue = "com.co.datacenter.stepsdefinitions.data_chance",
        tags = "@DataChanceSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class DataChanceRunner {


}
