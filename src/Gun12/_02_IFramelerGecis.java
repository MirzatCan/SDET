package Gun12;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;


import java.time.Duration;

public class _02_IFramelerGecis extends BaseDriver {
    /*
   Senaryo :
   https://chercher.tech/practice/frames sitesine gidiniz
   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
   Daha sonra animals dan seçeneklerinden avatar ı seçiniz.
 */
    @Test
    public void test1() {
        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame(0);  // name ile id oldukca yavas calisiyor. index hizli
        // //b[@id='topic']/following-sibling::input
        // b[id='topic']~input
        // #topic+input
        WebElement input= driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("Türkiye");

        driver.switchTo().parentFrame();
        driver.switchTo().frame(1);
        WebElement animals = driver.findElement(By.cssSelector("select[id='animals']"));

        Select nesne=new Select(animals);
        nesne.selectByValue("avatar");

        bekleKapat();
    }
}
