package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	
	public void init() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
	}
	
	public void getUrl() {
		driver.get("https://techfios.com/billing/?ng=admin/");
	}
	
	public void tearDown() {
		driver.close();
		driver.quit();
		
	}
	public int randomNumber(int range) {
		Random rn= new Random();
		return rn.nextInt(range);
	}
	
	public void takeScreenShot() throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		
		String currentDirectory = System.getProperty("user.dir");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM_dd_YYYY.mm_ss");
		String label=sdf.format(date);
		
		FileUtils.copyFile(source, new File(currentDirectory+"/Screenshot/"+label+".png"));
		
		
		
		
	}
	
	
	
}

