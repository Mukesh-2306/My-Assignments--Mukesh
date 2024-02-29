package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/test/java/features/Login1.feature",glue="stepdefinition",publish=true,monochrome=true)
public class CucumberRunnner extends AbstractTestNGCucumberTests{



}
