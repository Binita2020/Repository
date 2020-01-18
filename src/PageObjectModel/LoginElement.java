package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginElement {
	WebDriver driver;
	 By username = By.name("email");
	 By password=By.name("pass");
	 By login=By.id("u_0_2");
	
	public LoginElement(WebDriver driver1){
		this.driver=driver1;
	}
	public void userN(String uid)	{
		driver.findElement(username).sendKeys(uid);
	}
	public void passW(String upwd)	{
		driver.findElement(password).sendKeys(upwd);
	}
	public void loginB() 	{
		driver.findElement(login).click();
	}
}