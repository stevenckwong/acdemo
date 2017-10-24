package com.stevenckwong.acdemo.rallyjavaintegrationdemo;

// This class created just to test the integration demo. It is a class that is easy to 
// compile without any dependencies

public class MyUtility {
	
	public MyUtility() {
		
	}
	// This method parses the Rally result from logging in and returns the DisplayName
	// field.
	public String parseResultForDisplayName(String result) {
		int startIndex = result.indexOf("\"_refObjectName\": \"");
		startIndex+=19;
		
		int endIndex = result.indexOf("\"", startIndex);
		
		String displayName = result.substring(startIndex, endIndex);
		return displayName;
	}	

}
