@smoke  @TC01 @SignUp

Feature: Kullanici siteye uye olur

  @TC01_01
  Scenario: TC01_01
    Given Kullanici siteye gider
#    When Kullanici sign up butonunu gorur
    Then Kullanici sign up butonuna tiklar
    Then Kullanici username bilgilerini girer
    Then Kullanici password bilgilerini girer
    When Kullanici sign up succesfull mesajini goruntuler
    Then Kullanici tamam butonuna basar