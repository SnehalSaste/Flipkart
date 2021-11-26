package cucumbermap;



import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.HTMLReportGenerator;

public class Hookable 
{
	@Before
	public void beforeMethod(Scenario scenario) throws Throwable
	{
		HTMLReportGenerator.TestSuiteStart("C:\\extentreport\\flipkart.html", "FlipkartProject");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		
		System.out.println("......................Scenario Start.............................");
	}
	@After
	public void afterMethod(Scenario scenario)
	{
		System.out.println("......................Scenario End.............................");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
		
	}

}
