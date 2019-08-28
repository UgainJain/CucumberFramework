package pageObjectRepository;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookAFlightPL {

	ArrayList<WebElement> PassFirst = new ArrayList<WebElement>();
	ArrayList<WebElement> PassLast = new ArrayList<WebElement>();
	ArrayList<WebElement> PassMeal = new ArrayList<WebElement>();
	
	@FindBy(name = "passFirst0")
	WebElement FirstName0txtbox;
	
	@FindBy(name = "passFirst1")
	WebElement FirstName1txtbox;
	
	@FindBy(name = "passFirst2")
	WebElement FirstName2txtbox;
	
	@FindBy(name = "passFirst3")
	WebElement FirstName3txtbox;
	
	@FindBy(name = "passFirst4")
	WebElement FirstName4txtbox;
	
	@FindBy(name = "passLast0")
	WebElement LastName0;
	
	@FindBy(name = "passLast1")
	WebElement LastName1;
	
	@FindBy(name = "passLast2")
	WebElement LastName2;
	
	@FindBy(name = "passLast3")
	WebElement LastName3;
	
	@FindBy(name = "passLast4")
	WebElement LastName4;
	
	@FindBy(name = "pass.0.meal")
	WebElement MealPreference0;
	
	@FindBy(name = "pass.1.meal")
	WebElement MealPreference1;
	
	@FindBy(name = "pass.2.meal")
	WebElement MealPreference2;
	
	@FindBy(name = "pass.3.meal")
	WebElement MealPreference3;
	
	@FindBy(name = "pass.4.meal")
	WebElement MealPreference4;
	
	@FindBy(name = "creditCard")
	WebElement Credit_card_type;
	
	@FindBy(name = "creditnumber")
	WebElement Credit_card_number;

	@FindBy(name = "cc_exp_dt_mn")
	WebElement CC_exp_mnth;
	
	@FindBy(name = "cc_exp_dt_yr")
	WebElement CC_exp_year;
	
	@FindBy(name = "cc_frst_name")
	WebElement CC_First_name;
	
	@FindBy(name = "cc_mid_name")
	WebElement CC_middle_name;
	@FindBy(name = "cc_last_name")
	WebElement CC_Last_name;
	@FindBy(name = "billAddress1")
	WebElement Billing_add1;
	
	@FindBy(name = "billAddress2")
	WebElement Billing_add2;
	
	@FindBy(name = "billCity")
	WebElement BillingCity;;
	
	@FindBy(name = "billState")
	WebElement Billing_state;
	
	@FindBy(name = "billZip")
	WebElement Billing_zip;
	
	@FindBy(name = "billCountry")
	WebElement Billing_country;
	
	@FindBy(name = "delAddress1")
	WebElement Delivery_Address1;
	
	@FindBy(name = "delAddress2")
	WebElement Delivery_Address2;
	
	@FindBy(name = "delCity")
	WebElement Delivery_city;
	
	@FindBy(name = "delState")
	WebElement Delivery_state;

	@FindBy(name = "delZip")
	WebElement Delivery_zip;
	
	@FindBy(name = "delCountry")
	WebElement Delivery_country;
	
	@FindBy(name = "ticketLess")
	List<WebElement> checkbox;
	
	@FindBy(name = "buyFlights")
	WebElement SecureFlightsbtn;
	
	
	@FindBy(xpath= "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[7]/td[2]/font")
	WebElement passCount;
	
	public WebElement getFirstName0txtbox() {
		return FirstName0txtbox;
	}
	public WebElement getFirstName1txtbox() {
		return FirstName1txtbox;
	}
	public WebElement getFirstName2txtbox() {
		return FirstName2txtbox;
	}
	public WebElement getFirstName3txtbox() {
		return FirstName3txtbox;
	}
	public WebElement getFirstName4txtbox() {
		PassFirst.add(FirstName4txtbox);
		return FirstName4txtbox;
	}
	public WebElement getLastName0() {
		return LastName0;
	}
	public WebElement getLastName1() {
		return LastName1;
	}
	public WebElement getLastName2() {
		return LastName2;
	}
	public WebElement getLastName3() {
		return LastName3;
	}
	public WebElement getLastName4() {
		PassLast.add(LastName4);
		return LastName4;
	}
	public WebElement getMealPreference0() {
		return MealPreference0;
	}
	public WebElement getMealPreference1() {
		return MealPreference1;
	}
	public WebElement getMealPreference2() {
		return MealPreference2;
	}
	public WebElement getMealPreference3() {
		return MealPreference3;
	}
	public WebElement getMealPreference4() {
		return MealPreference4;
	}
	public WebElement getCredit_card_type() {
		return Credit_card_type;
	}
	public WebElement getCredit_card_number() {
		return Credit_card_number;
	}
	public WebElement getCC_exp_mnth() {
		return CC_exp_mnth;
	}
	public WebElement getCC_exp_year() {
		return CC_exp_year;
	}
	public WebElement getCC_First_name() {
		return CC_First_name;
	}
	public WebElement getCC_middle_name() {
		return CC_middle_name;
	}
	public WebElement getCC_Last_name() {
		return CC_Last_name;
	}
	public WebElement getBilling_add1() {
		return Billing_add1;
	}
	public WebElement getBilling_add2() {
		return Billing_add2;
	}
	public WebElement getBillingCity() {
		return BillingCity;
	}
	public WebElement getBilling_state() {
		return Billing_state;
	}
	public WebElement getBilling_zip() {
		return Billing_zip;
	}
	public WebElement getBilling_country() {
		return Billing_country;
	}
	public WebElement getDelivery_Address1() {
		return Delivery_Address1;
	}
	public WebElement getDelivery_Address2() {
		return Delivery_Address2;
	}
	public WebElement getDelivery_city() {
		return Delivery_city;
	}
	public WebElement getDelivery_state() {
		return Delivery_state;
	}
	public WebElement getDelivery_zip() {
		return Delivery_zip;
	}
	public WebElement getDelivery_country() {
		return Delivery_country;
	}
	public List<WebElement> getCheckbox() {
		return checkbox;
	}
	public WebElement getSecureFlightsbtn() {
		return SecureFlightsbtn;
	}
	public ArrayList<WebElement> getPassFirst() {
		PassFirst.add(getFirstName0txtbox());
		PassFirst.add(getFirstName1txtbox());
		PassFirst.add(getFirstName2txtbox());
		PassFirst.add(getFirstName3txtbox());
		PassFirst.add(getFirstName4txtbox());
		return PassFirst;
	}
	public ArrayList<WebElement> getPassLast() {
		PassLast.add(getLastName0());
		PassLast.add(getLastName1());
		PassLast.add(getLastName2());
		PassLast.add(getLastName3());
		PassLast.add(getLastName4());
		return PassLast;
	}
	public ArrayList<WebElement> getPassMeal() {
		PassMeal.add(getMealPreference0());
		PassMeal.add(getMealPreference1());
		PassMeal.add(getMealPreference2());
		PassMeal.add(getMealPreference3());
		PassMeal.add(getMealPreference4());
		return PassMeal;
	}
}
