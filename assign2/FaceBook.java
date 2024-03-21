package week2.assign2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
	
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("email")).sendKeys("jkjeon@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("abc");

		driver.findElement(By.name("login"));

		driver.findElement(By.linkText("Create new account")).click();

		driver.findElement(By.name("firstname")).sendKeys("Junkook"); 
		
		driver.findElement(By.name("lastname")).sendKeys("Jeon");
		
		driver.findElement(By.name("reg_email__")).sendKeys("jungkook97@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("jungkook97@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Jeon@123");
		
		WebElement dayDD = driver.findElement(By.id("day"));
		Select sec = new Select(dayDD);
		sec.selectByIndex(0);
		
		WebElement monthDD = driver.findElement(By.id("month"));
		Select sec1=new Select(monthDD);
		sec1.selectByValue("9");
		
		WebElement yearDD=driver.findElement(By.id("year"));
		Select sec2=new Select(yearDD);
		sec2.selectByVisibleText("1997");
		
		driver.findElement(By.name("sex")).click();
		
		driver.findElement(By.name("websubmit")).click();
		driver.getTitle();
		
	}
}