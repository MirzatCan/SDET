package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionRightClick extends BaseDriver {
    @Test
    public void test1(){
        driver.get("https://demoqa.com/buttons");
        WebElement element=driver.findElement(By.id("rightClickBtn"));

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(element).contextClick().build();  //rightClick lerde contextClick() kullanilir
        MyFunc.bekle(2);                                                       //ayni
        aksiyon.perform();
        bekleKapat();

    }
}
