import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddToFavoritsTest {
    WebDriver wd;

    @Test
    public void testToAddArticleToFavorits(){
      wd = new ChromeDriver();
     wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

     wd.navigate().to("https://www.wikipedia.org/");


    }
}
