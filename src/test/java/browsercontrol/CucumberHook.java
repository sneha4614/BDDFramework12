package browsercontrol;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHook extends WebConnector{

    @Before
    public void setup(){
        openBrowser();
    }

    @After
    public void teardown(){
        closeBrowser();
    }

}
