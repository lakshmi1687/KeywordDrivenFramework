package Tests;


import org.testng.annotations.Test;
import keywords.AdminPageKeywords;
import keywords.LoginPageKeyword;

public class TestNgRunner {
	LoginPageKeyword logkey = new LoginPageKeyword();
	AdminPageKeywords adminkey = new AdminPageKeywords();
	Action action = new Action();
	
	

	@Test
	public void executeTest() {
		
		try {
			action.execute_Test("Login_testdata",logkey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
