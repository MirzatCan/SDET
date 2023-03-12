package Gun11;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_FillingForumTask extends BaseDriver {
    /*
        Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
    */
    @Test
    public void test1(){
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name=driver.findElement(By.cssSelector("input[id='title']"));
        name.sendKeys("Mirzat");

        WebElement Comment=driver.findElement(By.cssSelector("textarea[id='description']"));
        Comment.sendKeys("Benim adim Mirzat");

        WebElement Submit=driver.findElement(By.cssSelector("input[id='btn-submit']"));
        Submit.click();

        // imlicitlyWait elemanın locator bulması süresiyle ilgili buradaki zaten elemanlar hemen bulunuyor
        // burada kriter bulunan elemanın görünen yazısının oluşma süresi
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // findElement

        WebElement gozukenYazi=driver.findElement(By.cssSelector("[id='submit-control']"));
        Duration dr=Duration.ofSeconds(30);
        WebDriverWait bekle=new WebDriverWait(driver,dr);
        bekle.until(ExpectedConditions.textToBe(By.cssSelector("[id='submit-control']"),"Form submited Successfully!"));

        // Assert kulanma sekilleri
//      Assert.assertTrue("Gozukmedi",gozukenYazi.getText().contains("Form submited Successfully!"));
        Assert.assertEquals("Form submited Successfully!",gozukenYazi.getText());

        bekleKapat();

    }
}
