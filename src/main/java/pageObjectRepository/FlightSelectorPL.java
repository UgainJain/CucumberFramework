package pageObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightSelectorPL {
	@FindBy(name = "outFlight")
	List<WebElement> outflight ;
	
	@FindBy(name = "inFlight")
	List<WebElement> inFlight;
	
	@FindBy(name = "reserveFlights")
	WebElement Continuebtn ;

	public List<WebElement> getOutFlight() {
		return outflight;
	}

	public List<WebElement> getInFlight() {
		return inFlight;
	}

	public WebElement getContinuebtn() {
		return Continuebtn;
	}

}
