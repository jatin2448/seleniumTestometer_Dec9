package seleniumBasics;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		String url = "https://www.booking.com/";
		driver.get(url);
		
		Thread.sleep(5000);
		
		Dimension dim = new Dimension(100,200);
		driver.manage().window().setSize(dim);
		
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
