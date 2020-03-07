package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
   features=".//Features/Login.feature",
   glue="StepDefination",
   dryRun=false,
   monochrome=true,
   plugin={"pretty","html:test-output"}
		
		
		
		)

public class runner {

}
