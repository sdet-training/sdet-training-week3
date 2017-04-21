package sdettraining.week3.day5;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(D4_002a_ReportConfiguration.class)
public class D4_002b_TestsAndReportUsage {
	
	@Test
	public void testOne_P(){
		Assert.assertTrue(true);
	}
	
	@Test
	public void testTwo_F(){
		Assert.assertTrue(false);
	}
	//Test case depends on failed testcase= testTwo_F
	@Test(dependsOnMethods="testTwo_F")
	public void testRealReportThree(){
		
	}
	
	
	@Test
	public void tcAntTest(){									       
		System.out.println("HELLO from the ANT PROGRAM");					        
		System.out.println("TODAY's DATE IS->"+ currentDate() );					  
}	
	
	
  public String currentDate(){					        
	    return new Date().toString();					  
	}	
  
  

}
