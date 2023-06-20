package Tests;

import org.testng.annotations.Test;

import keywords.AdminPageKeywords;
import keywords.LoginPageKeyword;

public class TestNgRunner {
	LoginPageKeyword logkey = new LoginPageKeyword();
	AdminPageKeywords adminkey = new AdminPageKeywords();
	
	Action action = new Action();
	
	@Test(priority=1)
	public void executeLoginPage() {
		
		try {
			action.execute_Test("Login_testdata",logkey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority=2)
       public void executeAdminPage() {
		
		try {
			action.execute_Test("Admin_facet",adminkey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
