package PractoPages;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import BasePkg.Base;

public class HomePage extends Base{
	By place=By.xpath("//*[@id=\"c-omni-container\"]/div/div[1]/div[1]/input");
	By specialization=By.xpath("//*[@id=\"c-omni-container\"]/div/div[2]/div[1]/input");
	By cityList=By.xpath("//*[@id=\"c-omni-container\"]/div/div[1]/div[2]/div[2]/div");
	public void placeSelection() throws Exception
	{
		WebElement city=driver.findElement(place);
		city.clear();
		
		city.sendKeys(properties.getProperty("city"));
		city.sendKeys(Keys.ARROW_DOWN);
		city.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		
		
	}
	public void specializationSelection()
	{
		driver.findElement(specialization).click();
		WebElement gp=driver.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[2]/div[2]/div/div[3]/span[1]/div"));
		System.out.println(gp.getText());
		gp.click();
	}
}
