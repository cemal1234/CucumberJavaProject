package Runners;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utils.Driver;

@CucumberOptions(

        features = {"src/test/java/features"},

        glue = {"stepDefinition"},

        plugin = { "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json","html:target/cucumber-html-report"},
        dryRun = false
)


public class RunnerCreateAccount extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters("browser")

    public static void beforeClass(String browser){
        Driver.browserName.set(browser);

    }

    @AfterClass

    public void afterClass(){

        Driver.quitDriver();
    }

}
