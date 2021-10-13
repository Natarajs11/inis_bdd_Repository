package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesObjects.Inis_visit_pageobject;

public class Inis_visa_Steps {

	WebDriver driver;
	
	//Scenario 1 - visiting inis webpage by user

	@Given("browser is open")
	public void browser_is_open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:/workspace_BDD/InisBddProject/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("http://www.google.com");
		Thread.sleep(2000);
	}

	@Then("user enters {string}")
	public void user_enters(String text) throws InterruptedException {

		Inis_visit_pageobject ins = new Inis_visit_pageobject(driver);
		ins.text_in_searchbox(text);
		

	}

	@And("hits the enter")
	public void hits_the_enter() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user will be navigated to search results")
	public void user_will_be_navigated_to_search_results() throws InterruptedException {
		driver.getPageSource().contains("Check if you need an Irish visa - INIS");
		driver.navigate().to("http://www.inis.gov.ie/en/inis/pages/check-irish-visa");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

	
	
	//Scenario 2 - selecting india as nationality
	
	@Given("user is on the inis visa required page")
	public void user_is_on_the_inis_visa_required_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:/workspace_BDD/InisBddProject/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.inis.gov.ie/en/inis/pages/check-irish-visa");
		Thread.sleep(1000);
	}

	@Then("user selects nationality")
	public void user_selects_nationality() throws InterruptedException {

		Select drpCountry = new Select(driver.findElement(By.name("SelectURL")));
		drpCountry.selectByVisibleText("India");
		Thread.sleep(2000);
	}

	@Then("hits on select button")
	public void hits_on_select_button() {

		try {
			Thread.sleep(5000);
			driver.findElement(By.className("buttons")).click();

		} catch (Exception e) {
			System.out.println("exception" + e);
		}
	}

	@Then("user is navigated to visa-required page")
	public void user_is_navigated_to_visa_required_page() throws InterruptedException {

		driver.navigate().to("http://www.inis.gov.ie/en/INIS/Pages/visa-required");
		driver.findElement(By.linkText("More than 3 months")).click();
		Thread.sleep(2000);
	}

	@Then("when user select more than three months.")
	public void when_user_select_more_than_three_months() throws InterruptedException {

		driver.getPageSource().contains("More than 3 months");
		driver.navigate().to("http://www.inis.gov.ie/en/INIS/Pages/visa-required-long");
		Thread.sleep(2000);
	}

	@Then("user is navigated to study page.")
	public void user_is_navigated_to_study_page() throws InterruptedException {
		driver.getPageSource().contains("Study");
		Thread.sleep(2000);
	}

	@Then("when user clicks on the study link")
	public void when_user_clicks_on_the_study_link() throws InterruptedException {

		driver.findElement(By.linkText("Study")).click();
		Thread.sleep(2000);
	}

	@Then("user is navigated to visa long study page")
	public void user_is_navigated_to_visa_long_study_page() throws InterruptedException

	{

		driver.navigate().to("http://www.inis.gov.ie/en/INIS/Pages/visa-long-study");
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}

	
	//Scenario 3 - select france as nationality
	@Given("user is on the website")
	public void user_is_on_the_website() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:/workspace_BDD/InisBddProject/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.inis.gov.ie/en/inis/pages/check-irish-visa");
		Thread.sleep(1000);

	}

	@When("user selects nationality from drop down list")
	public void user_selects_nationality_from_drop_down_list() throws InterruptedException {

		Select drpCountry = new Select(driver.findElement(By.name("SelectURL")));
		drpCountry.selectByVisibleText("France");
		Thread.sleep(2000);

	}

	@And("user hits select button")
	public void user_hits_select_button() {

		try {
			Thread.sleep(5000);
			driver.findElement(By.className("buttons")).click();

		} catch (Exception e) {
			System.out.println("exception" + e);
		}

	}

	@Then("user is navigated to visa not required page.")
	public void user_is_navigated_to_visa_not_required_page() throws InterruptedException {

		driver.navigate().to("http://www.inis.gov.ie/en/INIS/Pages/visa-europe");
		Thread.sleep(2000);
		driver.close();

	}

	
	//Scenario 4 - select canada as nationality
	
	@Given("User has visited inis website")
	public void user_has_visited_inis_website() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:/workspace_BDD/InisBddProject/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.inis.gov.ie/en/inis/pages/check-irish-visa");
		Thread.sleep(1000);

	}

	@When("user selects his nationality from drop down list")
	public void user_selects_his_nationality_from_drop_down_list() throws InterruptedException {

		Select drpCountry = new Select(driver.findElement(By.name("SelectURL")));
		drpCountry.selectByVisibleText("Canada");
		Thread.sleep(1000);

	}

	@When("hits on the select button")
	public void hits_on_the_select_button() {

		try {
			Thread.sleep(5000);
			driver.findElement(By.className("buttons")).click();

		} catch (Exception e) {
			System.out.println("exception" + e);
		}

	}

	@Then("Users are navigated to visa requiremnt page")
	public void users_are_navigated_to_visa_requiremnt_page() throws InterruptedException {

		driver.navigate().to("http://www.inis.gov.ie/en/INIS/Pages/visa-required");
		driver.getPageSource().contains("More than 3 months");
		Thread.sleep(2000);

	}

	@Then("when user select more than {int} months option.")
	public void when_user_select_more_than_months_option(Integer int1) throws InterruptedException {

		driver.findElement(By.linkText("More than 3 months")).click();
		driver.navigate().to("http://www.inis.gov.ie/en/INIS/Pages/non-visa-required-long");
		Thread.sleep(2000);

	}

	@Then("users are navigated to study page.")
	public void users_are_navigated_to_study_page() throws InterruptedException {

		driver.getPageSource().contains("Study");
		Thread.sleep(2000);
	}

	@Then("when users clicks on the study link")
	public void when_users_clicks_on_the_study_link() throws InterruptedException {

		driver.findElement(By.linkText("Study")).click();
		Thread.sleep(2000);

	}

	@Then("Users are navigated to visa not required page")
	public void users_are_navigated_to_visa_not_required_page() throws InterruptedException {

		driver.navigate().to("http://www.inis.gov.ie/en/INIS/Pages/non-visa-long-study");
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}

}
