package week2.assign2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
	public static void main(String[] args) {
		//Launch the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get(" https://leafground.com/checkbox.xhtml");
		//to maximize the window
		driver.manage().window().maximize();
		//click the basic 
		driver.findElement(By.className("ui-chkbox-label")).click();
		
		
		
		
	}
}

