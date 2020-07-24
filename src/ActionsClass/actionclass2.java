package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\omero\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();


        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");



        //Başkentler

        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement washington = driver.findElement(By.id("box3"));
        WebElement copenhagen = driver.findElement(By.id("box4"));
        WebElement madrid = driver.findElement(By.id("box7"));
        WebElement stockholm = driver.findElement(By.id("box2"));
        WebElement rome = driver.findElement(By.id("box6"));
        WebElement seoul = driver.findElement(By.id("box5"));




        //Ülkeler

        WebElement italy = driver.findElement(By.id("box106"));
        WebElement spain = driver.findElement(By.id("box107"));
        WebElement  norway= driver.findElement(By.id("box101"));
        WebElement  denmark= driver.findElement(By.id("box104"));
        WebElement  southKorea= driver.findElement(By.id("box105"));
        WebElement  sweden= driver.findElement(By.id("box102"));
        WebElement  UnitedStates= driver.findElement(By.id("box103"));


        Actions actions = new Actions(driver);


        actions.dragAndDrop(rome,italy).build().perform();
        actions.dragAndDrop(seoul,southKorea).build().perform();
        actions.dragAndDrop(stockholm,sweden).build().perform();
        actions.dragAndDrop(oslo,norway).build().perform();
        actions.dragAndDrop(madrid,spain).build().perform();
        actions.dragAndDrop(copenhagen,denmark).build().perform();
        actions.dragAndDrop(washington,UnitedStates).build().perform();



























    }
}
