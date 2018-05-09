package page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/5/8.
 */
public class PagePoll {

    //

    //发起投票页面
    public final static By POLL=By.linkText("发起投票");

    //发表投票帖子
    public final static By POST_SUBMIT=By.id("newspecialtmp");

    //发起投票-title
    public final static By POLL_TITLE=By.id("subject");

    //发起投票-potion1
    public final static By POLL_OPTION1=By.xpath("//*[@id=\"pollm_c_1\"]/p[1]/input");

    //发起投票-potion2
    public final static By POLL_OPTION2=By.xpath("//*[@id=\"pollm_c_1\"]/p[2]/input");

    //发起投票-内容
    public final static By POLL_CONTENT=By.xpath("/html/body");

    //点击发表投票
    public final static By POLL_SUBMIT=By.id("postsubmit");

    //投票各个选项的名称
    public final static By POLL_OPTION_NAMES=By.className("pvt");

    //投票比例
    public final static By POLL_PERCENT=By.className("pbg");

    //投票的主题名称
    public final static By POLL_TITLENAME=By.id("postmessage_5");
}
