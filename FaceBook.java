package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Create New Account")).click();
	//System.out.println("click on create new acc.");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Shruti");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Goswami");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("87654567");
	driver.findElement(By.id("password_step_input")).sendKeys("Hello123");
	
	WebElement dropDown1 = driver.findElement(By.id("day"));
	Select selectDropDown1=new Select(dropDown1);
	selectDropDown1.selectByValue("19");
	
	WebElement dropDown2 = driver.findElement(By.id("month"));
	Select selectDropDown2=new Select(dropDown2);
	selectDropDown2.selectByVisibleText("Jan");
	
	WebElement dropDown3 = driver.findElement(By.id("year"));
	Select selectDropDown3=new Select(dropDown3);
	selectDropDown3.selectByVisibleText("1995");
	
	driver.findElement(By.name("sex")).click();
	
	Thread.sleep(5000);
	
	driver.close();
	
	
	
	
	
}
}
