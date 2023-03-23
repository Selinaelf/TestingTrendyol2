package stepDef;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue = {"stepDef"})
//rapor görmek için buraya plugin ekliyoruz(stepbystep1-35.00)
public class runner {
}
