package page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/5/8.
 */
public class PageManageHeart {
    //管理中心-论坛
    public final static By MANAGEHEART_FORUM=By.linkText("论坛");

    //输入密码
    public final static By PASSWORD=By.name("admin_password");

    //提交
    public final static By  SUBMIT=By.name("submit");

    //创建新版块
    public final static By CREAT_NEW_PART=By.linkText("添加新版块");

    //版块名称
    public final static By NEW_PART_NAME=By.name("newforum[1][]");

    //创建新版块-提交
    public final static By NEW_PART_SUBMIT=By.id("submit_editsubmit");

    //进入新版块
    public final static By ENTER_NEW_PART=By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[2]/td[2]/h2/a");

    /*Discuz论坛实战-3（测试用例）*/
    //帖子搜索输入框
    public final static By SEARCH=By.id("scbar_txt");


}
