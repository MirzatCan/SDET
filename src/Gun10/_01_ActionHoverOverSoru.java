package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionHoverOverSoru extends BaseDriver {
//     https://www.etsy.com/ sayfasına gidiniz.
//    Jewellery -> Neckless -> Bib Neckless click
//    tıklatma işleminden sonra URL de
//    bib-necklaces kelimesinin geçtiğini doğrulayın.
    @Test
    public void test1(){
        driver.get("https://www.etsy.com/");
        Actions aksiyonlar=new Actions(driver);
        WebElement JewelleryMenu=driver.findElement(By.id("catnav-primary-link-10855"));
        Action aksiyon1=aksiyonlar.moveToElement(JewelleryMenu).build();
        aksiyon1.perform();

        MyFunc.bekle(2);

        WebElement Neckless=driver.findElement(By.id("side-nav-category-link-10873"));
        Action aksiyon2=aksiyonlar.moveToElement(Neckless).build();
        aksiyon2.perform();
        MyFunc.bekle(2);

        WebElement BibNecklessclick=driver.findElement(By.id("catnav-l3-10881"));
        Action aksiyon3=aksiyonlar.moveToElement(BibNecklessclick).click().build();
        MyFunc.bekle(2);
        aksiyon3.perform();

        Assert.assertTrue("gecmiyor",driver.getCurrentUrl().contains("bib-necklaces"));



        bekleKapat();
    }
}
