package com.Testcases;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.Listener.ListenerClass.class)
public class TestCase_1 {
	@Test
	public void m1() {
	Reporter.log("tc1 Test running");
	}

}
