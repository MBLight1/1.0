package Pages;

import Browser.Browser;
import Pages.ObjectMap;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class testingtria {

    private ObjectMap map;


    @Test(dataProvider = "create", dataProviderClass = Pages.Dataprovider.class)
    public void tests(String number){
//Users\Chelo\IdeaProjects\
        map = new ObjectMap("C:\\Users\\Chelo\\IdeaProjects\\AutomationAccruals2.0\\src\\main\\java\\Pages\\objectmap.properties");
        Pages.MyClass myClass = new Pages.MyClass();
        myClass.get();

        try {
            //Step 1
            WebElement finding = Browser.driver().findElement(map.getLocator("find"));
            finding.sendKeys(number);

            //Step 2
            assertEquals("", "");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        myClass.close();
    }


}
