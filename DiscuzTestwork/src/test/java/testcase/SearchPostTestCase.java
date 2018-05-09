package testcase;

import HelperPage.HelperPageLogin;
import HelperPage.HelperPageSearchPost;
import org.testng.annotations.Test;
import page.PageHome;
import page.PageLogin;
import util.utils;

/**
 * Created by Administrator on 2018/5/9.
 */
public class SearchPostTestCase extends BasicTestCase {
//    用户登录
//            进行帖子搜索
//    搜索haotest帖子
//            进入搜索的帖子
//    验证帖子标题和期望的一致
//            用户退出
    @Test
    public void userLoginPost(){
        HelperPageLogin.clickLoginSubmit(seleniumUtil,"zyn","zyn");
        HelperPageSearchPost.searchPost(seleniumUtil,"wwwwwwwwwwwwwwwwwwwwww");
        seleniumUtil.assertPage("wwwwwwwwwwwwwwwwwwwwww");
//        utils.skipWindow(PageHome.EXIT_CLICK);
        HelperPageLogin.exit(seleniumUtil);
    }


}
