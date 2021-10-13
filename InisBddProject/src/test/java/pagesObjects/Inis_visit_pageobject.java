package pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Inis_visit_pageobject {

	WebDriver driver;

	By textsearchbox = By.name("q");

	public Inis_visit_pageobject(WebDriver driver) {
		this.driver = driver;
	}

	public void text_in_searchbox(String text) {

		try {
			Thread.sleep(2000);
			WebElement searchword = driver.findElement(textsearchbox);
			searchword.sendKeys(text);
		

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
