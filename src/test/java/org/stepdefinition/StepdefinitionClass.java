package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.reusablecode.BaseClass;

import Objects.AddTocartPage;
import Objects.CompletePurchaseAndPlaceOrderPage;
import Objects.LoginPage;
import Objects.ProductSelectionPage;
import Objects.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefinitionClass extends BaseClass {
	Actions a;

	@Given("user has to open the url of the web page")
	public void user_has_to_open_the_url_of_the_web_page() {
		openBrowser();
		loadUrl("https://www.ourshopee.com/");
		property();
		log.info("User is opening the browser and website");
		driver.manage().window().maximize();

	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		// a = new Actions(driver);
		// a.moveToElement(signIn).build().perform();
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.SignIn.click();
		LoginPage.LogIn.click();
		LoginPage.Username.sendKeys(string);
		LoginPage.Password.sendKeys(string2);
		LoginPage.LoginButton.click();
		property();
		log.info("User is entering the username and password");

	}

	@Then("click login button")
	public void click_login_button() {
		// PageFactory.initElements(driver, LoginPage.class);
		property();
		log.info("User clicked the login button");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.MINUTES);
	}

	@Given("user has to login to the web page")
	public void user_has_to_login_to_the_web_page() {
		pageUrl();
		property();
		log.info("Displaying the url");

	}

	@When("user has to search for {string}")
	public void user_has_to_search_for(String string) {
		PageFactory.initElements(driver, SearchPage.class);
		SearchPage.SearchProduct.sendKeys(string + Keys.ENTER);
		property();
		log.info("User is searching for product");
		/*
		 * a =new Actions(driver);
		 * a.keyDown(Keys.SHIFT).sendKeys(SearchPage.SearchProduct,
		 * string).keyUp(Keys.SHIFT).build().perform(); a.click().build().perform();
		 */
	}

	@Then("click enter to search the desired product")
	public void click_enter_to_search_the_desired_product() {
		pageUrl();
		pageTitle();
		property();
		log.info("Page title and page url displayed");

	}

	@Given("user has to select and click the desired product")
	public void user_has_to_select_and_click_the_desired_product() {
		PageFactory.initElements(driver, ProductSelectionPage.class);
		ProductSelectionPage.SelectedProduct.click();
		property();
		log.info("User has selected the product succcessfully");

	}

	@When("user has to click on add to cart")
	public void user_has_to_click_on_add_to_cart() {
		PageFactory.initElements(driver, AddTocartPage.class);
		AddTocartPage.ProductAddedToCart.click();
		property();
		log.info("User clicked on the add cart button");

	}

	@When("user has to complete the purchase")
	public void user_has_to_complete_the_purchase() {
		PageFactory.initElements(driver, CompletePurchaseAndPlaceOrderPage.class);
		a = new Actions(driver);
		a.moveToElement(CompletePurchaseAndPlaceOrderPage.addToCart).build().perform();
		CompletePurchaseAndPlaceOrderPage.Complete.click();
		property();
		log.info("User added the prooduct to cart successfully");

	}

	@When("user has to enter the address details Select Emirate Select Area,Street Address")
	public void user_has_to_enter_the_address_details_Select_Emirate_Select_Area_Street_Address() {
		WebElement clickAddress = driver.findElement(By.id("select_address"));
		clickAddress.click();
		WebElement click = driver.findElement(By.id("select_address"));
		chooseText(click, 2);
		property();
		log.info("User selected the address");
	}

	@Then("place the order")
	public void place_the_order() {
		// WebDriverWait wait=new WebDriverWait(driver, 60);
		// WebElement click =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='place_order']")));
		pageUrl();
		driver.findElement(By.name("notes")).sendKeys("Nothing");
		WebElement radioBtnPayment = driver.findElement(By.xpath("//div[@class='radio-item lst-br']"));
		radioBtnPayment.click();
		WebElement placeOrder = driver.findElement(By.name("place_order"));
		placeOrder.click();
		property();
		log.info("User placed the order successfully");

	}

}
