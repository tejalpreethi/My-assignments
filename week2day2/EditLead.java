package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("vaishnavi");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    driver.findElement(By.xpath("//a[text()='10421']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement cpname = driver.findElement(By.id("updateLeadForm_companyName"));
		cpname.sendKeys("test leaf");
		cpname.clear();
		cpname.sendKeys("tcs");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		driver.close();
		
		
		
		
		

	}

}
