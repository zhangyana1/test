package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

/**
 * Created by Administrator on 2018/5/7.
 */
public class utils {
    public static WebDriver webDriver=null;
//    public static void windowMax(WebDriver webDriver){
//        webDriver.manage().window().maximize();
//    }
//    public static WebElement element;

//    public static void skipWindow(By by){
////        //句柄
////        element=webDriver.findElement(by);
////        element.click();
////
////        //跳转到了新窗口
//
//        //获取所有的窗口
//        Set<String> windowsHandles=webDriver.getWindowHandles();
//        for (String hadle:windowsHandles
//                ) {
//            //让驱动找对应的窗口
//            webDriver.switchTo().window(hadle);
////            System.out.println("获取到的每一个句柄");
//        }
//
//        WebElement element1=webDriver.findElement(by);
//        element1.click();
//
//    }

        public static void exchangeHandle(){
            String homeHandle = webDriver.getWindowHandle();
            for (String newHandle:webDriver.getWindowHandles()){
                if (newHandle.equals(homeHandle)){
                    continue;
                }
                webDriver.switchTo().window(newHandle);
                break;
            }
        }

}
