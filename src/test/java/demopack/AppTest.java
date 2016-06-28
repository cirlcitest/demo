package demopack;

import org.junit.*; 




public class AppTest 
{
	
	
	@Test
	public void test2(){
		BloodGroup bg = new BloodGroup();
		Assert.assertEquals(true, bg.isValidGroup("AB"));
		
	}
	
	
	@Test
	public void test(){
		BloodGroup bg = new BloodGroup();
		Assert.assertEquals(false, bg.isValidGroup("xyz"));
		
	}
	
	
	@Test
	public void test1(){
		BloodGroup bg = new BloodGroup();
		Assert.assertEquals(false,bg.isValidGroup(" "));
		
	}
	
	

	
}
