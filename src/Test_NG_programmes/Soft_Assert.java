package Test_NG_programmes;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	@Test 
	public void TC1() {
        Reporter.log("running tc1",true);
        String expR="Hii";
        String actR="Bye";
        //object of soft assert
        SoftAssert s=new SoftAssert();
        s.assertEquals(expR, actR);//verification1
        System.out.println("I am after failed verification1");//verification2
        //mandatory
        s.assertAll();
}
	@Test
	public void TC2() {
		 Reporter.log("running tc2",true);
	}
}