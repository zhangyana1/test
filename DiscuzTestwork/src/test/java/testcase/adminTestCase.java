package testcase;


import HelperPage.*;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/5/8.
 */
public class adminTestCase extends BasicTestCase{
    //管理员删除帖子、创建版块、用户在新版块下发帖
    @Test
    public void adminLogin(){
        HelperPageLogin.clickLoginSubmit(seleniumUtil,"admin","admin");
        HelperPageDeletePost.deletePost(seleniumUtil);
        HelperPageNewPart.newPart(seleniumUtil,"admin","zynNewpart","main");

        HelperPageLogin.exit(seleniumUtil);
    }

    @Test
    public void userLoginPost(){
        HelperPageLogin.clickLoginSubmit(seleniumUtil,"zyn","zyn");
        HelperPagePostSubmit.post_Submit(seleniumUtil,"wwwwwwwwwwwwwwwwwwwwww","aaaaaaaaaaaaaaaaaaaaaa");
        HelperPagePostRespose.post_Respose(seleniumUtil,"哈哈哈哈哈哈哈哈哈哈哈");

    }
}
