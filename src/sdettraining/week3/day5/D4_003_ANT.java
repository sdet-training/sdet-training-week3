package sdettraining.week3.day5;

import java.util.Date;

import org.junit.Test;

public class D4_003_ANT {
	
	@Test
	public void tcAntTest(){									       
		System.out.println("HELLO from the ANT PROGRAM");					        
		System.out.println("TODAY's DATE IS->"+ currentDate() );					  
}	
	
	
  public String currentDate(){					        
	    return new Date().toString();					  
	}	
	

}
