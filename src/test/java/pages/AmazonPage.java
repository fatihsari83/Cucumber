package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AmazonPage {

    // page class lari surekli kullandıgimiz locate islemleri
    // ve varsa login gibi kucuk islevleri iceren methodlar barindirir.
    // Selenium ile locate islemi veya herhangi bir islev gerceklestirmek istediğimizde
    // WebDriver objesine ihtiyaz vardır.


    // POM de Driver class ında olusturdugumuz
    // WebDriver driver objesini page class larina tanimlamak icin
    // PageFactory claa indan initElements() kullanilir

    public AmazonPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;


    @FindBy(xpath = "(//div[@class='sg-col-inner'])[1]")
    public WebElement aramaSonucuElementi;

    @FindBy (xpath = "//table/tbody/tr")
    public List<WebElement> satirSayisiElementi;

    @FindBy (xpath = "//table/tbody/tr[1]/td")
    public List <WebElement> sutunSayisiElementi;



}
