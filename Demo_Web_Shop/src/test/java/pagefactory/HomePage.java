package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(linkText = "Books" )
	WebElement book;
	@FindBy(linkText = "Fiction")
	WebElement Fiction;
	@FindBy(xpath = "(//input[contains(@type,'button')])[2]")
	WebElement addtocart;
	@FindBy(xpath = "(//span[contains(@class,'cart-label')])[1]")
	WebElement shoppingcart;
	@FindBy(id = "termsofservice")
	WebElement checkbox;
	@FindBy(id = "checkout")
	WebElement checkout;

   
   
   public HomePage(WebDriver driver) {
	   PageFactory.initElements(driver, this);
   }
   
   public void clickBooks() {
	   book.click();
   }
   
   public void clickthirdbook() {
	   Fiction.click();
   }
   public void clickaddtocart() {
	   addtocart.click();
   }
   public void clickshoppingcart() {
	   shoppingcart.click();
   }
   public void  clickcheckbox() {
	   checkbox.click();
   }
   public void clickcheckout() {
	   checkout.click();
   }
}



