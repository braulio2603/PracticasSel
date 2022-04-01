package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String exePath = "./GoogleChrome/chromedriver.exe"; //especificar la ruta del ChromeDriver
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://www.google.com");

	}

}
