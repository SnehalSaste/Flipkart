package utility;


	import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

	
	
	public class SeleniumOperations 
	{
		public static WebDriver driver=null;
		
		public static Hashtable <String,Object> outputParameters=new Hashtable<String,Object>();
		
		//BrowserLaunch
		public static Hashtable <String,Object> browserLaunch(Object[]inputParameters)
		{
			String strBrowserName=(String) inputParameters[0];
			String webDriverExePath=(String) inputParameters[1];
			try 
			{
			if(strBrowserName.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver",webDriverExePath);
				driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}
			else if(strBrowserName.equalsIgnoreCase("FF"))
			{
				System.setProperty("webdriver.gecko.driver", webDriverExePath);
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}
			
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodName:browserLaunch,Input_Data :" + inputParameters[1].toString());
			
			}catch(Exception e)
			{
				outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "methodName:browserLaunch,Input_Data :" + inputParameters[1].toString());
			}
			return outputParameters;
		}
		
		//open application
		public static Hashtable <String,Object> openApplication(Object[]inputParameters)
		{
			try
			{
			String strURL= (String) inputParameters[0];
			driver.get(strURL);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodName:openApplication,Input_Data :" + inputParameters[0].toString());
			}catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "methodName:openApplication,Input_Data :" + inputParameters[0].toString());
			}
			return outputParameters;
		}
		//Click on element
			public static Hashtable <String,Object> clickOnElement(Object[]inputParameters) 
			{
				try
				{
				String xpath= (String) inputParameters[0];
				driver.findElement(By.xpath(xpath)).click();
				//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "methodName:clickOnElement,Input_Data :" + inputParameters[0].toString());
				
				}
				catch(Exception e)
				{
					outputParameters.put("STATUS", "FAIL");
					outputParameters.put("MESSAGE", "methodName:clickOnElement,Input_Data :" + inputParameters[0].toString());
				}
				return outputParameters;
			}
		//move to element
			public static Hashtable <String,Object> moveToElement(Object[]inputParameters)
			{
				try
				{
				String xpath= (String) inputParameters[0];
				Actions act=new Actions(driver);
				WebElement element = driver.findElement(By.xpath(xpath));
				Thread.sleep(1000);
				act.moveToElement(element).build().perform();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "methodName:moveToElement,Input_Data :" + inputParameters[0].toString());
				
				}
				catch(Exception e)
				{
					outputParameters.put("STATUS", "FAIL");
					outputParameters.put("MESSAGE", "methodName:moveToElement,Input_Data :" + inputParameters[0].toString());
				}
				return outputParameters;
			}
		//sendkeys
			public static Hashtable <String,Object> sendKeys(Object[]inputParameters) 
			{
				try
				{			
					String xpath= (String) inputParameters[0];
					String parameter= (String) inputParameters[1];
					driver.findElement(By.xpath(xpath)).sendKeys(parameter);
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					outputParameters.put("STATUS", "PASS");
					outputParameters.put("MESSAGE", "methodUsed: sendKeys, Input_Data"+inputParameters[1].toString());
				}
				catch(Exception e)
				{
					outputParameters.put("STATUS", "FAIL");
					outputParameters.put("MESSAGE", "methodName:sendKeys,Input_Data :" + inputParameters[1].toString());
				}
				return outputParameters;
			}
			public static Hashtable <String,Object> validationLogin(Object[]inputParameters) 
			{
				try
				{			
				String givenText= (String) inputParameters[0];
				String xpath= (String) inputParameters[1];
			String text=driver.findElement(By.xpath(xpath)).getText();
				if(givenText.equalsIgnoreCase(text))
				{
					System.out.println("Test case pass");
				}else
				{
					System.out.println("Test case Fail");

				}
				outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "methodName:validationLogin,Input_Data : " + inputParameters[0].toString());
				
				}catch(Exception e)
				{
					outputParameters.put("STATUS", "FAIL");
					outputParameters.put("MESSAGE", "methodName:validationLogin,Input_Data :" + inputParameters[0].toString());
					
				}
				return outputParameters;
				
			}
			
			
			

}
