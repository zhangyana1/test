package HelperPage;

import org.apache.log4j.Logger;
import page.PageHome;
import page.PageLogin;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/8.
 */
public class HelperPageLogin {
    public static Logger logger=Logger.getLogger("HelperPage");

    //输入用户名
    public static void clickUsername(SeleniumUtil seleniumUtil, String username){
        seleniumUtil.sendKeys(PageLogin.LOGIN_ENTER_USER,username);
    }

    //输入密码
    public static void clickPassword(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.sendKeys(PageLogin.LOGIN_ENTER_PASSWORD,password);
    }

    //点击登录
    public static void clickLogin(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LOGIN_SUBMIT_LOGIN);
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //输入信息并登录
    public static void clickLoginSubmit(SeleniumUtil seleniumUtil,String username,String password){
        clickUsername(seleniumUtil,username);
        clickPassword(seleniumUtil,password);
        clickLogin(seleniumUtil);
    }

    //用户退出
    public static void exit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageHome.EXIT_CLICK);
    }
}
