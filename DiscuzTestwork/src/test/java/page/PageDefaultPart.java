package page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/5/8.
 */
public class PageDefaultPart {
    //发帖-输入帖子标题
    public final static By HOMEPAGE_POST_TITLE=By.id("subject");

    //发帖-输入帖子内容
    public final static By HOMEPAGE_POST_CONTENT=By.name("message");

    //发帖
    public final static By HOMEPAGE_POST_SUBMIT=By.id("fastpostsubmit");

    //打开帖子
    public final static By HOMEPAGE_POSTRESPOSE_CLICK=By.className("xst");
}
