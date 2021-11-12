package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeads {
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
	driver.findElement(By.xpath("(//span[text()='Advanced']/following::input)[2]")).sendKeys("P");
	
	
	
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).click();
	System.out.println(driver.getTitle());
	
	
	WebElement findElement2 = driver.findElement(By.id("viewLead_companyName_sp"));
	String text = findElement2.getText();
	System.out.println(text);
	
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Infosys");
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	Thread.sleep(2000);
	
	WebElement findElement = driver.findElement(By.id("viewLead_companyName_sp"));
	String cName = findElement.getText();
	if(cName.equalsIgnoreCase(text))
		System.out.println("Company name not updated");
		
	else
		System.out.println("Updated Company Name");
	
	driver.close();
	
	
	
	
	
	
}
}


