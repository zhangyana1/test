package testcase;


import HelperPage.HelperPageLogin;
import HelperPage.HelperPagePostRespose;
import HelperPage.HelperPagePostSubmit;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/5/8.
 */
public class UserTestCase extends BasicTestCase {

    //用户登录发表帖子，回复帖子，退出
    @Test
    public void userLogin(){
        HelperPageLogin.clickLoginSubmit(seleniumUtil,"admin","admin");
        HelperPagePostSubmit.post_Submit(seleniumUtil,"我我我我我我我我我我我我我我我我我","啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦");
        HelperPagePostRespose.post_Respose(seleniumUtil,"哈哈哈哈哈哈哈哈哈哈哈");
        HelperPageLogin.exit(seleniumUtil);
    }


}
