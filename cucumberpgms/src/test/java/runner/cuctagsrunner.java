
package runner;



import org.junit.runner.RunWith;

 

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

 

 

@RunWith(Cucumber.class)

 

@CucumberOptions(features="C:\\Users\\Sai\\eclipse-workspace\\cucumberpgms\\features\\cuctags.feature",

                   glue= {"stepdefs"},

                   tags= {"@login and @regression"},
          monochrome=true,
plugin= {"pretty","html:target/cucumber-html-report"})
 

public class cuctagsrunner {

 

}