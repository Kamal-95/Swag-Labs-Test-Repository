import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\newchrome1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(5000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("shopping_cart_container")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Kamal");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("201001");
		Thread.sleep(5000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("logout_sidebar_link")).click();

	}

}
