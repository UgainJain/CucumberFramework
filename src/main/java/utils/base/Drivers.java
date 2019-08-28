package utils.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Drivers {
	public static String url = "http://newtours.demoaut.com/index.php";
	protected static WebDriver driver;
	public void getdriver(String drivername) {
		if(drivername.equalsIgnoreCase("chrome"))
		{	
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")
							+"/Resources/Drivers/chromedriver.exe");
			  driver =new ChromeDriver();
			  OpenUrl();
			
		}
		else if (drivername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"Resources/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			OpenUrl();
			
		}
		else if (drivername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"Resources/Drivers/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			OpenUrl();
		}
		else {
			System.out.println("No Driver Found for the give browser so initializing Default browser : Chrome");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"Resources/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
	public static void OpenUrl() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	public void closebrwsr() {
		driver.close();
	}
}
