package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElement(By.id("yes")).click();
		WebElement radioButton = driver.findElement(By.xpath("//label[@for = 'Checked']/input"));
		if (radioButton.isSelected())

			System.out.println(" Radio button is Selected");
		else
			radioButton.click();
		
		Thread.sleep(2000);

		WebElement button2 = driver.findElement(By.xpath("//input[@class='myradio'][2]"));

		if (button2.isSelected())
			System.out.println("Already Selected");
		else 
			button2.click();
		
		driver.close();

	}
}