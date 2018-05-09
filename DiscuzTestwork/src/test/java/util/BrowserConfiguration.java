package util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2018/5/8.
 */
public class BrowserConfiguration {

    public static Logger logger=Logger.getLogger("BrowserConfiguration.class");
//    public static WebDriver webDriver;
    public static String browserName;
    public static String serverURL;

    public static void ReadProperties() throws IOException{
        Properties p = new Properties();
        //加载配置文件
        InputStream ips =new FileInputStream("./Browser.properties");
        p.load(ips);
        browserName = p.getProperty("browserName");
        serverURL = p.getProperty("URL");

    }

    static{
        try{
            BrowserConfiguration.ReadProperties();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException  {
        System.out.println(BrowserConfiguration.browserName);
    }


//
//    public static WebDriver getBrowser(){
//        try{
//            Properties p = new Properties();
//            String filePath = "./Browser.properties";
//            InputStream ips =new FileInputStream(filePath);
//            p.load(ips);
//            browserName = p.getProperty("browserName");
//            serverURL = p.getProperty("URL");
//            ips.close();
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }
//        if (browserName.equalsIgnoreCase("Chrome")){
//            System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver.exe");
//            logger.info("加载谷歌驱动");
//            webDriver = new ChromeDriver();
//        }else if (browserName.equalsIgnoreCase("firefox")){
//            System.setProperty("webdriver.gecko.driver","D:\\software\\firefoxdriver.exe");
//            logger.info("加载火狐驱动");
//            webDriver = new FirefoxDriver();
//        }else{
//            System.setProperty("webdriver.ie.driver", "D:\\software\\IEDriverServer.exe");
//            logger.error("不识别的浏览器");
//            webDriver = new FirefoxDriver();
//        }
//
//
//
//        webDriver.get(serverURL);
//        logger.info("打开网址："+serverURL);
//        webDriver.manage().window().maximize();
//        return webDriver;
//    }






}
