package pages;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JenkinsPipeline {
	
	// in order to execute below script written in the method use TestNG annotation
		// ** TestNG annotation will be always written above the Java method
		
		@Test
		public void createAccount() throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
	        
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
			
			Thread.sleep(1500);
			
			driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("naveen2@123.com");
			
			driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("naveen123");
			
		    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
			
			Thread.sleep(1500);

			driver.close();
	}


}
