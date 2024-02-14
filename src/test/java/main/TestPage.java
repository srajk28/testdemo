package main;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.BasePageClass;
import page.BlazePage;

public class TestPage extends BasePageClass
{
	@Test
	public void BlazeApp()
	{
		BlazePage bpage=PageFactory.initElements(driver, BlazePage.class);
		bpage.BlazeHomePage();
		bpage.clickOnDestinationWeekLink();
		bpage.departurePurchaseTicket();
		bpage.destinationPurchaseTicket();
		bpage.clickOnFindFlightButton();
		bpage.chooseThisFlight();
		bpage.totalCost();
		bpage.clickOnPurchaseButton();
		bpage.purchaseConfirmation();
	}
}