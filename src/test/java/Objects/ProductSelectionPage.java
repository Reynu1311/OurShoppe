package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductSelectionPage {
	@FindBy(xpath = "//div[@class=\"col-sm-4 col-md-4 col-lg-21\"]")
	public static WebElement SelectedProduct;

}
