package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionDoubleClickTest extends BaseDriver {
    @Test
    public void test1(){
        driver.get("https://demoqa.com/buttons");

        WebElement element=driver.findElement(By.id("doubleClickBtn"));
        MyFunc.bekle(2);

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(element).doubleClick().build();
        aksiyon.perform();

//        aksiyonlar.doubleClick(element).build().perform();                      //2.sekil
//        aksiyonlar.moveToElement(element).doubleClick().build().perform();      //3.sekil     tek satirda yazma sekli
        bekleKapat();


    }
}
