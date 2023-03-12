package Gun11;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
/*   selenium bekleme komutlari

     pageLoadTimeout:
     Duration dr=Duration.ofSeconds(30);
     driver.manage().timeouts().pageLoadTimeout(dr);
     aciklama:30 sn  suresinde sayfanin yuklenmesini bekliyor, bu sureden sonra timeout duserek hata verir
     *****************************************************
     ImplicitlyWait:
     Duration dr=Duration.ofSeconds(150);
     driver.manage().timeouts().implicitlyWait(dr);
     aciklama:Tum sayfadaki elemanlar icin, elemanin locatori sayfa icinde bulunabilir halle getirene kadar
     verilen beklenme suresi. Butun elemanlar icin gecerli ve eleman buludugunda kalan sureyi beklemez.
     NoSuchElement hatasi icin verilen sure kadar bekler.
     ******************************************************
     Explict Wait :
     Duration dr=Duration.ofSeconds(30);
     WebDriverWait bekle=new WebDriverWait(driver,dr);
     bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
     aciklama: Tek bir eleman Ozel Kriter olarak tanimlanir. sadece ilgili elemana gercerli olur.  Webdriver bekleme yapar
*/
public class _01_WaitsGiris extends BaseDriver {
    @Test
    public void test1(){
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        WebElement buton=driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        buton.click();

        Duration dr=Duration.ofSeconds(150);
        driver.manage().timeouts().implicitlyWait(dr);

        // MyFunc.bekle(30);  -> bu programi durdurur, sayfalar ile ilgisi olmadigi icin verilen sure sonuna kadar bekler
        WebElement mesaj=driver.findElement(By.xpath("//p[text()='WebDriver']"));


    }
}
