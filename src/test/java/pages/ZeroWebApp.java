package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroWebApp {
    public ZeroWebApp(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


}
