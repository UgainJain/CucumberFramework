package pageObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightFinderPL {
	@FindBy(name = "tripType")
	List<WebElement> trip_type;
	
	@FindBy(name ="passCount")
	WebElement passenger_count;
	
	@FindBy(name = "fromPort" )
	WebElement from_station;
	
	@FindBy(name = "fromMonth")
	WebElement from_month;
	
	@FindBy(name = "fromDay")
	WebElement from_day;
	
	@FindBy(name = "toPort")
	WebElement to_station;
	
	@FindBy(name = "toMonth")
	WebElement to_month;
	
	@FindBy(name = "toDay")
	WebElement to_day;
	
	@FindBy(name = "servClass")
	List<WebElement> service_class;
	
	@FindBy(name = "airline")
	WebElement airline_preference;
	
	@FindBy(name = "findFlights")
	WebElement Continuebtn;
	
	public List<WebElement> getTrip_type() {
		return trip_type;
	}

	public WebElement getPassenger_count() {
		return passenger_count;
	}

	public WebElement getFrom_station() {
		return from_station;
	}

	public WebElement getFrom_month() {
		return from_month;
	}

	public WebElement getFrom_day() {
		return from_day;
	}

	public WebElement getTo_station() {
		return to_station;
	}

	public WebElement getTo_month() {
		return to_month;
	}

	public WebElement getTo_day() {
		return to_day;
	}

	public List<WebElement> getService_class() {
		return service_class;
	}

	public WebElement getAirline_preference() {
		return airline_preference;
	}

	public WebElement getContinuebtn() {
		return Continuebtn;
	}

}
