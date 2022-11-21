package aoeTest.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
        "html:target/default-html-reports.html",
        "rerun:target/rerun.txt"}, //json is a kind of storage file, using key-value structure and
                                    // used by cucumber to create reports
                                    //in pom.xml we put this plugin
        features = "src/test/resources/features", // copypath of features, select content root
        glue = "aoeTest/stepDefinitions", // copypath of step def, select source root
        dryRun = false, //undefined step definitions lara ulasmamizi saglar
        tags = "@wip"
)

public class CukesRunner {

}
