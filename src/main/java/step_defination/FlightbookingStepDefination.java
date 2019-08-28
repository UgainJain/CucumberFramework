package step_defination;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjectRepository.BookAFlightPL;
import utils.base.Drivers;
import utils.commonFunc.CommonUtils;
import utils.dataSource.ExcelLib;

public class FlightbookingStepDefination extends Drivers  {
	BookAFlightPL bookinglib = null;
	ExcelLib exl = new ExcelLib();
	String  passcntval,CCtype,CC_no, CC_expmnth, CC_expyear;
	@Given("user is on Book a Flight page")
	public void user_is_on_Book_a_Flight_page() {
		String title = driver.getTitle();
	    Assert.assertTrue(title.contentEquals("Book a Flight: Mercury Tours"));
	}

	@When("user enters the Passenger and Payment details")
	public void user_enters_the_Passenger_and_Payment_details() throws EncryptedDocumentException, InvalidFormatException, IOException {
		bookinglib = PageFactory.initElements(driver, BookAFlightPL.class);
		List<WebElement> PassFirst = bookinglib.getPassFirst();
		List<WebElement> PassLast = bookinglib.getPassLast();
		List<WebElement> PassMeal = bookinglib.getPassMeal();
		ArrayList<String> FirstName = new ArrayList<String>();
		
		FirstName.add(exl.exceldata("BookFlight", 1, 1));
		FirstName.add(exl.exceldata("BookFlight", 2,1));
		ArrayList<String> LastName =new ArrayList<String>();
		LastName.add(exl.exceldata("BookFlight", 1, 2));
		LastName.add(exl.exceldata("BookFlight", 2, 2));
		ArrayList<String> Meal = new ArrayList<String>();
		Meal.add(exl.exceldata("BookFlight", 1, 3));
		Meal.add(exl.exceldata("BookFlight", 2, 3));
		CCtype = exl.exceldata("BookFlight", 2, 4);
		CC_no = exl.exceldata("BookFlight", 2, 5);
		CC_expmnth = exl.exceldata("BookFlight", 2, 6);
		CC_expyear = exl.exceldata("BookFlight", 2, 7)	;
		passcntval =  exl.exceldata("FlightFinder", 1, 2);
		for(int  i = 0 ; i < Integer.parseInt(passcntval);i++) {
			CommonUtils.typetext(PassFirst.get(i),FirstName.get(i));
			CommonUtils.typetext(PassLast.get(i),LastName.get(i));
			
		}

		for(int i = 0 ;i<Integer.parseInt(passcntval);i++) {
			CommonUtils.selectfromdrpdwn(PassMeal.get(i), Meal.get(i));
		}
		CommonUtils.selectfromdrpdwn(bookinglib.getCredit_card_type(), CCtype);
		CommonUtils.typetext(bookinglib.getCredit_card_number(), CC_no);
		CommonUtils.selectwthoutvalue(bookinglib.getCC_exp_mnth(), CC_expmnth);
		CommonUtils.selectfromdrpdwn(bookinglib.getCC_exp_year(), CC_expyear);
		
	}

	@Then("user clicks on secure purchase")
	public void user_clicks_on_secure_purchase() {
		CommonUtils.click(bookinglib.getSecureFlightsbtn());	
	}

	@And("user is on Flight confirmation Page")
	public void user_is_on_Flight_confirmation_Page() {
		String title = driver.getTitle();
	    Assert.assertTrue(title.contentEquals("Flight Confirmation: Mercury Tours"));

	}


}
