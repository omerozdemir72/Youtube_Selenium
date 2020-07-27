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

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.automationtesting.in/Alerts.html");



        driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();

        driver.findElement(By.cssSelector(".btn.btn-danger")).click();

        Thread.sleep(1500);

        driver.switchTo().alert().accept();


        driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();


        driver.findElement(By.cssSelector(".btn.btn-primary")).click();

        Thread.sleep(1500);


        driver.switchTo().alert().dismiss();



        driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();


        driver.findElement(By.cssSelector(".btn.btn-info")).click();

        driver.switchTo().alert().sendKeys("Selenium Türkçe");

        Thread.sleep(1500);

        driver.switchTo().alert().accept();

        String message = driver.findElement(By.cssSelector("#demo1")).getText();


        System.out.println(message);

        Assert.assertEquals("Hello Selenium Türkçe How are you today",driver.findElement(By.cssSelector("#demo1")).getText());

        System.out.println("Çalışıyor...");
    }
}
