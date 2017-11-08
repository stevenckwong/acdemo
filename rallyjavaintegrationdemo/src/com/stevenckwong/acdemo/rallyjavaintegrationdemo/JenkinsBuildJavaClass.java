package com.stevenckwong.acdemo.rallyjavaintegrationdemo;

public class JenkinsBuildJavaClass {
	
	public JenkinsBuildJavaClass() {
		
	}
	
	static public void main(String[] args) {
		
		JenkinsBuildJavaClass2 utility = new JenkinsBuildJavaClass2();
		String someValueFromUtility = utility.getMeSomeValue();
		System.out.println(someValueFromUtility);
		System.out.println("This java class is for testing the Jenkins build integration");
	}
	

}
