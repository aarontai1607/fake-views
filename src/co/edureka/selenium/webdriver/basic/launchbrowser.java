package co.edureka.selenium.webdriver.basic;

import java.awt.Desktop.Action;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.*;

public class launchbrowser {

	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		//https://www.facebook.com/100012145503393/videos/992229814525193/?id=100012145503393
		String LIVE_STREAM_LINK = "https://www.facebook.com/100012145503393/videos/992229814525193/?v=100012145503393";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aaron\\Documents\\jayeson_solutions\\feed_workspace\\SeleniumJava\\driver\\chromedriver.exe");
		
		//Create a map to store  preferences 
		Map<String, Object> prefs = new HashMap<String, Object>();

		//add key and value to map as follow to switch off browser notification
		//Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);

		//Create an instance of ChromeOptions 
		ChromeOptions options = new ChromeOptions();

		// set ExperimentalOption - prefs 
		options.setExperimentalOption("prefs", prefs);

		//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement Login = driver.findElement(By.id("u_0_b"));
		WebElement PlayVideo = driver.findElement(By.id("u_0_k"));
		username.sendKeys("immanueljbmalaysia@gmail.com");
		password.sendKeys("Immanuel777");
		
		Login.click();
		Thread.sleep(2000);
		driver.navigate().to(LIVE_STREAM_LINK);
//		PlayVideo.click();
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//
		// driver.navigate().to("https://amazon.in");
		// driver.manage().window().maximize();
		// String title = driver.getTitle();
		//
		// if(title.equalsIgnoreCase("Amazon.in"))
		// System.out.println("Title matches");
		// else
		// System.out.println(title);
		//
		// String tagname = " ";
		// tagname = driver.findElement(By.cssSelector("#nav-link-shopall >
		// span.nav-line-2")).getText();
		// System.out.println(tagname);
		//
		// WebElement category =
		// driver.findElement(By.cssSelector("#nav-link-shopall >
		// span.nav-line-2 > span"));
		// Actions action = new Actions(driver);
		// action.moveToElement(category).perform();
		// Thread.sleep(2000);
		//
		// WebElement books =
		// driver.findElement(By.cssSelector("#nav-flyout-shopall > div.nav-te >
		// span"));
		// action.moveToElement(books).perform();
		// action.click();
		// Thread.sleep(3000);
		//
		// driver.findElement(By.linkText("Fiction Books")).click();
		// Thread.sleep(2000);
		//
		// WebElement
		// myElement=driver.findElement(By.id("twotabsearchtextbox"));
		// myElement.sendKeys("John Grisham");
		// driver.findElement(By.className("nav-input")).click();
		// Thread.sleep(2000);
		//
		// driver.findElement(By.partialLinkText("Firm")).click();
		// Thread.sleep(2000);
		//
		// java.util.Set<String> handles = driver.getWindowHandles();
		// String winHandle1 = driver.getWindowHandle();
		// handles.remove(winHandle1);
		//
		// String winHandle = handles.iterator().next();
		// String winHandle2 = " ";
		// if(winHandle != winHandle1){
		// winHandle2 = winHandle;
		// driver.switchTo().window(winHandle2);
		// System.out.println(winHandle2);
		// }
		// Thread.sleep(2000);
		//
		// driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		// Thread.sleep(5000);
		//
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		// Thread.sleep(3000);
		//
		// driver.get("http://demo.automationtesting.in/Frames.html");
		// WebElement frame =
		// driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		// driver.switchTo().frame(frame);
		// Thread.sleep(2000);
		//
		// WebElement textbox =
		// driver.findElement(By.xpath("//input[@type='text']"));
		// textbox.sendKeys("hey");
		// Thread.sleep(3000);
		//
		// driver.close();
		// driver.quit();

	}
}
