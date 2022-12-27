package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample3 {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		
	
		System.setProperty("webdriver.gecko.driver", "software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']")).click();
	     Robot R = new Robot();
	     R.keyPress(KeyEvent.VK_RIGHT);
	     R.keyRelease(KeyEvent.VK_RIGHT);
	     driver.findElement(By.id("email")).sendKeys("8970006350");
	     Thread.sleep(2000);
	     R.keyPress(KeyEvent.VK_5);
	     R.keyRelease(KeyEvent.VK_5);
	     
	     
}
}