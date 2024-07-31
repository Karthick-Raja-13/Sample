package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.testng.annotations.Test;

public class NewTest {
@Test
public void sikuli() {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\calculator_testing\\\\src\\\\test\\\\resources\\\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/");
	Pattern p = new Pattern("C:\\Users\\Admin\\eclipse-workspace\\selenium\\src\\test\\resources\\Screenshot 2024-07-27 141123.png");
	Pattern p2 = new Pattern("C:\\Users\\Admin\\eclipse-workspace\\selenium\\src\\test\\resources\\Screenshot 2024-07-27 141517.png");
	Screen screen = new Screen();
	try {
		screen.wait(p,10);
		screen.click(p);
		screen.wait(p2,2);
		screen.click(p2);
	} catch (FindFailed e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
