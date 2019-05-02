package MyGrouP.MyArtifacT;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myTestJ 
{
	
	@Before
	   void setUp() {
	   }

	   @Before
	   void tearDown() {
	   }

	@Test
	public void site_header_is_on_home_page() 
	{   
	       System.setProperty("webdriver.chrome.driver","c\\users\\matt\\chromedriver.exe");   
	       WebDriver browser = new ChromeDriver();
	       browser.get("https://www.saucelabs.com");       
	       WebElement href = browser.findElement(By.xpath("//a[@href='/beta/login']"));
	       
	       assertTrue((href.isDisplayed()));  
	       browser.close();
	}
	public void test() 
	{
		fail("Not yet implemented");
	}

}
