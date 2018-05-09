package page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/5/8.
 */
public class PagePostRespose {
    //回帖-输入内容
    public final static By HOMEPAGE_POSTRESPOSE_CONTENT=By.id("fastpostmessage");

    //回帖-发表回复
    public final static By HOMEPAGE_POSTRESPOSE_SUBMIT=By.id("fastpostsubmit");
    /*Discuz论坛实战-2*/
    //删除帖子
    public final static By DELETE_POST_TITLE=By.linkText("删除主题");

    //删除帖子-确定
    public final static By DELETE_POST_YES=By.name("modsubmit");
}
