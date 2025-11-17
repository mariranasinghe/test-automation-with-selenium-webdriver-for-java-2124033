package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class Main {

  static protected WebDriver driver; // chrome driver executable

  static {
    chromedriver().setup(); // download and configure the browser
    var options = new ChromeOptions(); // instantiate class called ChromeOptions to help in customing the behavior of
                                       // the browser when executing the scripts
    options.addArguments("--no-sandbox"); // we must set no-sandbox option since we are using a codespace container

    // initialize webdriver object with chrome driver class and pass in our options
    // This opens a new chrome brower configured with the options we specified
    driver = new ChromeDriver(options);
  }

  public static void main(String[] args) {
    // navigate to any webpage
    driver.get("https://www.selenium.dev/selenium/web/formPage.html");

    WebElement emailTextbox = driver.findElement(By.id("email"));

    System.out.println(emailTextbox);

    // close browser
    driver.quit();
  }
}