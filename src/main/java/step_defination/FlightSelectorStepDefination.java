package step_defination;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjectRepository.FlightSelectorPL;
import utils.base.Drivers;
import utils.commonFunc.CommonUtils;
import utils.dataSource.ExcelLib;

public class FlightSelectorStepDefination extends Drivers {
	FlightSelectorPL  fslib =  null;  
	String InFlight,OutFlight;
	ExcelLib exl = new ExcelLib();
	@Given("user is on Flight Selector Page")
	public void user_is_on_Flight_Selector_Page() {
		String title = driver.getTitle();
	    Assert.assertTrue(title.contentEquals("Select a Flight: Mercury Tours"));
	}

	@When("user Selects the Flights")
	public void user_Selects_the_Flights() throws EncryptedDocumentException, InvalidFormatException, IOException {
		fslib= PageFactory.initElements(driver, FlightSelectorPL.class);
		OutFlight =exl.exceldata("SelectFlight", 1, 1);
		InFlight = exl.exceldata("SelectFlight", 1, 2);

		CommonUtils.selectfromradiobuttons(fslib.getOutFlight(), OutFlight);
		CommonUtils.selectfromradiobuttons(fslib.getInFlight(), InFlight);
	}

	@And("user clicks on Continue btn")
	public void user_clicks_on_Continue_btn() {
		CommonUtils.click(fslib.getContinuebtn());
	}

	@Then("user is on BookFlight Page")
	public void user_is_on_BookFlight_Page() {
		String title = driver.getTitle();
	    Assert.assertTrue(title.contentEquals("Book a Flight: Mercury Tours"));
	}



}
