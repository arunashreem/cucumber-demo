package cucumber.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
WebDriver driver= null;
	@Given("^open the browser$")
	public void openTheBrowser() throws Throwable { 
		driver =new FirefoxDriver();
		driver.get("http://adam.goucher.ca/parkcalc/");
	    System.out.println("This is Given method");
	}

	@When("^click on calculate$")
	public void clickOnCalculate() throws Throwable {
		WebElement calculate = driver.findElement(By.cssSelector("input[value='Calculate']"));
		calculate.click();
		System.out.println("This is When method");
	}

	@Then("^check for the message$")
	public void checkForTheMessage() throws Throwable {
		//WebElement msg = driver.findElement(By.cssSelector(selector))
		System.out.println("This is Then method");
	}


}
