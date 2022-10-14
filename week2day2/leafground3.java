package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leafground3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//option[text()='Selenium']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[1]")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[2]")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
		driver.findElement(By.xpath("//li[text()='AWS']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[3]")).click();
		driver.findElement(By.xpath("//option[text()='English']")).click();
		driver.findElement(By.xpath("//option[text()='Select Values']")).click();
		driver.close();
		
		
		
		
		
		
		
		
	}

}
