package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("j_idt88:name")).sendKeys("vaishnavi");
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("india");
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		driver.findElement(By.id("j_idt88:j_idt97")).clear();
		driver.findElement(By.id("j_idt88:j_idt97")).sendKeys("can you clear me, please");
		WebElement mail = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']"));
		mail.sendKeys("aaa@gmail.com");
		mail.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("im vaishnavi");
		driver.findElement(By.className("ql-stroke")).click();
		driver.findElement(By.xpath("(//span[@class='ql-picker-label'])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='ql-italic'])[1]")).click();
		driver.findElement(By.xpath("(//button[@class='ql-underline'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("im a testing engineer");
		WebElement error = driver.findElement(By.xpath("(//input[@role='textbox'])[7]"));
		error.sendKeys(Keys.ENTER);
	     Thread.sleep(3000);
	    driver.findElement(By.id("j_idt106:float-input")).click();
	    driver.findElement(By.id("j_idt106:auto-complete_input")).sendKeys("vaishnavi");
	    driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
	    driver.findElement(By.xpath("(//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all'])[3]")).click();
	    WebElement dob = driver.findElement(By.xpath("input[@class='ui-inputfield ui-widget ui-state-default ui-corner-all']"));
	    dob.sendKeys("17/01/2000");
	    dob.sendKeys(Keys.TAB);
	    WebElement number = driver.findElement(By.xpath("//a[@class='ui-spinner-button ui-spinner-up ui-corner-tr ui-button ui-widget ui-state-default ui-button-text-only']"));
	    number.sendKeys("12");
	    WebElement inc = driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']"));
	    inc.click();
	    WebElement dec = driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-s']"));
	    dec.click();
	    driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[4]")).sendKeys("12");
	    WebElement slide = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	    slide.getAttribute("12");
	    driver.findElement(By.xpath("ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad")).click();
	    WebElement content = driver.findElement(By.xpath("(//button[@class='ql-bold'])[2]"));
	    content.click();
	    content.sendKeys("hello");
	    WebElement content1 = driver.findElement(By.xpath("(//button[@class='ql-italic ql-active'])"));
	    content1.click();
	    content1.sendKeys("how are you");
	    WebElement content2 = driver.findElement(By.xpath("(//button[@class='ql-underline'])[2]"));
	    content2.click();
	    content2.sendKeys("im fine");
	    WebElement content3 = driver.findElement(By.xpath("//line[@class='ql-stroke ql-thin'][2]"));
	    content3.click();
	    content3.sendKeys("hello");
	    WebElement content4 = driver.findElement(By.xpath("//span[@data-value='serif'][2]"));
	    content4.click();
	    content4.sendKeys("hai");
	    driver.close();
	    
	    
	    
	    
		
		
		
		
		
	
		
		
			
				
				
	}

	private static void click() {
		// TODO Auto-generated method stub
		
	}

}
