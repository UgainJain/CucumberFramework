package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPL {

	@FindBy(name = "userName")
	private WebElement txtboxusrname;
	
	@FindBy(name = "password")
	private WebElement txtboxpassword;
	
	@FindBy(name = "login")
	private WebElement loginbutton;

	public WebElement getTxtboxusrname() {
		return txtboxusrname;
	}
	public WebElement getTxtboxpassword() {
		return txtboxpassword;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
}
