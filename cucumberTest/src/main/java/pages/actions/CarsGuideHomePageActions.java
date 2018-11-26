package pages.actions;

import utils.SeleniumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;




public class CarsGuideHomePageActions {
	
	CarsGuideHomePageActions carsGuideHomePageActions=new CarsGuideHomePageActions();
	public CarsGuideHomePageActions()
	{
		
		
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}
	

	@FindBy(how=How.LINK_TEXT,using="Cars For Sale")
	public WebElement carsForSaleLink;
	
	@FindBy(how=How.LINK_TEXT,using="Sell My Car")
	public WebElement sellMyCarLink;
	
	@FindBy(how=How.LINK_TEXT,using="Car Reviews")
	public WebElement carReviewsLink;
	
	@FindBy(how=How.LINK_TEXT,using="Search Cars")
	public WebElement searchCarsLink;
	
	@FindBy(how=How.LINK_TEXT,using="Used Cars Search")
	public WebElement usedSearchCarsLink;
	
	public void moveToCarsForSaleMenu()
	{
		Actions action= new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageActions.carsForSaleLink).perform();
	}
	public void clickOnSearchCarsMenu()
	{
		//moveToCarsForSaleMenu();
		carsGuideHomePageActions.searchCarsLink.click();
		
	}
	public void clickOnUsedSearchCarsMenu()
	{
		//moveToCarsForSaleMenu();
		carsGuideHomePageActions.usedSearchCarsLink.click();
		
	}

}
