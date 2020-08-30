package Alert1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Alert2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\omero\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("http://demo.automationtesting.in/Alerts.html");

//todo                      Basit Uyarı
        driver.findElement(By.cssSelector(".btn.btn-danger")).click();
        Thread.sleep(2000);

        String message1 = driver.switchTo().alert().getText();
        System.out.println(message1);
        Thread.sleep(1000);
        driver.switchTo().alert().accept();


//todo                     Teyit uyarıları


        driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();


        driver.findElement(By.cssSelector(".btn.btn-primary")).click();


        Thread.sleep(1500);

        driver.switchTo().alert().dismiss();





//todo             input bekleyen uyarılar
        driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();


        driver.findElement(By.cssSelector(".btn.btn-info")).click();

        Thread.sleep(1500);

        driver.switchTo().alert().sendKeys("Ömer");
        Thread.sleep(1500);

        driver.switchTo().alert().accept();


        String message = driver.findElement(By.cssSelector("#Textbox>p")).getText();


        System.out.println("Mesajım :   " + message);

    }
}
