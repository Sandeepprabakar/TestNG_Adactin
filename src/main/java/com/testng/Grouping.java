package com.testng;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = "music")
	private void jiosavnn() {
		System.out.println("jio");
	}
	@Test(groups = "music")
	private void wynkmusic() {
		System.out.println("wync");
	}
	@Test(groups = "social media")
	private void facebook() {
		System.out.println("fb");
	}
	@Test(groups = "social media")
	private void instagram() {
		System.out.println("insta");
		
	}
	
	
}
