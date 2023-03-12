package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionDragAndDropTest extends BaseDriver {
    @Test
    public void test1(){
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions aksiyonlar=new Actions(driver);
        MyFunc.bekle(2);
        WebElement osko=driver.findElement(By.id("box1"));
        WebElement norwey=driver.findElement(By.id("box101"));

        //1.yontem
        Action aksiyon=aksiyonlar.dragAndDrop(osko,norwey).build();
        aksiyon.perform();
        //2.yontem
//        Action aksiyon1=aksiyonlar.clickAndHold(osko).build();
//        aksiyon1.perform();
//        Action aksiyon2=aksiyonlar.moveToElement(norwey).release().build();
//        aksiyon2.perform();


    }
}
