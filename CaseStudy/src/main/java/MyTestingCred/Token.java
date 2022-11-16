package MyTestingCred;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Token {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("http://localhost:4005/token/635e56ee22aed732088a53d4");
		
		System.out.println(obj.getTitle());
		//obj.quit();
	}

}
