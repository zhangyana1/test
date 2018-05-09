package testcase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.BrowserConfiguration;
import util.LogConfiguration;
import util.SeleniumUtil;
import util.utils;

import java.io.IOException;

/**
 * Created by Administrator on 2018/5/8.
 */
public class BasicTestCase  {
    private Logger logger=Logger.getLogger("BasicTestCase.class");
    public SeleniumUtil seleniumUtil;;
    public WebDriver webDriver;
    BrowserConfiguration properties=null;
    @BeforeMethod
    public void set_Up() throws IOException {
        LogConfiguration.initLog("BasicTestCase");
        seleniumUtil=new SeleniumUtil();
        properties=new BrowserConfiguration();
        String dType=properties.browserName;
        webDriver=seleniumUtil.getWebDriver(dType);
        String URL=properties.serverURL;
        seleniumUtil.getUrl(URL);
    }

    @AfterMethod
    public void tearDown(){
//        webDriver.quit();
    }
}
