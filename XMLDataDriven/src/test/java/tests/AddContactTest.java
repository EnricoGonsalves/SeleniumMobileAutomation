package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.ContactPage;
import pages.DashboardPage;
import pages.LoginClass;
import util.BrowserFactory;

public class AddContactTest {	
	
	
	@Test
	@Parameters({"username", "password","name","company","email","phone","address","city","zip","state"})	
	
	public void AddingContact(String username,String password, String name, String company , String email , String phone, String address, String city , String zip, String state )
	{
		
	WebDriver driver=  BrowserFactory.startBrowser();

	LoginClass logintowebsite=PageFactory.initElements(driver, LoginClass.class);

	logintowebsite.login(username,password);	
			
	//AssertJUnit.assertEquals(expectedTitle, actualTitle);
	
	DashboardPage Dashboard=PageFactory.initElements(driver, DashboardPage.class);
	
	Dashboard.isCustomerBoxDisplayed();
	
	Dashboard.ClickAddContact();	
	
	ContactPage contact=PageFactory.initElements(driver, ContactPage.class);
	
	contact.FillUpContactForm(name, company , email , phone, address, city , zip, state);	

	driver.close();

	driver.quit();


	}
	

}
