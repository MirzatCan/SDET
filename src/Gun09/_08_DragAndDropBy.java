package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _08_DragAndDropBy extends BaseDriver {
    @Test
    public void test1(){
        driver.get("https://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement solSurgu=driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));

        Actions aksiyonlar=new Actions(driver);

        Action aksiyon=aksiyonlar.dragAndDropBy(solSurgu,100,0).build();  //0 dan yuksak olunca saga surukle
        aksiyon.perform();

        MyFunc.bekle(2);
        Action aksiyon2=aksiyonlar.dragAndDropBy(solSurgu,-200,0).build(); //0 dan kucuk olunca sola doguru surukle
        aksiyon2.perform();
        bekleKapat();
    }
}
