package Gun12;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */
public class _03_IFrameSoru extends BaseDriver {
    @Test
    public void test1() {
        driver.get("http://chercher.tech/practice/frames");
        driver.switchTo().frame(0);
        WebElement input= driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("Türkiye");

        driver.switchTo().frame(0);
        WebElement maviTik= driver.findElement(By.cssSelector("[id='a']"));
        maviTik.click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement animals = driver.findElement(By.cssSelector("select[id='animals']"));

        Select nesne=new Select(animals);
        nesne.selectByIndex(3);







        bekleKapat();
    }
}
