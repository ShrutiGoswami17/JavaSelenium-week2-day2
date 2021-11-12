package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leafground.com/pages/Button.html");
	
	
	driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
	driver.navigate().back();
	System.out.println(driver.findElement(By.id("position")).getLocation());
	System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
	System.out.println(driver.findElement(By.id("size")).getSize());
	driver.close();
}
}