package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

public class ginandjuiceshopdemo {
	public static void main(String[] args)
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
driver.get("https://ginandjuice.shop/");
driver.findElement(By.xpath("//div[@class='title-container']//a[@class='button'][normalize-space()='Products']")).click();
driver.findElement(By.xpath("//div[@theme='ecommerce']//a[1]//span[2]")).click();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement selectElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("storeId")));
Select select = new Select(selectElement); 
select.selectByValue("3");
WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
WebElement selectElement1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='quantity']")));
Select select1 = new Select(selectElement1); 
select.selectByValue("2");
driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
driver.findElement(By.xpath("//a[normalize-space()='View cart']")).click();
driver.findElement(By.xpath("//button[normalize-space()='Place order']")).click();
driver.findElement(By.name("username")).sendKeys("carlos");
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.findElement(By.name("password")).sendKeys("hunter2");
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.findElement(By.xpath("//button[normalize-space()='Place order']")).click();
	}

}
