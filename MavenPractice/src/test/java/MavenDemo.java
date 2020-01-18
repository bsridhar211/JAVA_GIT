import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenDemo 
{

	
	@Test
	public void mavenWorld(){
		System.out.println("Welcome to Maven World");
		System.out.println("Hii Git, Hii Jenkins");
		System.out.println("Testing Jenkins auto build");
		System.out.println("Testing Jenkins auto build");
		System.out.println("ttttt");
		System.out.println("Hi");
		System.out.println("Hi Hi");
		
	}
	
	@Test

	public void checkTite()
	{

			System.setProperty("webdriver.chrome.driver",
					"E://Selenium Software//Java_Selenum_Setup_Installer//selenium-java-3.0.0-beta3//chromedriver_win32//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///E:/Java_Selenium_Final/Offline%20Website/offline/Offline%20Website/index.html");
			driver.manage().window().maximize();
			String ExpectedMsg = "JavaByKiran | Log in";
			String ActMsg = driver.getTitle();
			Assert.assertEquals(ActMsg, ExpectedMsg);
			driver.quit();

	}
}
	
