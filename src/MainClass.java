import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MainClass {

    public static void main(String[] args) throws InterruptedException {

//        int i = 1;
//        do{
//            System.out.println("Vrushabh Chimankar");
//            i++;
//
//        }while(i<=10);

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.close();

    }
}