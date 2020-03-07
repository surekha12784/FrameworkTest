package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddcustomerPage {
	
	public WebDriver ldriver;
	
	public AddcustomerPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	By lnkCustomers_menu=By.xpath("//a[@href='#']//span[contains(text(),'Customers')");
	By lnkCustomers_menuitem=By.xpath("//span[@class='menu-item-title'][contains(text(),'Customers')]");
	By btnAddnew=By.xpath("//a[@class='btn bg-blue']");
	By lnktxtinfo=By.xpath("//span[contains(text(),'Customer info')]");
	By txtEmail=By.id("Email");
	By txtPassword=By.id("Password");
	By txtFirstName=By.id("FirstName");
	By txtLastName=By.id("LastName");
	By rdMaleGender=By.id("Gender_Male");
	By rdFemaleGender=By.id("Gender_Female");
	By txtDob=By.id("DateOfBirth");
	By txtCompanyName=By.id("Company");
	By ckIsTaxExempt=By.id("IsTaxExempt");
	By ckNewsLetterYourStoreName=By.xpath("//body[@class='skin-blue sidebar-mini']/div[@class='wrapper']/div[@class='content-wrapper']/div/form/div[@class='content']/div[@class='form-horizontal']/nop-panels[@id='customer-panels']/nop-panel/div[@id='customer-info']/div[@class='collapsed panel-container']/div[@class='panel-body']/div[@class='form-group']/div[@class='col-md-9']/div[2]/label[1]/input[1]");
	By ckNewsLetterTeststore2=By.xpath("//body[@class='skin-blue sidebar-mini']/div[@class='wrapper']/div[@class='content-wrapper']/div/form/div[@class='content']/div[@class='form-horizontal']/nop-panels[@id='customer-panels']/nop-panel/div[@id='customer-info']/div[@class='collapsed panel-container']/div[@class='panel-body']/div[@class='form-group']/div[@class='col-md-9']/div[2]/label[1]/input[1]");
	By drpCustomerroles=By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
	By drpCustrole_menuitem_administrators=By.xpath("//li[contains(text(),'Administrators')]");
	By drpCustrole_menuitem_Forummoderator=By.xpath("//li[contains(text(),'Forum Moderators')]");
	By drpCustrole_menuitem_Guest=By.xpath("//li[contains(text(),'Guests']");
	By drpCustrole_menuitem_Vendors=By.xpath("//li[contains(text(),'Vendors')]");
	By drpMgrofVendor=By.id("VendorId");
	By drpVendor1item=By.xpath("//option[contains(text(),'Vendor 1')]");
	By txtAreaAdminComment=By.id("AdminComment");
	By btnSave=By.name("save");
	
	public void clickOnCustomersMenu(){
		ldriver.findElement(lnkCustomers_menu).click();
	}
	public void clickOnCustomersMenuItem(){
		ldriver.findElement(lnkCustomers_menuitem).click();
	}
	public void clickOnAddnew(){
		ldriver.findElement(btnAddnew).click();
	}
	public void setEmail(String email){
		ldriver.findElement(txtEmail).sendKeys(email);
	}
	public void setPassword(String password){
		ldriver.findElement(txtPassword).sendKeys(password);
	}
	public void setFirstName(String first){
		ldriver.findElement(txtFirstName).sendKeys(first);
	}
	public void setLastName(String last){
		ldriver.findElement(txtLastName).sendKeys(last);
	}
	public void setGender(String gender){
		if(gender.equals("Male"))
		ldriver.findElement(rdMaleGender).click();
	
		else
			ldriver.findElement(rdFemaleGender).click();
			
	}
	public void setDob(String dob){
		
		ldriver.findElement(txtDob).sendKeys(dob);
	}
	public void setCompanyName(String cname){
		
		ldriver.findElement(txtCompanyName).sendKeys(cname);
	}
	public void setTaxExempt(){
		
		ldriver.findElement(ckIsTaxExempt).click();
	}
	public void setNewsLetter(){
		
		ldriver.findElement(ckNewsLetterTeststore2).click();
	}
    public void setCustomerRoles(String role) throws InterruptedException{
    	
    	ldriver.findElement(drpCustomerroles).click();
    	WebElement listitem;
    	Thread.sleep(3000);
    	if(role.contains("Administrators")){
    		listitem=ldriver.findElement(drpCustrole_menuitem_administrators);
    	}
    	else if(role.contains("Guests")){
    		listitem=ldriver.findElement(drpCustrole_menuitem_Guest);
    	}
    	else if(role.contains("Registered")){
    		listitem=ldriver.findElement(drpCustrole_menuitem_Forummoderator);
    	}
    	else {
    		listitem=ldriver.findElement(drpCustrole_menuitem_Vendors);
    	}
    	listitem.click();
    	JavascriptExecutor js=(JavascriptExecutor)ldriver;
    	js.executeScript("arguments[0].click()", listitem);
	}
	public void setManagerOfVendor(String value){
		
		Select drp=new Select(ldriver.findElement(drpMgrofVendor));
		drp.selectByVisibleText(value);
	}
	public void setAdminComment(String scmt){
		
		ldriver.findElement(txtAreaAdminComment).sendKeys(scmt);
		
	}


}
