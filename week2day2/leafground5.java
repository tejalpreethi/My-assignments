package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leafground5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[text()='Go to Dashboard'])[1]")).click();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.findElement(By.xpath("//a[text()='Find the URL without clicking me.']")).click();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.findElement(By.xpath("//a[text()='Broken?']")).click();
		driver.get("https://www.leafground.com/link.xhtml");
	    System.out.println("the link is broken");
		driver.findElement(By.xpath("(//a[text()='Go to Dashboard'])[2]")).click();
		driver.get("https://www.leafground.com/link.xhtml");
		System.out.println("its a duplicate link");
		WebElement count = driver.findElement(By.xpath("//h5[text()='Count Links']"));
		Dimension linkcount=count.getSize();
		count.click();
		System.out.println("the no of links " +linkcount);
		WebElement count1 = driver.findElement(By.xpath("//h5[text()='Count Layout Links']"));
		Dimension layoutcount=count.getSize();
		count.click();
		System.out.println("th no of layoutlinks" +layoutcount);
		driver.close();
		
		
		
		
		

		
		
		
		
		
	}

}
