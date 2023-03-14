package Gun12;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseDriver {
    @Test
    public void test1(){
        driver.get("https://chercher.tech/practice/frames");
        //id="frame1"   name="iamframe"   index-> iframe ini sirasi 0 dan baslar
//        driver.switchTo().frame("frame1") ;
//        driver.switchTo().frame("iamframe") ;
        driver.switchTo().frame(0);  // name ile id oldukca yavas calisiyor. index hizli
        WebElement input= driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("Mirzat");

        //iframe icindeki bir locator da islem yapilacaksa once o iframe gecmem lazim
        //driver.switchTo().frame(0);  ilgili odaya(iframe) gec
        //driver.switchTo().parentFrame();  bir onceki sayfaya gec
        //driver.switchTo().defaultContent();  direk ana sayfaya gec
        bekleKapat();
    }
}
