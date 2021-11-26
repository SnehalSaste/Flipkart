package utility;

public class Calling 
{
	public static void main(String[] args)
	{
		
		//OpenBrowser
				Object[] input=new Object[2];
						input[0]="chrome";
						input[1]="C:\\Selenium Support\\chromedriver.exe";
				SeleniumOperations.browserLaunch(input);
				
				//openApp
				Object[] input1= new Object[1];
						input1[0]="https://www.flipkart.com/";
						SeleniumOperations.openApplication(input1);
					
				//Click on cancel
				Object[] input2= new Object[1];
						input2[0]="//*[@class='_2KpZ6l _2doB4z']";
						SeleniumOperations.clickOnElement(input2);		
				//move to element
				Object[] input3= new Object[1];
						input3[0]="//*[@class='_1_3w1N']";
						SeleniumOperations.moveToElement(input3);
				
				//click on myprofile
				Object[] input4= new Object[1];
						input4[0]="(//*[@class='_3vhnxf'])[1]";
						SeleniumOperations.clickOnElement(input4);	
				//send username
				Object[] input5=new Object[2];
						input5[0]="//*[@class='_2IX_2- VJZDxU']";
						input5[1]="9673028877";
						SeleniumOperations.sendKeys(input5);
				//send password
				Object[] input6=new Object[2];
						input6[0]="//*[@type='password']";
						input6[1]="Admin@123";	
						SeleniumOperations.sendKeys(input6);
				//click on login
				Object[] input7= new Object[1];
						input7[0]="(//*[@type='submit'])[2]";
						SeleniumOperations.clickOnElement(input7);	

	}

}
