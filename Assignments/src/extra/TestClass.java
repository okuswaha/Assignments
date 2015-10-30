package extra;



import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestClass {
	public static void main(String args[]){
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://localhost:8080/SeleniumTest/");
		driver.findElement(By.name("login")).sendKeys("Lakshay"); 
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("commit")).click(); 
	}
	
	
}

