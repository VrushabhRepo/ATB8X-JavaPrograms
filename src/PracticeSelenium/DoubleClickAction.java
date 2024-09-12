package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
       WebElement doubleClick =  driver.findElement(By.id("doubleClickBtn"));

       //Using action class for double click
        Actions action = new Actions(driver);
        action.doubleClick(doubleClick).build().perform();
    }
}
