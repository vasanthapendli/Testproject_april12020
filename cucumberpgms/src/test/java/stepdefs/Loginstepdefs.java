package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdefs {
	WebDriver driver;
	@Given("user launched chrome browser")
	public void user_launched_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\Downloads\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	    
	}

	@Given("user provides the valid url")
	public void user_provides_the_valid_url() {
		driver.get("http://demowebshop.tricentis.com/");
	}

	@Given("user clicks on login hyperlink")
	public void user_clicks_on_login_hyperlink() {
		driver.findElement(By.className("ico-login")).click();
	}

	@When("user provides valid Email and Password")
	public void user_provides_valid_Email_and_Password() {
		driver.findElement(By.id("Email")).sendKeys("karthik456@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("karthik456");
	    
	}

	@When("he clicks on Login button")
	public void he_clicks_on_Login_button() {
		driver.findElement(By.cssSelector("input.button-1.login-button")).click();
	}

	@Then("user shall be able to view the homepage")
	public void user_shall_be_able_to_view_the_homepage() {
		System.out.println("displayed the homepage"); 
	}

	@Then("see the welcome message")
	public void see_the_welcome_message() {
		System.out.println("welcome message is displayed..");
	}



}
