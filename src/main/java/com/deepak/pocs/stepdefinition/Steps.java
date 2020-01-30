package com.deepak.pocs.stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Steps {				

    WebDriver driver;			
    		
    @Given("^Open the IE and launch the application$")
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
       System.setProperty("webdriver.ie.driver", "C://Users//Admin//Downloads//IE//IEDriverServer.exe");					
       driver= new InternetExplorerDriver();					
       driver.manage().window().maximize();			
       driver.get("http://google.com");					
    }		

    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       driver.findElement(By.name("uid")).sendKeys("username12");							
       driver.findElement(By.name("password")).sendKeys("password12");							
    }		

    @Then("^Reset the credential$")
    public void Reset_the_credential() throws Throwable 							
    {		
       driver.findElement(By.name("btnReset")).click();					
    }		
}