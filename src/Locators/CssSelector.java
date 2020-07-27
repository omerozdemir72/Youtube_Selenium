package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {

    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver", "C:\\Users\\omero\\Selenium\\geckodriver.exe");



        WebDriver driver = new FirefoxDriver();




        driver.manage().window().maximize();

        driver.get("http://www.google.com");






        //todo   CHİLD BULARAK  ve basit hali


      //input[class=gNO89b]

        //          html > body > div> style
        //html>body>div>div

        /*todo      #id

    Başına # koyarız.
    Ya da    div[id=footer]
    #footer

    div#footer
div[id=footer]
*/



/*    todo  CLASS


        .RNmpXc
        input[class=RNmpXc]
input.gLFyf.gsfi
Birden fazla class var ise aralarına nokta koyuyoruz.



todo   CONTAİNS



input[id*='user']
input[id*='name']



input[class*=gLFyf]

input[class*=gLF]
maxlength text kısmı
input[maxlength*='4']


todo Starting the text ve Child mantıgı

div[class^='R']
input[maxlength^='207']

div#searchform.jhp.big>nth-child(1)

div.sfbg>:first-child
div.J9leP>:nth-child(1)
div#searchform>:nth-child(3)
div#tophf>:nth-child(2)


todo     ending with
 $

input[id$='name']


id = Search form
div[id$='form']

div[id$=b]

todo nth-of-type , first-of-type



ul.erkvQe>li:first-of-type

ul.erkvQe>li:last-of-type
ul.erkvQe>li:nth-of-type(2)

ul.erkvQe>:last-of-type

         */

    }
}
