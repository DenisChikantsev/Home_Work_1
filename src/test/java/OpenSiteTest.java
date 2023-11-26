import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenSiteTest {
//  open

    WebDriver wd;

    @BeforeClass
    public void openBrowser(){
        wd = new ChromeDriver();
    }

    @Test
    public void openSite(){
        wd.navigate().to("https://www.amazon.com/");
    }

    @AfterTest
    public void closeBrowser(){
        wd.close();
    }
}
