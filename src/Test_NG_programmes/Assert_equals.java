package Test_NG_programmes;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_equals {
	@Test 
	public void TC1() {
		Reporter.log("running tc1",true);
   String actR="Anky";
   String expR="Anky";
   
   Assert.assertEquals(expR, actR);
}
}