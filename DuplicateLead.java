package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	Thread.sleep(2000);
	
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.linkText("Email")).click();
	driver.findElement(By.name("emailAddress")).sendKeys("s");
	driver.findElement(By.linkText("Find Leads")).click();
	
	Thread.sleep(2000);
	
	String  lead= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).getText();
	System.out.println("Lead Name of first resulting lead: "+lead);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).click();
	driver.findElement(By.linkText("Duplicate Lead")).click();
	
	String title = driver.getTitle();
	if(title.contains("Duplicate Lead"))
		System.out.println("Title verified");
	
	driver.findElement(By.name("submitButton")).click();
	
	WebElement firstElement = driver.findElement(By.id("viewLead_firstName_sp"));
	String firstName = firstElement.getText();
	System.out.println(firstName);
	
	if(lead.equalsIgnoreCase(firstName))
		System.out.println("Duplicate Name");
	else
		System.out.println("Not Duplicate Name");
	
	driver.close();
	
	
	
	
	
	
}
}