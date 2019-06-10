package scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Basepage;
import generics.Excel;
import generics.genericUtils;
import pom.HomePage;

public class TestScipts extends BaseTest {
	@Test(enabled=false)
	public void testCreateEmployee(){
		HomePage pi=new HomePage(driver);
		pi.setUserName("Admin");
		pi.setPwd("admin123");
		pi.clickLogin();
		Basepage.verifyTitle("OrangeHRM");
		pi.clickPiM_Menu();
		pi.clickAddEmp_Menu();
		pi.setFirstName("Pratibha");
		pi.setLastName("MN");
		pi.clickSaveBtn();
		pi.verifyFirstName("Pratibha");
		
	}
	@Test(enabled=true)
	public void testSortList() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		 HomePage pi = new HomePage(driver);
		pi.setUserName(Excel.readData("Sheet1", 0, 1));
		Thread.sleep(3000);
		pi.setPwd(Excel.readData("Sheet1", 1, 1));
		Thread.sleep(2000);
		pi.clickLogin();
		Basepage.verifyTitle("OrangeHRM");
		pi.clickPiM_Menu();
		//Thread.sleep(2000);
		pi.clickAddEmpList();
		//Thread.sleep(4000);
		genericUtils.sortListBox(driver.findElement(By.xpath("//select[@id='empsearch_job_title']")));
	}

}
