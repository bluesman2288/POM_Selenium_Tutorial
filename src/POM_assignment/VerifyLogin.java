package POM_assignment;



import org.testng.annotations.Test;

import homepage.AssignmentLogin;


public class VerifyLogin  extends AssignmentLogin
{
	@Test
	public void verifyValidLogin() 
	{
		invokeBrowser();
		enterLoginInfo();
		signoff();
	}
	
}
