package browsercontrol;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utilities.ConstantUtils;

public class WebConnector {
    public static WebDriver driver;


    /**
     * Method to open and maximise browser
     */
    public static void openBrowser(){

        if(ConstantUtils.BROWSER_NAME.equalsIgnoreCase("firefox")){

            FirefoxOptions fo= new FirefoxOptions();
            fo.addArguments("start-maximised");
            if(ConstantUtils.BROWSER_TYPE.equalsIgnoreCase("headless")){
                fo.addArguments(("--headless"));
            }
            driver =new FirefoxDriver(fo);
        } else {
            ChromeOptions co = new ChromeOptions();
            co.addArguments("start-maximised");
            if (ConstantUtils.BROWSER_TYPE.equalsIgnoreCase("headless")) {
                co.addArguments("--headless");
            }
            driver = new ChromeDriver(co);
        }

//        driver = new ChromeDriver();
//        driver.manage().window().maximize();

//        if using implicit wait it has to be defined here
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    /**
     * Method to close the browser
     */
    public static void closeBrowser(){
        driver.quit();
    }

}


