package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeatMapPage {

	WebDriver driver;

	public HeatMapPage(WebDriver driver) {	
		this.driver = driver;
	}

	private String  hover_heatmap = "//div[@class='W(100%) Mih(180px) screenshot-thumb ng-isolate-scope']";
	private String  View_heatmap = "//div[@class='screenshot-thumb__click-msg show-on-hover']";
	private String ElementList = "//div[@id='heatmap-player']//div[@class='option-tab vwo_player-option'][3]";
	private String emailColumn = "//td[text()='email']";


	public void ClickHeatMap() throws InterruptedException {	
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(hover_heatmap))));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(hover_heatmap)));
		action.click().build().perform();
	}
	
	public void ClickOnElementList() throws InterruptedException {	
		Thread.sleep(5000);
		javaScriptClick(driver.findElement(By.xpath(ElementList)));		
	}
	
	
	public boolean javaScriptClick(WebElement element) {
        boolean isClicked = false;
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
            isClicked = true;
        } catch (Exception e) {
            System.out.println(e + " Exception occurred while trying to click on element using javascript");
        }
        return isClicked;
    }
	public void ClickOnEmailColumn(){	
		driver.findElement(By.xpath(emailColumn)).click();		
	}
}
