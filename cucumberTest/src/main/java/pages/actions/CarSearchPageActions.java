package pages.actions;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;




import utils.SeleniumDriver;

public class CarSearchPageActions {
	
	//WebDriver driver=null;
	
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
	
	CarSearchPageActions CarSearchPageActions = new CarSearchPageActions();
	public  CarSearchPageActions()
	{
		//this.driver=driver;
		
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}

	public void selectCarMaker(String carBrand)
	{
		
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='makes']")).click();
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectCarMaker=new Select(CarSearchPageActions.carMakerDropDown);
		selectCarMaker.selectByVisibleText("BMW");
		
	}
	
	public void selectCarModel(String carModel)
	{
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='models']")).click();
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectCarModel=new Select(CarSearchPageActions.selectModelDropDown);
		selectCarModel.selectByVisibleText(carModel);
	}
	public void selectLocation(String location)
	{
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='locations']")).click();
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectLocation=new Select(CarSearchPageActions.selectLocation);
		selectLocation.selectByVisibleText(location);
	}
	public void selectPrice(String price)
	{
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='price-max']")).click();
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectPrice=new Select(CarSearchPageActions.priceList);
		selectPrice.selectByVisibleText(price);
	}
	
	public void clickOnFindMyNextCarButton()
	{
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		CarSearchPageActions.findMyNextCarButton.click();
		
	}
	
	
	
}
