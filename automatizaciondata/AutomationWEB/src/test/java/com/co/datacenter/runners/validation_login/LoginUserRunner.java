package com.co.datacenter.runners.validation_login;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login/login_user.feature",
        glue = "com.co.datacenter.stepsdefinitions.login.login",
        tags = "@LoginUserSuccessful",
        snippets = SnippetType.CAMELCASE
)
public class LoginUserRunner {


}
