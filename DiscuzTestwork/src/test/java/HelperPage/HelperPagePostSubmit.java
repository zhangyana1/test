package HelperPage;

import page.PageDefaultPart;
import page.PageHome;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/8.
 */
public class HelperPagePostSubmit {


    //发帖-输入帖子标题
    public static void sendKeysPostTitle(SeleniumUtil seleniumUtil,String title){
        seleniumUtil.sendKeys(PageDefaultPart.HOMEPAGE_POST_TITLE,title);
    }

    //发帖-输入帖子内容
    public static void sendKeysPostContent(SeleniumUtil seleniumUtil,String content){
        seleniumUtil.sendKeys(PageDefaultPart.HOMEPAGE_POST_CONTENT,content);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //发帖-提交帖子
    public static void  postSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageDefaultPart.HOMEPAGE_POST_SUBMIT);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //发帖
    public static void post_Submit(SeleniumUtil seleniumUtil,String content1,String conteent2){
        HelperPageHome.clickDefaultPart(seleniumUtil);
        sendKeysPostTitle(seleniumUtil,content1);
        sendKeysPostContent(seleniumUtil,conteent2);
        postSubmit(seleniumUtil);
    }
}
