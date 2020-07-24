package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class actionClass {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\omero\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();



        driver.manage().window().maximize();


        driver.get("https://www.etsy.com/");


        WebElement cookies = driver.findElement(By.cssSelector(".wt-btn.wt-btn--secondary.wt-width-full"));

        cookies.click();


        driver.findElement(By.xpath("//span[@class='wt-display-inline-block wt-vertical-align-middle']")).click();
        WebElement sprache = driver.findElement(By.xpath("//select[@name='language_code']"));

        Select slc = new Select(sprache);

        slc.selectByValue("en-US");

        driver.findElement(By.cssSelector("#locale-overlay-save")).click();


        Actions action = new Actions(driver);

        List<WebElement> menubars = driver.findElements(By.xpath("//ul[@role='menubar']//li"));


        for (WebElement menubar:menubars) {

            action.moveToElement(menubar).perform();

            Thread.sleep(2000);
        }

    }
}
