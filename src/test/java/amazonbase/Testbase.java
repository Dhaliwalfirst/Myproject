package amazonbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testbase {
	
	public static Properties prop = new Properties();
	public static WebDriver driver;
	
	public Testbase() {
		
		try {
		
FileInputStream file= new FileInputStream("C:\\Users\\prabh\\eclipse-workspace\\TDDFRAMEWORK\\src\\test\\java\\environmentvariables\\Config.properties");
	prop.load(file);
		}
	        catch(FileNotFoundException e) {
			e.printStackTrace();
			}
			catch(IOException a) {
			a.printStackTrace();
			}
	}
	
	public static void initiation() {
		String browsername =prop.getProperty("browser");
		
		if (browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver = new ChromeDriver();
		}	
				else if (browsername.equals("Firefox")) {
					System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
					driver = new FirefoxDriver();
				}
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(220,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(prop.getProperty("url"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(220));
	
	
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	


