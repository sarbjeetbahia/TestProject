import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver");	
	
		System.out.println("Hello");	
		
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		
		
	}

}
