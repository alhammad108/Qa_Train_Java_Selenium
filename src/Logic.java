import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logic {

	public static void main(String[] args) {

		System.setProperty("webdriver,chrome.driver", "C:\\webdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5500/index.html");
		List<WebElement> MyOptions = driver.findElements(By.tagName("option"));
		for (int i = 0; i < MyOptions.size(); i++) {
			if (i % 2 == 0) {

				MyOptions.get(i).click();
				System.err.println("I Will Remove Of The Name :"+MyOptions.get(i).getText());
				driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();

			}
			else {
				System.out.println("I will keep Of The Name : "+MyOptions.get(i).getText());
			}
		}

	}

}
