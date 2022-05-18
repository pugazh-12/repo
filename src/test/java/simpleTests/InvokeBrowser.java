package simpleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class InvokeBrowser {
	@Test
	public static void webDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pugazh\\eclipse-workspace\\handson\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://www.google.com";
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Ok google");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
		
		
		
	}

}
