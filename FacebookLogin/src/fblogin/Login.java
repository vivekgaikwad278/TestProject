package fblogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\vivek\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("u_0_j")).sendKeys("Vivek");
		driver.findElement(By.name("lastName")).sendKeys("Gaikwad");
		driver.findElement(By.name("reg_email")).sendKeys("gaikwadvivek@gmail.com");
		driver.findElement(By.name("reg_pass")).sendKeys("Vivek@1234");
	
	}

}
