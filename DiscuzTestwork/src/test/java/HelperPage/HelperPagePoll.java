package HelperPage;

import page.PagePoll;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/8.
 */
public class HelperPagePoll {
    //发起投票-按钮
    public static void pollPage (SeleniumUtil seleniumUtil, String text){
        seleniumUtil.click(PagePoll.POLL);
    }

    //发表投票帖子
    public static void newPartSubmit(SeleniumUtil seleniumUtil, String text){
       seleniumUtil.sendKeys(PagePoll.POLL_CONTENT,text);
        seleniumUtil.click(PagePoll.POLL_SUBMIT);
//        seleniumUtil.sendKeys(PagePoll.);

    }


}
