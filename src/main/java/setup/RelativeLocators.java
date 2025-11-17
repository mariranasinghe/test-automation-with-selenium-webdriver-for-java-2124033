package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators extends Main {
  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/formPage.html");

    WebElement bottomBtn = driver.findElement(
        RelativeLocator.with(By.name("Submit")).below(By.id("submit"))

    );

    driver.quit();
  }
}
