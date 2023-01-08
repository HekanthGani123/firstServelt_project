package com.jspiders.spring_basic.util;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CommonUtilTest {
	
	private CommonUtil commonUtil=null;
	
	@Before
	public void before() {
		commonUtil=new CommonUtil();
		System.out.println("executing @Before annotation ");
	}
	
	@After
	public void after() {
		System.out.println("executing @After annotation ");
		
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("executing @AfterClass annotation ");
		
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("executing @BeforeClass annotation ");
	}
	
	@Test
	public void addTest() {
		
		assertEquals(commonUtil.add(-1, -2),0);
	}
	
	@Test
	public void checkTest() {
		assertEquals(commonUtil.check("hekanth", "gunjur"),"name address");
	}

}
