package pageobjects;

import browsercontrol.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Basepage extends WebConnector {
    public static WebElement findElementByXpath(int Time, String Xpath){
        return new WebDriverWait(driver, Duration.ofSeconds(Time)).until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath)));
    }
}
