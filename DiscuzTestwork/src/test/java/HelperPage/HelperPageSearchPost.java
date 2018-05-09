package HelperPage;

import page.PageHome;
import page.PageLogin;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/8.
 */
public class HelperPageSearchPost {

    //帖子搜索
    public static void searchPost(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.sendKeys(PageHome.SEARCH_KW_CLICK,text);
        seleniumUtil.click(PageHome.SEARCH_CLICK);
    }

}
