package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _01_Soru extends BaseDriver {
//        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//          öncesinde de görünmediğini, sonrasında da göründüğünü
//          assert ile doğrulayınız.
    @Test
    public void test1(){
        driver.get("https://en-gb.facebook.com/");
        WebElement CreateNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        CreateNewAccount.click();
        WebElement firstName=driver.findElement(By.cssSelector("[name='firstname']"));
        firstName.sendKeys("Mirzat");
        WebElement lastName=driver.findElement(By.cssSelector("[name='lastname']"));
        lastName.sendKeys("Memet");

        WebElement emailTekrar=driver.findElement(By.cssSelector("[name='reg_email_confirmation__']"));
        System.out.println("emailTekrar.isDisplayed() = " + emailTekrar.isDisplayed());

        Assert.assertFalse(emailTekrar.isDisplayed());

        WebElement email=driver.findElement(By.cssSelector("[name='reg_email__']"));
        email.sendKeys("1533367728m@gmail.com");
        MyFunc.bekle(3);

        Assert.assertTrue(emailTekrar.isDisplayed());


        System.out.println("emailTekrar.isDisplayed() = " + emailTekrar.isDisplayed());
        WebElement dogumGunMenu=driver.findElement(By.cssSelector("[name='birthday_day']"));
        Select dogumGunTarih=new Select(dogumGunMenu);
        dogumGunTarih.selectByIndex(23);
        WebElement dogumAyMenu=driver.findElement(By.cssSelector("[name='birthday_month']"));
        Select dogumAyTarih=new Select(dogumAyMenu);
        dogumAyTarih.selectByVisibleText("Mar");
        WebElement dogumYilMenu=driver.findElement(By.cssSelector("[name='birthday_year']"));
        Select dogumYilTarih=new Select(dogumYilMenu);
        dogumYilTarih.selectByValue("1997");

        WebElement male=driver.findElement(By.cssSelector("[name='sex'][value='2']"));
        male.click();

        bekleKapat();

    }
}
