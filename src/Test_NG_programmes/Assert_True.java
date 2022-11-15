package Test_NG_programmes;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_True {
	@Test 
	public void TC2() {
        Reporter.log("running tc2",true);
		boolean actR=true;
		Assert.assertTrue(actR);
}
	
}