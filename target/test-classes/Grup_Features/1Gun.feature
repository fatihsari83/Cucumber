Feature: 2002 Zero page

  Scenario: DropDownTesti
    Given Kullanici "zeroUrl" anasayfaya gider
    Then Sign in butonuna basar
    Then Login kutusuna “username” yazar
    Then Password kutusuna “password” yazar
    Then Sign in tusuna basin
    Then Online banking menusu icinde Pay Bills sayfasina gider
    Then "Purchase" Foreign Currency tusuna basar
    Then “Currency” drop down menusunden Eurozone’u secer
    Then “Currency” drop down menusunden Eurozone’u secer
    Then soft assert kullanarak "Eurozone (euro) secildigini test eder
    Then Soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin