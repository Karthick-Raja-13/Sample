package steps;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testng.Pages;

public class Step {
	
	Pages pg = new Pages();

	@Given("User Navigates to the calculator app")
	public void user_Navigates_to_the_calculator_app() {
		pg.start();
	}

	@Given("User Gives Value on the First Input Box")
	public void user_Gives_Value_on_the_First_Input_Box() {
		pg.getInputOne().sendKeys("14");
	}

	@Given("User Gives Value on the Second Input Box")
	public void user_Gives_Value_on_the_Second_Input_Box() {
		pg.getInputTwo().sendKeys("12");
	}

	@When("User Clicks on the Add Button")
	public void user_Clicks_on_the_Add_Button() {
		pg.getAddBtn().click();
	}

	@Then("The Result Should Match the Addition of Two Values")
	public void the_Result_Should_Match_the_Addition_of_Two_Values() {
		Assert.assertEquals("26",pg.getSpan().getText());
	}
}
