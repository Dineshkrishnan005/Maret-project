package Maret_Runner_Class;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

  @CucumberOptions(features = "C:\\Users\\Dinesh K\\eclipse-workspace\\Maret\\src\\test\\resources\\Feature",
  glue= "Maret_Step_Definition" , 
  plugin={"pretty","json:Report/NewMaretSignUp_Test1.json"
		  ,"html:CucumberReport/NewMaretSignUp_Test2"
		  ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
  publish = true, 
  monochrome= true,
  dryRun= false)
 

public class Maret_Runner {

	 
}
