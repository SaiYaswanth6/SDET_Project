package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.hooks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {
	
	WebDriver driver = hooks.driver;
	
	@Given("^User Navigates to ola contact us page$")
	public void user_Navigates_to_ola_contact_us_page() throws InterruptedException  {
		
		driver.findElement(By.id("link-contact")).click();
		Thread.sleep(3000);	
	    
	}

	@When("^User Enter name in \"([^\"]*)\" and click on submit$")
	public void user_Enter_name_in(String name) throws InterruptedException  {
		
		driver.findElement(By.id("email43")).sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name ='submit' and @value = 'Submit']")).click();
		Thread.sleep(2000);
	    
	}
	
	@Then("^Validate the Text box field \"([^\"]*)\"$")
	public void validate_the_Text_box_field(String validate) {
    
		WebElement nameText =  driver.findElement(By.id("email43"));
		String validateText = nameText.getAttribute("value");
		System.out.println("name enetered is" + validateText);
		if (validateText.equals(validate)) {
			System.out.println("Test1: Entered Field is valid");
		}
		else {
				System.out.println("Test2: Invalid field entered");
			}
			}
	
	@When("^User Enter email id in \"([^\"]*)\" and click on submit$")
	public void user_Enter_email_id_in_and_click_on_submit(String email) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id = 'email43' and @name = 'email']")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name ='submit' and @value = 'Submit']")).click();
		Thread.sleep(2000);
	       
	}
	
	@Then("^Validate the mail box field \"([^\"]*)\"$")
	public void validate_the_mail_box_field(String validatemailid) {
		
		WebElement emailText =  driver.findElement(By.xpath("//*[@id = 'email43' and @name = 'email']"));
		String validateemail = emailText.getAttribute("value");
		System.out.println("email id enetered is" + validateemail);
		if(validateemail.contains("@") && validateemail.contains(".com")) {
			System.out.println("Test3: " + validatemailid + " email id is valid");
		}else {
			
			System.out.println("Test4: " + validatemailid + " email id is not valid");
		}
		}
	@When("^User Enter mmobile number \"([^\"]*)\" and click on submit$")
	public void user_Enter_mmobile_number_and_click_on_submit(String mobile) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id = 'email43' and @name = 'phone_no']")).sendKeys(mobile);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name ='submit' and @value = 'Submit']")).click();
		Thread.sleep(2000);
	}

	@Then("^Validate the mobile number field \"([^\"]*)\"$")
	public void validate_the_mobile_number_field(String validatenumber)  {
		WebElement numberText =  driver.findElement(By.xpath("//*[@id = 'email43' and @name = 'phone_no']"));
		String number = numberText.getAttribute("value");
		System.out.println("number enetered is" + numberText);
		if (number.equals(validatenumber)) {
			System.out.println("Test5: " + validatenumber + " is a valid number");
		}
		else {
				System.out.println("Test6: " + validatenumber+" is an Invalid number");
			}
	}

		}

//amit.luthra1992@gmail.com