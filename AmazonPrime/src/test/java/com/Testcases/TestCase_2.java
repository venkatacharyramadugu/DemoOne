package com.Testcases;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.Listener.ListenerClass.class)
public class TestCase_2 {
	
	
		@Test
		public void m2() {
		Reporter.log("tc2 Test running");
		}
}	


