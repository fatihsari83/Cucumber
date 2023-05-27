Feature: US1006 Amazonda aranan urun dogrulamasi
  @wip

  Scenario: TC12 Aranan urunun dogru oldugu test edebilmeli

    Given  Kullanici "amazonUrl" anasayfaya gider
    Then "Nutella" icin arama yapar
    And ilk urune click yapar
    And acilan urun isminin "Nutella" ıcerdigini test eder
    And Sayfayi kapatir