package pages.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import utils.SeleniumDriver;

public class UsedCarsSearchPageActions {
	//WebDriver driver=null;
	
	UsedCarsSearchPageActions usedCarsSearchPageActions= new UsedCarsSearchPageActions();
	public  UsedCarsSearchPageActions()
	{
		//this.driver=driver;
		
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}
	

	@FindBy(how=How.XPATH,using=".//*[@id='makes']")
	public WebElement carMakerDropDown;
	
	@FindBy(how=How.XPATH,using=".//*[@id='models']")
	public WebElement selectModelDropDown;
	
	@FindBy(how=How.XPATH,using=".//*[@id='locations']")
	public WebElement selectLocation;
	
	@FindBy(how=How.XPATH,using=".//*[@id='price-max']")
	public WebElement priceList;
	
	@FindBy(how=How.XPATH,using=".//*[@id='search-submit']")
	public WebElement findMyNextCarButton;

	public void selectCarMaker(String carBrand)
	{
		
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='makes']")).click();
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectCarMaker=new Select(usedCarsSearchPageActions.carMakerDropDown);
		selectCarMaker.selectByVisibleText(carBrand);
		
	}
	
	public void selectCarModel(String carModel)
	{
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='models']")).click();
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectCarModel=new Select(usedCarsSearchPageActions.selectModelDropDown);
		
		selectCarModel.selectByVisibleText(carModel);
		
		
	}
	public void selectLocation(String location)
	{
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='locations']")).click();
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectLocation=new Select(usedCarsSearchPageActions.selectLocation);
		selectLocation.selectByVisibleText(location);
	}
	public void selectPrice(String price)
	{
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='price-max']")).click();
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='price-max']")).click();
		Select selectPrice=new Select(usedCarsSearchPageActions.priceList);
		List<WebElement> list=selectPrice.getOptions();
		for(WebElement s:list)
		{
			System.out.println("--->"+s.getText());
		}
		selectPrice.selectByVisibleText(price);
	}
	
	public void clickOnFindMyNextCarButton()
	{
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		usedCarsSearchPageActions.findMyNextCarButton.click();
		
	}

}
