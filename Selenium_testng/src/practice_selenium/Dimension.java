package practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimension {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("APjFqb"));
		org.openqa.selenium.Dimension d = search.getSize();
		System.out.println(d.getWidth());
		int a = d.getHeight();
		System.out.println(a);
	
///////////////////////////////////////////////////
		//Location
		
		Point p1=search.getLocation();
		System.out.println(p1.getX());
		System.out.println(p1.getY());
	}

}
