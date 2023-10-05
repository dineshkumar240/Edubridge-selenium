package seliium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class seldk {
	public static void main(String[] args) throws InterruptedException{
		 
		 
		 System.setProperty("webdriver.chrome.driver","C:/Users/Dinesh/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		 WebDriver dk=new ChromeDriver();
		 dk.get("https://www.amazon.in/");
		 Thread.sleep(4000);
		 dk.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
		 dk.findElement(By.id("nav-search-submit-button")).click(); 
		 dk.navigate().to("https://www.linkedin.com/feed/");
		 String name=dk.getCurrentUrl();
		 System.out.println(name);
         dk.navigate().back();
		 dk.navigate().forward();
		 dk.navigate().refresh();
		 dk.close();
		
	}
}