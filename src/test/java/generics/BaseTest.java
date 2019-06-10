package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConst{
	public static WebDriver driver;
	@BeforeMethod
	public void preCondition(){
		
		//System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@AfterMethod
	public void postCondition(){
		driver.close();

	}
}
