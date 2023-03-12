package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_YontuslarininSecimi extends BaseDriver {
    @Test
    public void test1(){
        driver.get("https://demoqa.com/auto-complete");
        WebElement element1=driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksiyonlar=new Actions(driver);

        Action aksiyon1=  aksiyonlar
                .moveToElement(element1)
                .click()
                .sendKeys("b")
                .build();
        aksiyon1.perform();
        MyFunc.bekle(2);

        Action aksiyon2=aksiyonlar.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build();
        aksiyon2.perform();


        bekleKapat();




    }
}
