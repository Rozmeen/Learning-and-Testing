package other_tests_TestNG;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class SystemDateTime {
  @Test
  public void f() {
	  
	 //---This is for date only---
	 // DateFormat dateformat= new SimpleDateFormat("MM/dd/yyyy");
	 // Date date= new Date();
	 // String date1= dateformat.format(date);
	 // System.out.println(date1);
	  
	  //---This is for date and time both---
	  DateFormat dateformat= new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	  Date date= new Date();
	  String date1= dateformat.format(date);
	  System.out.println(date1);
  }
}
