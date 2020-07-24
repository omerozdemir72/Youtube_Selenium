package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1_name {

    public static void main(String[] args) throws InterruptedException {

/*
                                  Locators - Konumlandırıcılar
 name
 Class name
ID
Link Text
Partial Link Text
CSS Selector
Xpath


 */
        System.setProperty("webdriver.chrome.driver","C:/Users/omero/Selenium/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();


        driver.findElement(By.name("q")).sendKeys("Java");

        Thread.sleep(1000);

        driver.findElement(By.className("gNO89b")).click();


    }
}
