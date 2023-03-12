package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionTusKontrolSendkeys extends BaseDriver {
    @Test
    public void test1(){
        driver.get("https://demoqa.com/auto-complete");
        WebElement element1=driver.findElement(By.id("autoCompleteSingleInput"));
//        element1.sendKeys("Mirzat");

        Actions aksiyonlar=new Actions(driver);

        Action aksoyon1=aksiyonlar
                .moveToElement(element1)  //elamana gel
                .click() // tikla
                .keyDown(Keys.SHIFT)  //shift i bas
                .sendKeys("m")       //m yaz
                .keyUp(Keys.SHIFT)   //shift i biral
                .sendKeys("irzat")   //irzat yaz
                .build();            //aksiyonu hazirla  , aksiyonu insa et

        aksoyon1.perform(); //aksiyonu gerceklestir

        bekleKapat();









    }
}
