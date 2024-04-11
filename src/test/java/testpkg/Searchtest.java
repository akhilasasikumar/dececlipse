package testpkg;



import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Search1;



public class Searchtest extends Baseclass {
	
	@Test
	public void testsearch()throws Exception
	{
		//WebDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();
		
		Search1 s1=new Search1(driver);
		s1.search("saree");
	//	Thread.sleep(2000);
	//	driver.navigate().refresh();
		s1.jeweleryclicked();
		s1.titleverification();
		s1.mencategory();
		s1.clickhaircolour();
		
		
		
}}
