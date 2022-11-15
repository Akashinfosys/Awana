package Test_NG_programmes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocation_count {
	@Test (invocationCount = 10)
	public void TC1() {
		Reporter.log("running tc1",true);
	}

}
