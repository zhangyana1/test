package HelperPage;

import page.PageHome;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/9.
 */
public class HelperPageHome {

    //点击默认版块
    public static void clickDefaultPart(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageHome.HOMEPAGE_DEFAULTPART);
    }

}
