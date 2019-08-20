package failTestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testclass {
	WebDriver driver;
	
	@BeforeTest
	
	public void SetUp() {
    //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\ITTraining\\AllDriver\\chromedriver.exe");
		
		driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	}
	
	
	@Test(priority=1)
	public void getURL() {
		String URL=driver.getCurrentUrl();
		String ExpectedURL="www.yahoo.com";
		Assert.assertEquals(URL, ExpectedURL);
	}
	@Test(priority=2)
	public void SignIn() {
		driver.findElement(By.id("345")).sendKeys("psmukta@yahoo.com");
		driver.findElement(By.name("name")).sendKeys("2345");
		
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	



