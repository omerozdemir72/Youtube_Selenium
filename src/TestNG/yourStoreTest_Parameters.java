package TestNG;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class yourStoreTest_Parameters {
    WebDriver driver;

    @Test
    @Parameters({"firstname","lastname","email","telephone","password"})
    public void Test1(String firstname,String lastname,String email,String telephone,String password){

        System.setProperty("webdriver.chrome.driver", "C:/Users/omero/Selenium/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");


    driver.findElement(By.cssSelector("#input-firstname")).sendKeys(firstname); //ömer

    driver.findElement(By.cssSelector("#input-lastname")).sendKeys(lastname);

    driver.findElement(By.cssSelector("#input-email")).sendKeys(email);

    driver.findElement(By.cssSelector("#input-telephone")).sendKeys(telephone);

    driver.findElement(By.cssSelector("#input-password")).sendKeys(password);

    driver.findElement(By.cssSelector("#input-confirm")).sendKeys(password);
//aasss
    }

    @AfterClass
    public void AfterClass() throws InterruptedException {

        Thread.sleep(1500);

        driver.quit();
    }
}
