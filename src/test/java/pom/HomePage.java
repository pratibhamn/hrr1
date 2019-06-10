package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generics.Basepage;

public class HomePage extends Basepage {

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="txtUsername")
	private WebElement userTxtBox;
	@FindBy(id="txtPassword")
	private WebElement pwdTxtBox;
	@FindBy(id="btnLogin")
	private WebElement loginBtn;
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement pim_Menu;
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addEmp_Menu;
	@FindBy(id="firstName")
	private WebElement firstName;
	@FindBy(id="lastName")
	private WebElement lastNme;
	@FindBy(id="btnSave")
	private WebElement saveBtn;
	@FindBy(id="personal_txtEmpFirstName")
	private WebElement firstName1;
	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement addEmpList_Btn;
	
	
	public void setUserName(String un){
		userTxtBox.sendKeys(un);
	}
	
	public void setPwd(String pwd){
		pwdTxtBox.sendKeys(pwd);
	}
	
	public void clickLogin(){
		loginBtn.click();
	}
	public void clickPiM_Menu(){
		pim_Menu.click();
	}
	public void clickAddEmp_Menu(){
		addEmp_Menu.click();
	}
	public void setFirstName(String fn){
		firstName.sendKeys(fn);
	}
	public void setLastName(String ln){
		 lastNme.sendKeys(ln);
	}
	public void clickSaveBtn(){
		saveBtn.click();
	}
	public void verifyFirstName(String eFn){
		String aFn = firstName1.getAttribute("value");
		Assert.assertEquals(aFn, eFn);
		
	}
	public void clickAddEmpList(){
		addEmpList_Btn.click();
	}
}
