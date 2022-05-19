package com.Practice;

import org.testng.annotations.DataProvider;

public class DP_Test {

	@DataProvider
	public static Object[][] login(){
		return new Object[][] {
			new Object[]{"kiran@gmail.com","123456","JavaByKiran | Dashboard"},
			new Object[] {"Nikita@gmail.com","456789","JavaByKiran | Log in"},
			new Object[] {"amol@gmail.com","abcdef","JavaByKiran | Log in"},
		};// above coding is for dataprovider present in same class.
	}
}
