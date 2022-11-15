package Test_NG_programmes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test (priority = 2)
	public void TC1() {
		Reporter.log("running tc1",true);

	}
	@Test (priority = 3)
	public void TC2() {
		Reporter.log("running tc2",true);
}
	@Test (priority = 1)
	public void TC3() {
		Reporter.log("running tc3",true);
}
}