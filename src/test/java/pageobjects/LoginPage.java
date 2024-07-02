package pageobjects;

import browsercontrol.WebConnector;

public class LoginPage extends WebConnector {
 private static String usernameXpath ="//input[@id='user-name']";
 private static String passwordXpath ="//input[@id='password']";
 private static String loginXpath ="//input[@type='submit']";

 public static void setUsername(String UserName){
  Basepage.findElementByXpath(10,usernameXpath).clear();
  Basepage.findElementByXpath(10,usernameXpath).sendKeys(UserName);
 }
 public static void setPassword(String PassWord){
  Basepage.findElementByXpath(10,passwordXpath).clear();
  Basepage.findElementByXpath(10,passwordXpath).sendKeys(PassWord);
 }
 public static void clickloginbutton()
 {
  Basepage.findElementByXpath(10,loginXpath).click();
 }

}
