package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
	Thread.sleep(2000);
	
	
	driver.findElement(By.name("UserFirstName")).sendKeys("Shruti");
	driver.findElement(By.name("UserLastName")).sendKeys("Goswami");
	driver.findElement(By.name("UserEmail")).sendKeys("Shruti@gmail.com");
	driver.findElement(By.name("CompanyName")).sendKeys("CTS");
	driver.findElement(By.name("UserPhone")).sendKeys("765678945");
	
	
	WebElement dropDown1 = driver.findElement(By.name("UserTitle"));
	Select selectDropDown1=new Select(dropDown1);
	selectDropDown1.selectByVisibleText("Sales Manager");
	
	WebElement dropDown2 = driver.findElement(By.name("CompanyEmployees"));
	Select selectDropDown2=new Select(dropDown2);
	selectDropDown2.selectByVisibleText("101 - 500 employees");
	
	WebElement dropDown3 = driver.findElement(By.name("CompanyCountry"));
	Select selectDropDown3=new Select(dropDown3);
	selectDropDown3.selectByValue("IN");
	
	
	driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
	
	Thread.sleep(5000);
	
	driver.close();
	
	
	
}
}