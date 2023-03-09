package Gun06;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert;

public class _01_CssSelector2 extends BaseDriver {

    @Test
    public void Test1()
    {
        // 1-Açılan sayfadaki kutucuğa mesajınızı yazını.
        // 2-Butona tıklatınız
        // 3-Butona basıldığında mesajınızın sayfada göründüğünü test ediniz.

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement yaziGiris=driver.findElement(By.cssSelector("input[id='user-message']"));
        String mesajim="Mirzat memet kraldir";
        yaziGiris.sendKeys(mesajim);
        MyFunc.bekle(3);

        WebElement tikla=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        tikla.click();

        WebElement gosteri=driver.findElement(By.cssSelector("[id='display']"));
        System.out.println(gosteri.getText());

//        if (gosteri.getText().equals("Mirzat memet kraldir")){
//            System.out.println("testi gecti");
//        }
//        else
//            System.out.println("tesati gecemedi");

        Assert.assertTrue("esit degik",gosteri.getText().equals(mesajim)); //verilen deger True mu?


        bekleKapat();
    }
}
