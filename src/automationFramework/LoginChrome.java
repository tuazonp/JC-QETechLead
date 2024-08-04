package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginChrome {
	
	
	public static void main(String[] args) {

		//Setting the driver path
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
				
				//Creating WebDriver instance
				WebDriver driver = new ChromeDriver();
				
				//Navigate to web page
				driver.get("https://practicetestautomation.com/practice-test-login/");
				
				//Maximizing window
				//driver.manage().window().maximize();
				
				
				//Locating web element
				WebElement uName = driver.findElement(By.xpath("//*[@id='username']"));
				WebElement pswd = driver.findElement(By.xpath("//*[@id='password']"));
				WebElement loginBtn = driver.findElement(By.xpath("//*[@id='submit']"));
				
				
				//Login using valid credentials
				uName.sendKeys("student");
				pswd.sendKeys("Password123");
				loginBtn.click();
								
				//Retrieving new web page URL
				String url = driver.getCurrentUrl();
				System.out.println("The URL is : " +url);
								
				
				//Locating web element
				WebElement congratsTxt = driver.findElement(By.xpath("//strong[contains(text(),'Congratulations student. You successfully logged in!')]"));
				WebElement logoutBtn = driver.findElement(By.xpath("//*[contains(text(),'Log out')]"));
			
				//WebElement e = driver.findElement(By.xpath("//*[text()='Get started free']"));
				//WebElement congratsTxt = driver.findElement(By.xpath("//strong[contains(text(),'Congratulations student. You successfully logged in!')]"));
		
				//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']
				
				//Validating presence of element				
				if(congratsTxt.isDisplayed()){
					System.out.println("Found text : Congratulations student. You successfully logged in!");
				}
				
				if(logoutBtn.isDisplayed()){
					logoutBtn.click();
					System.out.println("Found Log out button");
				}
				
				
				//Closing browser session
				driver.quit();
	}
	}

