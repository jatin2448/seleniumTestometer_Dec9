package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumFirstProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.google.com";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
