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
import pageObjectRepository.FlightFinderPL;
import utils.base.Drivers;
import utils.commonFunc.CommonUtils;
import utils.dataSource.ExcelLib;

public class FlightFinderStepDefination extends Drivers{
	String triptypeval, passcntval, fromstnval, frmnthval,frmdayval, tostnval,todayval, tomnthval,ser_classval,airval;
	ExcelLib exl = new ExcelLib();
	FlightFinderPL finderlib = null; 
	@Given("user is on flightfinder page")
	public void user_is_on_flightfinder_page() {
		finderlib = PageFactory.initElements(driver, FlightFinderPL.class);
		String title = driver.getTitle();
	    Assert.assertTrue(title.contentEquals("Find a Flight: Mercury Tours:"));
	}

	@When("user enters the flight details")
	public void user_enters_the_flight_details() throws EncryptedDocumentException, InvalidFormatException, IOException {
		triptypeval = exl.exceldata("FlightFinder", 1, 1);
		passcntval =  exl.exceldata("FlightFinder", 1, 2);
		fromstnval =  exl.exceldata("FlightFinder", 1, 3);
		frmnthval =  exl.exceldata("FlightFinder", 1, 4);
		frmdayval =  exl.exceldata("FlightFinder", 1, 5);
		tostnval =  exl.exceldata("FlightFinder", 1, 6);
		todayval =  exl.exceldata("FlightFinder", 1, 8);
		tomnthval = exl.exceldata("FlightFinder", 1, 7);
		ser_classval =  exl.exceldata("FlightFinder", 1, 9);
		airval =  exl.exceldata("FlightFinder", 1, 10);
		CommonUtils.selectfromradiobuttons(finderlib.getTrip_type(), triptypeval );
		CommonUtils.selectfromdrpdwn(finderlib.getPassenger_count(), passcntval);
		CommonUtils.selectfromdrpdwn(finderlib.getFrom_station(), fromstnval);
		CommonUtils.selectfromdrpdwn(finderlib.getFrom_month(), frmnthval);
		CommonUtils.selectfromdrpdwn(finderlib.getFrom_day(), frmdayval);
		CommonUtils.selectfromdrpdwn(finderlib.getTo_station(), tostnval);
		CommonUtils.selectfromdrpdwn(finderlib.getTo_day(), todayval);
		CommonUtils.selectfromdrpdwn(finderlib.getTo_month(), tomnthval);
		CommonUtils.selectfromradiobuttons(finderlib.getService_class(), ser_classval);
		CommonUtils.selectwthoutvalue(finderlib.getAirline_preference(), airval);
		
	}

	@Then("user clicks on submit")
	public void user_clicks_on_submit() {
		CommonUtils.click(finderlib.getContinuebtn());
	}

	@And("user is on FlightSelector page")
	public void user_is_on_FlightSelector_page() {
		String title = driver.getTitle();
	    Assert.assertTrue(title.contentEquals("Select a Flight: Mercury Tours"));
	}


}
