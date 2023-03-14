package Gun13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class _01_Scrollintro extends BaseDriver {

    @Test
    public void test1() {
        driver.get("https://p-del.co/");

        // Actions aksiyonlar=new Actions(driver);  // driver üzerinden Aksiyon işlemleri için
        //Select webSelect=new Select(element); // bir tane element için

        // JavaScript komutlarını çalıştırmak için önce js değişkeni tanımlandı.
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,3000)");

        MyFunc.bekle(2);

        js.executeScript("window.scrollBy(0,-3000)");

        // (0,1500) -> (x,y) Sayfayı sağa x kadar ve aşağı y kaydırır
        // 1500 pixel kadar aşağı kaydıracak.
        MyFunc.bekle(2);



        bekleKapat();
    }
}
