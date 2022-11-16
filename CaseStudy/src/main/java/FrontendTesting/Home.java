package FrontendTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("http://127.0.0.1:5501/home.html");
		obj.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/a")).click();
		obj.findElement(By.id("inputEmail")).sendKeys("pooja143@gmail.com");
		obj.findElement(By.id("inputPassword")).sendKeys("3575");
		obj.findElement(By.xpath("/html/body/section/div/div/div/div/div/form/button"));
		obj.get("http://127.0.0.1:5501/dashboard.html");
		
       
	}

}
