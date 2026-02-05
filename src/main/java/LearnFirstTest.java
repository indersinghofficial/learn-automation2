import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFirstTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		
		WebElement input_username=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement input_password=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement button_login=driver.findElement(By.xpath("//button[contains(@class,'login')]"));
		
		input_username.sendKeys("Admin");
		input_password.sendKeys("admin123");
		button_login.click();	
		
		
		
	}

}
