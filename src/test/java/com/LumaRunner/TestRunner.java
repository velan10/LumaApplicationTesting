package com.LumaRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features={"src\\test\\resources\\com.featureFiles\\LumaTshirtPurchase.feature",
				  "src\\test\\resources\\com.featureFiles\\LumaWatch.feature"},
				
		glue = {"com.lumaStepDef1",
				"com.Hooks",
				"com.lumaStepDef2"},
		
		monochrome = false,
		dryRun = false,
		publish= false,
		//tags ="@menjacket",
		plugin= {
				"html:LumaReports/LumarHTMLReports.html",
				"json:LumaReports/LumaJSONReports.json",
				"pretty",
				//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				//"timeline:targetTimeline/cucumber"
			 "com.aventstack.chaintest.plugins.ChainTestCucumberListener:" 		
		}
		)


public class TestRunner {

}
