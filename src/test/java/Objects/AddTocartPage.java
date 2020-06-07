package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddTocartPage {
	@FindBy(xpath = "//span[contains(text(),'add to cart')]")
	public static WebElement ProductAddedToCart;
}
