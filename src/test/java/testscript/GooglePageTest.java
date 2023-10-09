package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
}
}
