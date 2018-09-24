package Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import static org.testng.Assert.assertTrue;



import Browser.Browser;


public class MyClass extends LoadableComponent<MyClass> {

    public WebElement find3;

    private ObjectMap map;

    static String url = "https://www.online-calculator.com/";
    private String title = "Online Calculator";
//C:\driver\chromedriver.exe
    public MyClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        PageFactory.initElements(Browser.driver(), this);
    }

    @Override
    protected void load() {
        Browser.open(url);
    }

    @Override
    protected void isLoaded() {
        assertTrue(Browser.driver().getTitle().equals(title));
    }

    public void close() {
        Browser.close();
    }

    public void search(String search){
        try {
            WebElement finding = Browser.driver().findElement(map.getLocator("find"));
            finding.sendKeys(search);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}


