package step_defination;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjectRepository.LoginPL;
import utils.base.Drivers;
import utils.commonFunc.CommonUtils;
import utils.dataSource.LoadProperty;

public class LoginStepDefination extends Drivers {

LoginPL loginlib = null;
@Given("^User is on Login Page$")
public void user_is_on_Login_Page() {
	String Browser = LoadProperty.getvar("browser", "config");
	getdriver(Browser);
	
}

@When("^user provides \"(.*)\" and \"(.*)\"$")
public void user_provides_and(String username, String password) {
	loginlib = PageFactory.initElements(driver, LoginPL.class);
	CommonUtils.typetext(loginlib.getTxtboxusrname(), username);
	CommonUtils.typetext(loginlib.getTxtboxpassword(), password);
}

@Then("^user clicks on login button$")
public void user_clicks_on_login_button() {
	CommonUtils.click(loginlib.getLoginbutton());
    
}

@SuppressWarnings("deprecation")
@And("^user is on homepage$")
public void user_is_on_homepage() {
    String title = driver.getTitle();
    Assert.assertTrue(title.contentEquals("Find a Flight: Mercury Tours:"));
}
@And("^user is still on loginpage$")
public void user_still_login_page() {
	String title = driver.getTitle();
    Assert.assertTrue(title.contentEquals("Sign-on: Mercury Tours"));
}
}
