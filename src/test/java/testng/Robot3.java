package testng;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Robot3 {
@Test
public void rbt() throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\calculator_testing\\\\src\\\\test\\\\resources\\\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://easyupload.io/");
	Thread.sleep(Duration.ofSeconds(5));
	driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[3]/form[1]/div[2]/button[1]")).click();
	Thread.sleep(Duration.ofSeconds(5));
	Robot rbt =new Robot();
	String fp = "C:\\Users\\Admin\\eclipse-workspace\\calculator_testing\\src\\test\\resources\\Screenshot 2024-07-27 141123.png";
	StringSelection ss = new StringSelection(fp);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	rbt.keyPress(KeyEvent.VK_CONTROL);
	rbt.keyPress(KeyEvent.VK_V);
	rbt.keyRelease(KeyEvent.VK_V);
	rbt.keyRelease(KeyEvent.VK_CONTROL);
	rbt.keyPress(KeyEvent.VK_ENTER);
	rbt.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(Duration.ofSeconds(10));
	
}
}
