package tesis.features;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

/**
* This is the runner. It indicates which feature file will be executed
*
* @author  Fernando Martinez
* @version 1.0
*/

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/DownloadFiles.feature" )
public class DownloadFiles {

	
}
