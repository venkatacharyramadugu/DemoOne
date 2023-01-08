package com.Testcases;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
@Listeners(com.Listener.ListenerClass.class)
public class testCase_3 {
	public void m3()
	{
		Reporter.log("m3 Testcase running");
		
	}
	
}
