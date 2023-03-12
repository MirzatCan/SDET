package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class _04_IntroAlert extends BaseDriver {

    @Test
    public void test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        WebElement clikMe1 = driver.findElement(By.cssSelector("[onclick='myAlertFunction()']"));
        clikMe1.click();

        MyFunc.bekle(2);
        //alert aciliyor
        driver.switchTo().alert().accept();  //accept alert kutusunda ok yi tiklar

        MyFunc.bekle(2);
        WebElement clikMe2 = driver.findElement(By.cssSelector("[onclick='myConfirmFunction()']"));
        clikMe2.click();
        MyFunc.bekle(2);
        driver.switchTo().alert().dismiss(); //accept alert kutusunu cancel yi tiklar

        MyFunc.bekle(2);
        WebElement clikMe3 = driver.findElement(By.cssSelector("[onclick='myPromptFunction()']"));
        clikMe3.click();
        MyFunc.bekle(2);
        driver.switchTo().alert().sendKeys("benim adim Mirzat");
        driver.switchTo().alert().accept();


        WebElement gozukkenYazi = driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue("beklenen yazi gozukmedi",gozukkenYazi.getText().contains("benim adim Mirzat"));



        bekleKapat();
    }
}
