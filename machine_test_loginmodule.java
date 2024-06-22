package mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class machine_test_loginmodule {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement element=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		element.sendKeys("student");
		Thread.sleep(1000);
		WebElement element2=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		element2.sendKeys("Password123");
		Thread.sleep(1000);
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		submit.click();

	}

}
