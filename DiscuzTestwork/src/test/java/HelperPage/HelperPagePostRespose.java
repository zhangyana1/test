package HelperPage;

import page.PageDefaultPart;
import page.PagePostRespose;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/8.
 */
public class HelperPagePostRespose {
    //回帖-点击一篇帖子
    public static void clickNewPost(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageDefaultPart.HOMEPAGE_POSTRESPOSE_CLICK);
    }

    //回帖-输入内容
    public static void sendkeysContent(SeleniumUtil seleniumUtil,String content){
        seleniumUtil.sendKeys(PagePostRespose.HOMEPAGE_POSTRESPOSE_CONTENT,content);
    }

    //回帖-提交帖子
    public static void postRespose_Submit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PagePostRespose.HOMEPAGE_POSTRESPOSE_SUBMIT);
    }

    //回帖
    public static void post_Respose(SeleniumUtil seleniumUtil,String content){
//        HelperPage.clickLoginSubmit(seleniumUtil,username,password);
        HelperPageHome.clickDefaultPart(seleniumUtil);
        clickNewPost(seleniumUtil);
        sendkeysContent(seleniumUtil,content);
        postRespose_Submit(seleniumUtil);
    }


}
