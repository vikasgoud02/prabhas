package seleniumprgrms;
/*open ebay.com
. search for laptops
. read only Lenovo laptop products and display*/


import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.openqa.selenium.remote.session.ChromeFilter;

public class ebay {
	//public static void main(String[] args) {
	@Test
	public void ebay()
	{	

	ChromeDriver d=new ChromeDriver();
		d.get("https://www.ebay.com/");
		d.findElementByName("_nkw").sendKeys("Laptops");
		d.findElementByName("_nkw").sendKeys(Keys.ENTER);
		//to display all the elements of word Lenovo
		d.findElementByXPath("//input[@aria-label='Lenovo']").click();//checkbox inspect for lenovo
		List<WebElement> a1=(d.findElementsByClassName("s-item__title"));
		System.out.println(a1.size());
		for(WebElement webElement:a1) {
			String name=webElement.getText();
			System.out.println(name);
		
			
		}
		
	}

}
