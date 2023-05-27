Feature: US1002 Amazon Title Testi
@smoke
  Scenario: TC04 Kullanici amazon sayfasinin title'nin dogru oldugunu kontrol eder

    Given Kullanici amazon anasayfaya gider
    Then title'nin Amazon icerdigini test eder
    And Sayfayi kapatir