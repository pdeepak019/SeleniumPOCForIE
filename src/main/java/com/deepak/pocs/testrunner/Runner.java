package com.deepak.pocs.testrunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue={"com.deepak.pocs.stepdefinition"})
public class Runner 				
{		

}
