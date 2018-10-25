package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
   WebDriver driver = new FirefoxDriver();
   driver.manage().window().maximize();
   System.out.println(driver);
   driver.navigate().to("http://demo.guru99.com/selenium/deprecated.html");
   driver.switchTo().frame(1).findElement(By.linkText("Action")).click();
  driver.switchTo().defaultContent();
   driver.switchTo().frame(2).findElement(By.linkText("Deprecated")).click();
   driver.close();
   }
}

