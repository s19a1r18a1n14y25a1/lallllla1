package  redbusredpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lalallalla {
	public static WebDriver driver;
@BeforeTest

private void start() {
	  WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.get("https://demo.automationtesting.in/");
      driver.manage().window().maximize();
}
	
}
