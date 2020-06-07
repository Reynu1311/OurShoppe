package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompletePurchaseAndPlaceOrderPage {
	@FindBy(id="quick-cart")
	public static WebElement addToCart;
	@FindBy(xpath = "//a[contains(text(),'Complete Purchase')]")
	public static WebElement Complete;

}
