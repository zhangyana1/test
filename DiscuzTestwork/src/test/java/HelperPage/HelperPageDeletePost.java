package HelperPage;

import page.PagePostRespose;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/9.
 */
public class HelperPageDeletePost {



    //点击删除标题
    public static void clickdeletePosttitle (SeleniumUtil seleniumUtil){
       seleniumUtil.click(PagePostRespose.DELETE_POST_TITLE);
    }

    //点击确定
    public static void clickdeletePostyes (SeleniumUtil seleniumUtil){
        seleniumUtil.click(PagePostRespose.DELETE_POST_YES);
    }

    //删除帖子
    public static void deletePost(SeleniumUtil seleniumUtil){
        HelperPageHome.clickDefaultPart(seleniumUtil);
        HelperPagePostRespose.clickNewPost(seleniumUtil);
        clickdeletePosttitle(seleniumUtil);
        clickdeletePostyes(seleniumUtil);
    }
}
