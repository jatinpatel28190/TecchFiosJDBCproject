package stepDefinnation1;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import database.DataBaseClass;

public class LoginStepDefination {
	static WebDriver driver;

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://techfios.com/billing/?ng=admin/");
	}

	@When("^user enter the username and password$")
	public void user_enter_the_username_and_password() throws ClassNotFoundException, SQLException {

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(DataBaseClass.getdataFromDataBase("username"));
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(DataBaseClass.getdataFromDataBase("passowrd"));
	}

	@Then("^user click on submit button$")
	public void user_click_on_submit_button() {

		driver.findElement(By.name("login")).click();
	}

	@Then("^user should be on homepage$")
	public void user_should_be_on_homepage() {

		Assert.assertTrue(
				driver.findElement(By.xpath("//ul[@class='nav']/descendant::span[contains(text(),'Bank & Cash')]"))
						.isDisplayed());

		driver.quit();

	}

}
