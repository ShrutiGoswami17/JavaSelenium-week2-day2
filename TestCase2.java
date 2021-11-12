package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Shruti");
		driver.findElement(By.id("lastNameField")).sendKeys("Goswami");
		
		WebElement dropDown = driver.findElement(By.id("createContactForm_preferredCurrencyUomId"));
		Select selectDropDown=new Select(dropDown);
		selectDropDown.selectByVisibleText("INR - Indian Rupee");
		
		Thread.sleep(2000);
		
		WebElement dropDown2 = driver.findElement(By.name("generalCountryGeoId"));
		Select selectDropDown2=new Select(dropDown2);
		selectDropDown2.selectByValue("IND");
		driver.findElement(By.name("submitButton")).click();
		
		
		
		driver.close();
	}




}


