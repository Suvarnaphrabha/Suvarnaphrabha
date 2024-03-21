package week2.assign2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) {
		//Launch the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the window
		driver.manage().window().maximize();
		//locate the username field and type the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//to verify the title 
		System.out.println(driver.getTitle());
		//click on crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		//click on leads link
		driver.findElement(By.linkText("Accounts")).click();
		//click on createlead link
		driver.findElement(By.linkText("Create Account")).click();
		//enter account name
		driver.findElement(By.id("accountName")).sendKeys("Suvarna");
		//enter description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		////locate the company dropdown and select directmail option by using index 
		WebElement companyDD = driver.findElement(By.name("industryEnumId"));
		Select sec = new Select(companyDD);
		sec.selectByIndex(3);
		//select S-corporation by using text
		WebElement ownershipCDD = driver.findElement(By.name("ownershipEnumId"));
		Select sec1 = new Select(ownershipCDD);
		sec1.selectByVisibleText("S-Corporation");
		//select the lead employee by using value
		WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
		Select sec2 = new Select(sourceDD);
		sec2.selectByValue("LEAD_EMPLOYEE");
		//select the eCommerce using index
		WebElement marketDD = driver.findElement(By.id("marketingCampaignId"));
		Select sec3=new Select(marketDD);
		sec3.selectByIndex(6);
		//select Texas by using value
		WebElement stateDD=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sec4=new Select(stateDD);
		sec4.selectByValue("TX");
		//click create account 
		driver.findElement(By.className("smallSubmit")).click();
		
		//print the title
		System.out.println(driver.getTitle());
	}
}


