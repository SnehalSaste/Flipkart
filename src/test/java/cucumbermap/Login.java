package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login 
{
	@Given ("^user open \"(.*)\" browser with exe \"(.*)\"$")
	public void Lbrowser(String bname, String exe)
	{
		Object[] input=new Object[2];
		input[0]=bname;
		input[1]=exe;
		SeleniumOperations.browserLaunch(input);
		
	}
	
	@Given ("^user enter \"(.*)\" as url$")
	public void openApp(String url)
	{
		Object[] input1=new Object[1];
		input1[0]=url;
		SeleniumOperations.openApplication(input1);
	}
	
	@Given ("^user click on cancle button to close login window$")
	public void cancle()
	{
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.clickOnElement(input2);
	}
	
	@Given ("^user move on login button$")
	public void moveToLogin()
	{
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		SeleniumOperations.moveToElement(input3);
		
		
	}
	@When ("^user click on my profile$")
	public void clickOnMyProfile()
	{
		Object[] input4=new Object[1];
		input4[0]="(//*[@class='_3vhnxf'])[1]";
		Hashtable<String, Object> output4 = SeleniumOperations.clickOnElement(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user Click on MyProfile$", output4.get("MESSAGE").toString());
		
	}
	@When ("^user enter \"(.*)\" as username$")
	public void userName(String uname) 
	{
		Object[] input5=new Object[2];
		input5[0]="//*[@class='_2IX_2- VJZDxU']";
		input5[1]=uname;
		Hashtable<String, Object> output5 = SeleniumOperations.sendKeys(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter \"(.*)\" as a username$", output5.get("MESSAGE").toString());
			
	}
	@When ("^user enter \"(.*)\" as password$")
	public void password(String pwd) 
	{
		Object[] input6=new Object[2];
		input6[0]="//*[@type='password']";
		input6[1]=pwd;
		Hashtable<String, Object> output6 = SeleniumOperations.sendKeys(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^user enter \"(.*)\" as a password$" , output6.get("MESSAGE").toString());
		
	}
	@When ("^user click on login button$")
	public void clickOnLogin()
	{
		Object[] input7= new Object[1];
		input7[0]="(//*[@type='submit'])[2]";
		Hashtable<String, Object> output7 = SeleniumOperations.clickOnElement(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on login button$", output7.get("MESSAGE").toString());
		
	}
	@Then("^application shows profile to user$")
	public void validateLogin()
	{
		Object[] input8=new Object[2];
		input8[0]="Snehal Saste";
		input8[1]="//*[text()='Snehal Saste']";
		Hashtable <String,Object> output8 =  SeleniumOperations.validationLogin(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^application shows profile to user$", output8.get("MESSAGE").toString());
//		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^application shows profile to user$", output8.get("MESSEGE").toString());
		
		/*
		 * Object[] input8=new Object[2];
		input8[0]="Avinash Shere";
		input8[1]="//*[text()='Avinash Shere']";	
		Hashtable<String, Object> output8 = SeleniumOperations.validationLogin(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^application shows user profile$", output8.get("MESSAGE").toString());
		 */
	    
	}

	
}
