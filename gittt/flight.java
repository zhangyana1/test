import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Administrator on 2018/4/23.
 */
public class flight {
    public static void main(String[] args) throws InterruptedException {
        String path="D:\\software\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver chromedriver=new ChromeDriver();
        chromedriver.get("D:\\software\\light\\index.html");
        WebElement element=chromedriver.findElement(By.className("switch"));
        for (int i=1;i<9;i++){
            Thread.sleep(300);
            element.click();
        }
    }
}
