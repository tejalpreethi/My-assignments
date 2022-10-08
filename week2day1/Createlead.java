package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("test leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vaishnavi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Deepika");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("vaishu");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("working as a test engineer");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sgmvaishnavi@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String title= driver.getTitle();
		System.out.println(title);
		
		
	
		
		
		
		
		
		
		

	}

}
