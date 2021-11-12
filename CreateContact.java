package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/login");
	Thread.sleep(2000);
	
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("Shruti");
	driver.findElement(By.id("lastNameField")).sendKeys("Goswami");
	driver.findElement(By.name("departmentName")).sendKeys("Computer Science");
	driver.findElement(By.name("description")).sendKeys("Computer Science");
	driver.findElement(By.name("primaryEmail")).sendKeys("shruti@gmail.com");
	driver.findElement(By.name("primaryEmail")).sendKeys("shruti@gmail.com");
	
	WebElement dropDown = driver.findElement(By.name("generalStateProvinceGeoId"));
	Select state=new Select(dropDown);
	state.selectByVisibleText("Alabama");
	
	driver.findElement(By.name("submitButton")).click();
	
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.name("description")).clear();
	driver.findElement(By.name("importantNote")).sendKeys("Important");
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	
	Thread.sleep(2000);
	System.out.println("Title of the page: "+driver.getTitle());
	
	
	
	
}
}