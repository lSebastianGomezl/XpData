package com.co.datacenter.runners.maxi_chance.validation_delete_maxi_chance;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/maxi_chance/validation_of_delete_maxi_chance.feature",
        glue = "com.co.datacenter.runners.maxi_chance.validation_delete_maxi_chance",
        tags = "@DeleteMaxiChanceSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class DeleteMaxiChanceRunner {


}
