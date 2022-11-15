package Test_NG_programmes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test (enabled = false) //intentionally we are ignoring /skipping tc1
	public void TC1() {
		Reporter.log("running tc1",true);
	}
	@Test 
	public void TC2() {
		Reporter.log("running tc2",true);
	}
}
