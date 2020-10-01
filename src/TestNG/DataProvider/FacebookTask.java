package TestNG.DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookTask {
    WebDriver driver;

@DataProvider
public Object[][] facedata(){

    Object [][] facebookData= new Object[2][2];

    facebookData[0][0] = "technoStudy@gmail.com";
    facebookData[0][1] ="technoStudy123";

    facebookData[1][0] = "omer@gmail.com";

    facebookData[1][1] = "omer123";

    return facebookData;

}



    @Test(dataProvider = "facedata")
    public void Test1(String email,String password) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/omero/Selenium/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");


        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);

        Thread.sleep(2000);

        driver.quit();
    }



}
