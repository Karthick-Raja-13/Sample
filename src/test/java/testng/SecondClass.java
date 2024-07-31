package testng;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SecondClass {
	@DataProvider(name="AdditionData")
	public Object[][] dataProvide(){
		return new Object[][] {
			{12,14,26},
			{1,2,3},
			{10,20,30},
			{100,200,300}
		};
	}
	Pages pg = new Pages();
	@BeforeMethod
	public void getSite() {
		pg.start();
	}
	@Test(dataProvider="AdditionData")
	public void testSub(int fv,int sv,int eo) {
		pg.getInputOne().sendKeys(String.valueOf(fv));
		pg.getInputTwo().sendKeys(String.valueOf(sv));
		pg.getAddBtn().click();
		int total = fv+sv;
		Assert.assertEquals(String.valueOf(total),pg.getSpan().getText());
		pg.close();
	}
}
