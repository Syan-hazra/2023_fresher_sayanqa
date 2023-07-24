package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class basetest {

static WebDriver driver;
public static ExtentReports extent;
public static ExtentTest extenttest;

static File file = new File("./resources/config.properties");
static FileInputStream fis = null;
static Properties prop = new Properties();



static {



try {
fis = new FileInputStream(file);
} catch (FileNotFoundException e) {
e.printStackTrace();
}



try {
prop.load(fis);
} catch (IOException e) {



e.printStackTrace();
}
}
@BeforeSuite
public void setExtent() {
	extent = new ExtentReports("./Repositories/ExtentReports.html");
}

@AfterSuite
public void EndReport() {
	extent.flush();
	extent.close();
}

@BeforeSuite
public static void initializeWebdriver() {
// Set the path for chromeDriver
System.setProperty(prop.getProperty("chromedriverproperty"), prop.getProperty("chromedriverpath"));
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
}

@BeforeSuite
public static void openBrowser() {



driver.get(prop.getProperty("url"));
}



@AfterSuite
public static void closeBrowser() {
driver.close();



}

}


