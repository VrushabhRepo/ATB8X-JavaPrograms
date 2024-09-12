package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Count_Hyperlinks {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net");
        driver.manage().window().maximize();

        //To count the links we use <a tag for this use list from java
        List<WebElement> TotalLinks = driver.findElements(By.tagName("a"));

        System.out.println("No of links: " + TotalLinks.size());
        //use for each loop to count links and print them
        for(WebElement Links : TotalLinks){

            System.out.println(Links.getText());
        }
        driver.close();


    }
}
