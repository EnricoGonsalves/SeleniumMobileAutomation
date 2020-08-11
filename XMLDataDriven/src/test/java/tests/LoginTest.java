package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginClass;
import util.BrowserFactory;


public class LoginTest {


	
@Test
@Parameters({"username", "password"})
public void TecfiosLogin(String username, String password)
{
	
WebDriver driver=  BrowserFactory.startBrowser();

LoginClass logintowebsite=PageFactory.initElements(driver, LoginClass.class);

logintowebsite.login(username, password);

driver.close();

driver.quit();


}

	

}
