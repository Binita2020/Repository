package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCaseClass {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.ie.driver",
		"C:\\Users\\IBM_ADMIN\\Desktop\\Selenium Jars\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
	   	WebDriver driver = new InternetExplorerDriver();
	   	driver.get("https://www.facebook.com/");
	   	
	   	LoginElement login =new LoginElement(driver);
	   	login.userN("binita");
	   	login.passW("negi");
	   	login.loginB();
	    driver.quit();
	}
}
