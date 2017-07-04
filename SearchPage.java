package FirstPage;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchPage {

	public static void main(String[] args) {
		WebDriver f;
		f= new FirefoxDriver();
		f.get("http://www.amazon.in/");
		f.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("mobiles");
		//f.findElement(By.cssSelector(".nav-input")).click();
		List<WebElement> list = f.findElements(By.cssSelector(".s-heavy"));
	
	System.out.println(list.size());
	list.get(2).click();
	}

}

