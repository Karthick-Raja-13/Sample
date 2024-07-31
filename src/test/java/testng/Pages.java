package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pages {
	WebDriver driver;
	public void start() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\calculator_testing\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/");
	}
	public WebElement getAddBtn() {
		WebElement addbtn = driver.findElement(By.xpath("/html[1]/body[1]/button[1]"));
		return addbtn;
	}
	public WebElement getSubBtn() {
		WebElement subbtn = driver.findElement(By.xpath("/html[1]/body[1]/button[2]"));
		return subbtn;
	}
	public WebElement getMulBtn() {
		WebElement mulbtn = driver.findElement(By.xpath("/html[1]/body[1]/button[3]"));
		return mulbtn;
	}
	public WebElement getDivBtn() {
		WebElement Divbtn = driver.findElement(By.xpath("/html[1]/body[1]/button[4]"));
		return Divbtn;
	}
	public WebElement getInputOne() {
		WebElement inp = driver.findElement(By.xpath("/html[1]/body[1]/input[1]"));
		return inp;
	}
	public WebElement getInputTwo() {
		WebElement inp = driver.findElement(By.xpath("/html[1]/body[1]/input[2]"));
		return inp;
	}
	public WebElement getSpan() {
		WebElement inp = driver.findElement(By.id("result"));
		return inp;
	}
	public void close() {
		driver.quit();
	}
}
