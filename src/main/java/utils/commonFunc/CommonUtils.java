package utils.commonFunc;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtils {
	static Select sel;
	public static boolean typetext(WebElement element , String feildvalue) {
		boolean flag;
		try{
			if(element != null && feildvalue != null) {
				element.clear();
				element.sendKeys(feildvalue);
				flag = true;
			}
			else {
				System.out.println("Null parameter passed");
				flag = false;
			}
			return flag;
		}
		catch (Exception e) {
			System.out.println("Exception Found "+ e.getMessage());
			return false;
		}
	}
	public static boolean click(WebElement element) {
		if(element != null) {
			element.click();
			return true;
		}
		else {
			System.out.println("Null Parameter found");
			return false;
		}
		}
		
	public static boolean isdisplayed(WebElement element) {
		if(element != null) {
			boolean b = element.isDisplayed();
			if(b == true)
				return true;
			else 
				return false;
		}
		else 
			return false;
	}
	public static void selectfromradiobuttons(List<WebElement> radio,String value) {
		int len = radio.size();
		for(int i = 0;i <len;i++) {
			if(radio.get(i).getAttribute("value").equalsIgnoreCase(value))
				radio.get(i).click();
		}
	}
	
	public static void selectfromdrpdwn(WebElement element, String value) {
		sel = new Select(element);
		sel.selectByValue(value);
	}
	public static void selectwthoutvalue(WebElement element,String value) {
		sel = new Select(element);
		sel.selectByVisibleText(value);
	}
}
