package util;

import org.apache.bcel.verifier.exc.AssertionViolatedException;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

/**
 * Created by Administrator on 2018/5/7.
 */
public class SeleniumUtil {
    public Logger logger=Logger.getLogger("Selenium.class");
    public WebDriver webDriver=null;

    //获取驱动
    public WebDriver getWebDriver(String drivertype){
        if (drivertype.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver.exe");
            webDriver=new ChromeDriver();
            logger.info("加载谷歌驱动");
        }else if (drivertype.equalsIgnoreCase("firefox")){
            webDriver=new FirefoxDriver();
            logger.info("加载火狐驱动");
        }else{
            logger.error("不识别的浏览器");
        }
        return webDriver;
    }

    //获取定位元素
    public String getLocationElenment(WebElement element, String excepted){
        String text=element.toString();
        String excep=null;
        try {
            excep=text.substring(text.indexOf(text),text.length()-1);
        }catch (Exception e){
            e.printStackTrace();
            logger.info("找不到该定位元素："+excepted);
        }
        return excep;
    }

    //打开网址
    public void getUrl(String url){
        webDriver.get(url);
        logger.info("打开网址："+url);
    }

    //识别一个元素
    public WebElement findElement(By by){
        WebElement element=null;
        try {
            element=webDriver.findElement(by);
            logger.info("查找到相应元素："+getLocationElenment(element,">"));
        }catch (NoSuchElementException e){
            e.printStackTrace();
            logger.error("找不到相应的元素");
        }
        return element;
    }

    //识别一组元素
    public List<WebElement> findElements(By by){
        List<WebElement> elementList=null;
        elementList=webDriver.findElements(by);
        logger.info("查找到一组相应的元素：");
        return elementList;
    }

    //点击操作
    public void click(By by){
        WebElement element=webDriver.findElement(by);
        element.click();
        logger.info("对元素"+getLocationElenment(element,">")+"执行点击操作");
    }

    //清除操作
    public void clear(By by){
        WebElement element=webDriver.findElement(by);
        element.clear();
        logger.info("清除元素内容："+element.getText());
    }

    //切换frame
    public void skipFrame(String name){
        webDriver.switchTo().frame(name);
    }



    //文本框输入数据
    public void sendKeys(By by,String text){
        WebElement element=webDriver.findElement(by);
        element.sendKeys(text);
        logger.info("在元素"+getLocationElenment(element,">")+"上输入内容：" + text);
    }

    //获取元素内容
    public String getText(By by){
        WebElement element=webDriver.findElement(by);
        String text=element.getText();
        logger.info("获取元素内容,元素的内容是："+text);
        return text;
    }

    //检验元素是否存在
    public boolean isExsist(By by){
        WebElement element=null;
        try {
            element=webDriver.findElement(by);
        }catch (NoSuchElementException e){
            e.printStackTrace();
            logger.error("查找的元素不存在");
            return false;
        }
        logger.info("查找的元素存在");
        return true;
    }

    //判断当前页面是否与预期页面一致
    public void assertPage(String  title){
        String actual=webDriver.getTitle();
        try {
            Assert.assertEquals(actual,title);
        }catch (AssertionError e){
            Assert.fail("预期的title是：["+title+"],实际找到的title是：["+actual+"]");
            logger.error("预期的title是：["+title+"],实际找到的title是：["+actual+"]");
        }
        logger.info("找到了对应的title：["+title+"],当前页面正确");
    }

    //判断获得的文本与预期文本是否一致
    public void assertText(By by,String excepttext){
        String actual=getText(by);
        try {
            Assert.assertEquals(actual,excepttext);
        }catch (AssertionError e){
            Assert.fail("预期的文本是：["+excepttext+"],实际获得的文本是：["+actual+"]");
            logger.error("预期的文本是：["+excepttext+"],实际获得的文本是：["+actual+"]");
        }
        logger.info("找到了期望的文本："+excepttext);
    }

//    public void waitForElementLoad(String element){
//        logger.info("开始查找元素："+element);
//        final String uiauText = "new UiSelector().text(\""+element+"\")";
//
//        try{
//            WebDriverWait wait = new WebDriverWait(webDriver, 10, 1000);
//            wait.until(new ExpectedCondition<Boolean>() {
//
//                public Boolean apply(WebDriver driver) {
//                    WebElement ele = ((WebDriver<WebElement>) driver).findElementByAndroidUIAutomator(uiauText);
//                    return ele.isDisplayed();
//                }
//            });
//        } catch (UrlChecker.TimeoutException e){
//            logger.error("超时!! " + "10" + " 秒之后还没找到元素 [" + element + "]");
//            Assert.fail("超时!! " + "10" + " 秒之后还没找到元素 [" + element + "]");
//        }
//        logger.info("找到了元素 [" + element + "]");
//    }

    //切换句柄
    public void exchangeHandle(){
        String homeHandle = webDriver.getWindowHandle();
        for (String newHandle:webDriver.getWindowHandles()){
            if (newHandle.equals(homeHandle)){
                continue;
            }
            webDriver.switchTo().window(newHandle);
            break;
        }
    }

    /
}
