package stepdefs;



import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

 

public class empstepdefs {

           

 

@Given("the employee name is {string}")

public void the_employee_name_is(String ename) {

            System.out.println("the name of emp is" +ename);

  

}

 

@When("he gets rating as {int}")

public void he_gets_rating_as(Integer rating1) {

            System.out.println("the rating of emp is " +rating1);

   

}

 

@Then("he shall recieve hike percent as {int}")

public void he_shall_recieve_hike_percent_as(Integer hike) {

            System.out.println("the hike percent of emp is "+hike);

  

}

 

 

}