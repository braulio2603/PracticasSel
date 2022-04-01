package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSel {
  @Test
  public void Selenium_Test01() {
	  
	  String exePath = "./GoogleChrome/chromedriver.exe"; //especificar la ruta del ChromeDriver
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.google.com");
  }
}
