package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage= new AmazonPage();
    @Given("Kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @When("Nutella icin arama yapar")
    public void nutella_icin_arama_yapar() {
       amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }
    @Then("Arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        String actulaAramaSonucu= amazonPage.aramaSonucuElementi.getText();
        String expectedIcerik = "Nutella";
        Assert.assertTrue(actulaAramaSonucu.contains(expectedIcerik));
    }
    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }
    @When("Java icin arama yapar")
    public void java_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }
    @Then("Arama sonuclarinin Java icerdigini test eder")
    public void arama_sonuclarinin_java_icerdigini_test_eder() {
        String actulaAramaSonucu= amazonPage.aramaSonucuElementi.getText();
        String expectedIcerik = "Java";
        Assert.assertTrue(actulaAramaSonucu.contains(expectedIcerik));
    }
    @When("Samsung icin arama yapar")
    public void samsung_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Samsung" + Keys.ENTER);
    }
    @Then("Arama sonuclarinin Samsung icerdigini test eder")
    public void arama_sonuclarinin_samsung_icerdigini_test_eder() {
        String actulaAramaSonucu= amazonPage.aramaSonucuElementi.getText();
        String expectedIcerik = "Samsung";
        Assert.assertTrue(actulaAramaSonucu.contains(expectedIcerik));
    }

    @Then("title'nin Amazon icerdigini test eder")
    public void titleNinAmazonIcerdiginiTestEder() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle= "Amazon";
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @Given("Kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }


    @When("{string} icin arama yapar")
    public void icinAramaYapar(String aranacakKelime) {
        amazonPage.aramaKutusu.sendKeys(aranacakKelime+Keys.ENTER);
    }

    @Then("Arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String expectedIcerik) {
        String actualAramaSonucu = amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int beklenecekSaniye) {
        // cucumber sayi yazildiginde parametre olarak kabul eder

        try {
            Thread.sleep(beklenecekSaniye);
        } catch (InterruptedException e) {

        }
    }
    @Then("ilk urune click yapar")
    public void ilk_urune_click_yapar() {
        amazonPage.ilkUrunlementi.click();


    }
    @Then("acilan urun isminin {string} ıcerdigini test eder")
    public void acilan_urun_isminin_ıcerdigini_test_eder(String arananKelime) {

        String actualUrunIsmi= amazonPage.ilkUeunIsimElementi.getText();

        Assert.assertTrue(actualUrunIsmi.contains(arananKelime));


}
}
