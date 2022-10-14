package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/\r\n");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Tejal");
		driver.findElement(By.name("lastname")).sendKeys("preethi");
	    driver.findElement(By.name("reg_email__")).sendKeys("vaishnavimohanraj66@gmail.com");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("vrauik");
	    driver.findElement(By.xpath("//select[@id='day']")).click();
	    driver.findElement(By.xpath("//option[text()='6']")).click();
	    driver.findElement(By.xpath("//select[@id='month']")).click();
	    driver.findElement(By.xpath("//option[text()='Feb']")).click();
	    driver.findElement(By.xpath("//select[@id='year']")).click();
	    driver.findElement(By.xpath("//option[text()='2002']")).click();
	    driver.findElement(By.xpath("//input[@type='radio']")).click();
	    driver.close();
	    
	    
	    
	    
		
				
		
		

	}

}
