package page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/5/8.
 */
public class PageHome {
    //默认板块
    public final static By HOMEPAGE_DEFAULTPART=By.linkText("默认版块");

    //新版块
    //*[@id="category_1"]/table/tbody/tr[2]/td[2]/h2/a
    public final static By HOMEPAGE_NEW_DEFAULTPART=By.xpath("*[@id=\"category_1\"]/table/tbody/tr[2]/td[2]/h2/a");

    //管理中心
    public final static By MANAGEHEART_CLICK=By.linkText("管理中心");

    //用户退出
    public final static By EXIT_CLICK=By.linkText("退出");

    //发帖-输入帖子标题
    public final static By HOMEPAGE_POST_TITLE=By.id("subject");

    //发帖-输入帖子内容
    public final static By HOMEPAGE_POST_CONTENT=By.name("message");

    //发帖
    public final static By HOMEPAGE_POST_SUBMIT=By.id("fastpostsubmit");

    //搜索框
    public final static By SEARCH_KW_CLICK=By.id("scbar_txt");

    //搜索点击
    public final static By SEARCH_CLICK=By.id("scbar_btn");
}
