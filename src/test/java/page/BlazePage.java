package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BlazePage 
{
	WebDriver driver;
	public BlazePage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(xpath="//div[@class='container']//h1") WebElement titledisplay;
	@FindBy(linkText="destination of the week! The Beach!") WebElement destinatonlink;
	@FindBy(name="fromPort") WebElement departure;
	@FindBy(name="toPort") WebElement destination;
	@FindBy(xpath="//input[@type='submit']") WebElement findflightbutton;
	@FindBy(xpath="/descendant::input[@type='submit'][3]") WebElement chooseflight;
	@FindBy(xpath="//descendant::h2/../p)[5]") WebElement totalcost;
	@FindBy(xpath="//input[@type='submit']") WebElement purchasebutton;
	@FindBy(xpath="//table[@class='table']//tbody/tr[1]") WebElement purchasereport;

	public void BlazeHomePage()
	{
		titledisplay.isDisplayed();
	}
	public void clickOnDestinationWeekLink()
	{
		destinatonlink.click();
		String url=driver.getCurrentUrl();
		System.out.println(url.contains("vacation"));
		driver.navigate().back();
	}
	public void departurePurchaseTicket()
	{
		Select select=new Select(departure);
		select.selectByValue("Mexico City");
	}
	public void destinationPurchaseTicket()
	{
		Select select=new Select(destination);
		select.selectByValue("London");
	}
	public void clickOnFindFlightButton()
	{
		findflightbutton.click();
	}
	public void chooseThisFlight()
	{
		chooseflight.click();
	}
	public void totalCost()
	{
		totalcost.isDisplayed();
	}
	public void clickOnPurchaseButton()
	{
		purchasebutton.click();
	}
	@SuppressWarnings("unlikely-arg-type")
	public void purchaseConfirmation()
	{
		purchasereport.equals("Id");
	}
}