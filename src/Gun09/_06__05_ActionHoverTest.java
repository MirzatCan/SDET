package Gun09;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06__05_ActionHoverTest extends BaseDriver {

    @Test
    public void test1(){
        driver.get("https://www.hepsiburada.com/");

        WebElement elemet=driver.findElement(By.xpath("//span[text()='Moda']"));
        elemet.click();

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(elemet).build();
        aksiyon.perform();

        bekleKapat();
    }
}
