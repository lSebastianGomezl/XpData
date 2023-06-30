package com.co.datacenter.runners.maxi_chance.validation_value_empty_maxi_chance;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/maxi_chance/validation_value_empty_maxi_chance.feature",
        glue = "com.co.datacenter.stepsdefinitions.maxi_chance.validation_value_empty_super_chance",
        tags = "@ValueEmptyMaxiChanceSuccessful"
)
public class ValueEmptyMaxiChanceRunner {
}
