import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaClass {
	
	public static void main(String[] args) {
		//System.out.print("Hello");
		
		System.setProperty("webdriver.chrome.driver", "/Users/sarbjeetbahia/Desktop/Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yahoo.com/");
		
		System.out.println("git test")
		
		System.out.println("branching test")
		System.out.println("Branching")
		System.out.println("Creating PR request for now")

		
	}

}
