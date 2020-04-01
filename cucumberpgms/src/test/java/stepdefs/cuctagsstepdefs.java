package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cuctagsstepdefs{
WebDriver driver;
	@Given("Amy launched chrome browser")
	public void amy_launched_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\Downloads\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver();
		  
	}

	@Given("provided valid URL")
	public void provided_valid_URL() {
		driver.get("http://demowebshop.tricentis.com/");
	}

	@When("Amy provides valid credentials")
	public void amy_provides_valid_credentials() {
		System.out.println("provide email and password");
	}

	@When("click on login")
	public void click_on_login() {
		System.out.println("click on login");
	    
	}

	@Then("Amy shall see the home page")
	public void amy_shall_see_the_home_page() {
		System.out.println("home page is displayed"); 
	}

	@Given("Amy is on home page")
	public void amy_is_on_home_page() {
		System.out.println("Amy is on home page");
	}

	@When("Amy searches for a product")
	public void amy_searches_for_a_product() {
		System.out.println("searching for product");
	}

	@Then("she shall see list of products displayed")
	public void she_shall_see_list_of_products_displayed() {
		System.out.println("list of products is displayed");
	    
	}

	@Given("Amy is on registration page")
	public void amy_is_on_registration_page() {
		System.out.println("Amy is on registration page");
	}

	@When("Amy provides all the details")
	public void amy_provides_all_the_details() {
		System.out.println("provide all the details"); 
	}

	@Then("she shall be registered successfully")
	public void she_shall_be_registered_successfully() {
		System.out.println("Amy registerted successfully");
	}



}
