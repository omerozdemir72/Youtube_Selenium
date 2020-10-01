package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class myStoreTest {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js ;


    @BeforeClass
    @Parameters({"browser"})
    public void Setup(String browser){
        if (browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:/Users/omero/Selenium/ChromeDriver/chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\omero\\Selenium\\geckodriver.exe");
            driver= new FirefoxDriver();
        }

        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void Test1() throws InterruptedException {

        Actions actions = new Actions(driver);

        List<WebElement> menuBar = driver.findElements(By.cssSelector(".sf-menu>li"));

        actions.moveToElement(menuBar.get(0)).perform();

        WebElement casualDresses= driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));

        wait.until(ExpectedConditions.visibilityOf(casualDresses));

        casualDresses.click();

        driver.findElement(By.cssSelector(".icon-th-list")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector(".button.lnk_view ")).click();

        Thread.sleep(1000);
     //   js.executeScript("window.scrollBy(0,300)");

        List<WebElement>images = driver.findElements(By.cssSelector("#thumbs_list_frame>li"));

        for (int i = 0; i <images.size() ; i++) {
            actions.moveToElement(images.get(i)).perform();
            Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("#wishlist_button")).click();


        WebElement loginMessage = driver.findElement(By.xpath("//p[text()='You must be logged in to manage your wishlist.']"));

        wait.until(ExpectedConditions.visibilityOf(loginMessage));

        Assert.assertEquals(loginMessage.getText(),"You must be logged in to manage your wishlist.");

        System.out.println(loginMessage.getText());
    }



    @AfterClass
    public void AfterClass() throws InterruptedException {


        Thread.sleep(2000);

        driver.quit();
    }}
