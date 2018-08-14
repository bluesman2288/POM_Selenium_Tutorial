package POM_testcase_1;



import org.testng.annotations.Test;

import homepage.LoginPage;

public class VerifyLogin  extends LoginPage
{
	@Test
	public void verifyValidLogin() 
	{
		invokeBrowser();
		enterLoginInfo();
	}
	
}
