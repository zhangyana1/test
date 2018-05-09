package HelperPage;

import page.PageHome;
import page.PageManageHeart;
import util.SeleniumUtil;
import util.utils;

/**
 * Created by Administrator on 2018/5/8.
 */
public class HelperPageNewPart {
    //管理中心--论坛
    public static void Manageheart(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageHome.MANAGEHEART_CLICK);
    }


    //登录
    public static void login_Forum(SeleniumUtil seleniumUtil,String password){

        seleniumUtil.sendKeys(PageManageHeart.PASSWORD,password);
        seleniumUtil.click(PageManageHeart.SUBMIT);
    }


    //论坛
    public static void forum(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManageHeart.MANAGEHEART_FORUM);
    }

    //添加新版块
    public static void creatNewPart(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManageHeart.CREAT_NEW_PART);
    }

    //输入名称
    public static void newPartName(SeleniumUtil seleniumUtil,String name){
        seleniumUtil.clear(PageManageHeart.NEW_PART_NAME);
        seleniumUtil.sendKeys(PageManageHeart.NEW_PART_NAME,name);
    }

    //提交添加新版块
    public static void newPartSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManageHeart.NEW_PART_SUBMIT);
    }

    //整合-创建新版块
    public static void newPart(SeleniumUtil seleniumUtil,String password,String name,String framename){
        Manageheart(seleniumUtil);
        seleniumUtil.exchangeHandle();
        login_Forum(seleniumUtil,password);
        forum(seleniumUtil);
        seleniumUtil.skipFrame(framename);
        creatNewPart(seleniumUtil);
        newPartName(seleniumUtil,name);
        newPartSubmit(seleniumUtil);



    }

    //点击新版块
    public static void clickNewPart(SeleniumUtil seli){

    }
}
