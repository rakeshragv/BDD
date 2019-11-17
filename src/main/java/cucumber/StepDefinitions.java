package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinitions {
	WebDriver driver;
	@Given("^user enters the Url$")
	public void loginmethod(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TANAV\\Desktop\\Seleniumjars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in");
					}
	
	//@Then("^User enters \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	//public void inputs1(String FirstName, String lastName, String Address, String Email ){
		//driver.find
		
	}
	
	
//}
