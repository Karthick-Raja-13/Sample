package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {
	Pages pg = new Pages();
@Test
public void testAdd() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\calculator_testing\\src\\test\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:8080/");
	driver.findElement(By.xpath("/html[1]/body[1]/input[1]")).sendKeys("2");
	driver.findElement(By.xpath("/html[1]/body[1]/input[2]")).sendKeys("2");
	driver.findElement(By.xpath("/html[1]/body[1]/button[1]")).click();
}
S
}
