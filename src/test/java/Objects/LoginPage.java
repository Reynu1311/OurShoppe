package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(xpath = "//span[contains(text(),' Sign In / Sign Up ')]")
	public static WebElement SignIn;
	@FindBy(xpath = "//a[contains(text(),'Log In ')]")
	public static WebElement LogIn;
	@FindBy(id = "login_email")
	public static WebElement Username;
	@FindBy(id = "login_password")
	public static WebElement Password;
	@FindBy(name = "login_submit")
	public static WebElement LoginButton;

}
