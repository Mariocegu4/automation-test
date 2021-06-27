package testRunner;


import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(ExtendedCucumber.class)
@CucumberOptions(features={"src/features/scenarios.feature"}
        //for some reason glue is not finding steps
        ,glue ={"stepDefinition"}
        ,tags={"@test"}
//        ,plugin = {"pretty"}
        ,dryRun= false)


public class TestRunner {
}
