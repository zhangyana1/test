package page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/5/8.
 */
public class PageLogin {
    /*Discuz论坛实战-1*/
    //用户名
    public final static By LOGIN_ENTER_USER=By.id("ls_username");

    //密码
    public final static By LOGIN_ENTER_PASSWORD=By.id("ls_password");

    //登录
    public final static By LOGIN_SUBMIT_LOGIN=By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[3]/button");


}
