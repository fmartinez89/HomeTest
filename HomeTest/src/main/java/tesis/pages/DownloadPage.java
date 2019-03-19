package tesis.pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import tesis.environment.Variables;


@DefaultUrl(Variables.URL)
public class DownloadPage extends PageObject{
	
	public DownloadPage(WebDriver driver) {
		super(driver);
	}
	
	

	public List<String> downloadWinFiles(String title) {	
		List<String> filesNames = new ArrayList<>();
		List<WebElement> rows= getDriver().findElements(By.xpath("//*[@id='updates-table']/tbody/tr"));
		for(WebElement row : rows)
		{
		   List<WebElement> columns = row.findElements(By.tagName("td"));
		   		   
		   if(columns.get(0).getText().contains(title))
		   {
		      columns.get(3).findElement(By.tagName("a")).click();
		      filesNames.add(StringUtils.substringBefore(columns.get(3).findElement(By.tagName("a")).getText(), ".cab"));
		   }
		}
		getDriver().quit();
		return filesNames;
	}
	
	public List<String> downloadWinFiles(int id) {	
		List<String> filesNames = new ArrayList<>();
		List<WebElement> rows= getDriver().findElements(By.xpath("//*[@id='updates-table']/tbody/tr"));
		for(WebElement row : rows)
		{
		   List<WebElement> columns = row.findElements(By.tagName("td"));
		   		   
		   if( Integer.parseInt(columns.get(0).getText())==id)
		   {
		      columns.get(3).findElement(By.tagName("a")).click();
		     filesNames.add(StringUtils.substringBefore(columns.get(3).findElement(By.tagName("a")).getText(), ".cab"));
		 
		   }
		}
		getDriver().quit();
		return filesNames;
	}
}
