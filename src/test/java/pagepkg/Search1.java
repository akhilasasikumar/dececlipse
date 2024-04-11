package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Search1 {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/input")
	WebElement searchbutton;
	
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[4]/div/div[5]/span")
	WebElement men;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[4]/div/div[6]/div/div[3]/a[5]/p")
	WebElement jewellery;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[4]/div[2]/div/div/div[2]/div[2]/div[24]/div[15]/div[2]/div/span[3]/a")
	WebElement haircolour;
	
	
	
	
	public Search1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void search(String searchKey)
	{
		searchbutton.sendKeys(searchKey,Keys.ENTER);
	
		
	}
	public void mencategory()
	{
		men.click();
		}
	
	public void jeweleryclicked()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("javascript:window.scrollBy(250,300)");
		jewellery.click();
	}
	
	public void titleverification()
	{
		String actualURL = driver.getCurrentUrl();
		
		String expectedURL="//*[@id=\"__next\"]/div[2]/div[1]/div/div[1]/a/img";
		
		Assert.assertEquals(actualURL, expectedURL);
	}
	
	public void clickhaircolour()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("javascript:window.scrollTo(0,document.body.scrollHeight)");
		haircolour.click();
		
	}
}
	

