package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		List<WebElement> numberOfBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Number of checkboxes: "+numberOfBoxes.size());
		
		driver.findElement(By.xpath("//div[text()='Java']/input")).click();
		driver.findElement(By.xpath("//div[text()='C']/input")).click();
		driver.findElement(By.xpath("//div[text()='C++']/input")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Selenium']/input")).isSelected();
		
		if (driver.findElement(By.xpath("//div[text()='I am Selected']/input")).isSelected())
			driver.findElement(By.xpath("//div[text()='I am Selected']/input")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Option 1')]/input")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Option 2')]/input")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Option 3')]/input")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Option 4')]/input")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Option 5')]/input")).click();
		Thread.sleep(2000);
		
		driver.close();
		
	}
}