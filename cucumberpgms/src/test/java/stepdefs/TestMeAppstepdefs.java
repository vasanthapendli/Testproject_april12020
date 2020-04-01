package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMeAppstepdefs {
	WebDriver driver;
	@Given("user is on TestMeApp registration page")
	public void user_is_on_TestMeApp_registration_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\Downloads\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}

	@When("user enters {string} as firstname")
	public void user_enters_as_firstname(String string) {
		
		driver.findElement(By.id("firstName")).sendKeys("vasantha");
		
	    
	}

	@When("enters{string} as lastname")
	public void enters_as_lastname(String string) {
		driver.findElement(By.name("lastName")).sendKeys("pendli");
		
	     
	}

	@When("enters {string} as password")
	public void enters_as_password(String string) {
		
		
		driver.findElement(By.id("password")).sendKeys("Password123");
	     
	}

	@When("enters {string} as conformpassword")
	public void enters_as_conformpassword(String string) {
		
		
		driver.findElement(By.id("pass_confirmation")).sendKeys("Password123");
	}

	@When("click on button {string} as gender")
	public void click_on_button_as_gender(String string) {
		
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		 
		
	      
	}

	@When("enters {string} as gmail")
	public void enters_as_gmail(String string) {
		
		
		driver.findElement(By.id("emailAddress")).sendKeys("abc@gmail.com");
		
	}

	@When("enters {string} as mobile number")
	public void enters_as_mobile_number(String string) {
		driver.findElement(By.name("mobileNumber")).sendKeys("1234567890");
		 	    
	}

	@When("enters {string} as dob")
	public void enters_as_dob(String string) {
		driver.findElement(By.name("dob")).sendKeys("1/4/2020");

	}

	@When("enters {string} as address")
	public void enters_as_address(String string) {
		driver.findElement(By.name("address")).sendKeys("hyderabad");
		 
		
	}

	@When("selects index {int} as security question")
	public void selects_index_as_security_question(Integer int2) {
		WebElement Display =driver.findElement(By.name("securityQuestion"));
		 Select se1 =new Select(Display);
		 se1.selectByIndex(1);
		 
	      
	}

	@When("enters {string} as answer")
	public void enters_as_answer(String string) {
		driver.findElement(By.name("answer")).sendKeys("blue");
	    
	}

	@When("user click  on register")
	public void user_click_on_register() {
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}

	@Then("user shall be able to view as successful registration message")
	public void user_shall_be_able_to_view_as_successful_registration_message() {
		String exp_result="User Registered Succesfully!!! Please login";
		 String act_result=driver.findElement(By.xpath("//div[contains(text(),'User Reg')]")).getText();
		 System.out.println(exp_result);
		 System.out.println(act_result);
		 assertEquals(act_result, exp_result);
	}


}
