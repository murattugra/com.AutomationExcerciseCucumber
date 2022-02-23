Feature: Register_User_Functionality
  @register
  Scenario: TC01_register_page (kayit sayfasi)

    Given Navigate to url "automation_url"
    And Verify that home page is visible successfully
    And Click on  Signup-Login button
    Then Verify 'New User Signup!' is visible


  Scenario: TC02_signup_user (kayitli kullanici)

    Then And Enter name and email address
    And When Click Signup button
    And  Then Verify that 'ENTER ACCOUNT INFORMATION' is visible
    Then Fill details: Title, Name, Email, Password, Date of birth, Select checkbox Sign up for our newsletter! and Select checkbox Receive special offers from our partners!
    When Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And Click Create Account button
    And Verify that 'ACCOUNT CREATED!' is visible
    Then Click Continue button
    And Verify that Logged in as username is visible


  Scenario: TC03_delete_account (hesap silme)



Feature: Register User

  Scenario: User register




 # And Fill details: Title, Name, Email, Password, Date of birth
 # And Select checkbox 'Sign up for our newsletter!'
 # Then Select checkbox 'Receive special offers from our partners!'
 # And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
 # Then Click 'Create Account button'
 # And Verify that 'ACCOUNT CREATED!' is visible
 # When Click 'Continue' button
 # Then Verify that 'Logged in as username' is visible
 # And Click 'Delete Account' button
 # And Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button


  # 1. Tarayıcıyı başlatın
  #2. 'http://automationexercise.com' url'sine gidin
  #3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
  #4. 'Kayıt Ol / Giriş Yap' düğmesine tıklayın
  #5. 'Yeni Kullanıcı Kaydı'nı doğrulayın! görünür
  #6. Adı ve e-posta adresini girin
  #7. 'Kaydol' düğmesini tıklayın
  #8. 'HESAP BİLGİLERİNİ GİRİN' ifadesinin görünür olduğunu doğrulayın
  #9. Doldurma ayrıntıları: Unvan, Ad, E-posta, Şifre, Doğum tarihi
  #10. 'Bültenimize kaydolun!' onay kutusunu seçin.
  #11. 'Ortaklarımızdan özel teklifler alın!' onay kutusunu seçin.
  #12. Doldurma ayrıntıları: Ad, Soyadı, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
  #13. 'Hesap Oluştur düğmesini' tıklayın
  #14. 'HESAP OLUŞTURULDU!' görünür
  #15. 'Devam' düğmesini tıklayın
  #16. 'Kullanıcı adı olarak oturum açıldı' ifadesinin görünür olduğunu doğrulayın
  #17. 'Hesabı Sil' düğmesini tıklayın
  #18. 'HESAP SİLİNDİ!' görünür ve 'Devam' düğmesini tıklayın