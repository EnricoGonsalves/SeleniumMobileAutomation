package AndroidApp.MobileAndroidApp;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;

public class androidappTest {
	
	
AppiumDriver driver;


@Test
public void Selendroid() throws MalformedURLException, InterruptedException{

DesiredCapabilities capb= new DesiredCapabilities();
capb.setCapability("platform", "Android");
capb.setCapability("deviceName", "emulator-5554");
capb.setCapability("appPackage", "io.selendroid.testapp");
capb.setCapability("appActivity", ".HomeScreenActivity");

driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capb);
	
Thread.sleep(4000);	

driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();
driver.findElement(By.id("io.selendroid.testapp:id/inputUsername")).sendKeys("John");
driver.findElement(By.id("io.selendroid.testapp:id/inputEmail")).sendKeys("john@gmail.com");
driver.findElement(By.id("io.selendroid.testapp:id/inputPassword")).sendKeys("abc123");
driver.findElement(By.id("io.selendroid.testapp:id/inputName")).sendKeys("John");
driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser")).click();
driver.quit();
	
	
	
	
	
	
	
}
	
	
	
	
	
	

}
