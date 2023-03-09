package Gun06;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Odev extends BaseDriver {
    @Test
    public void Test2(){
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        WebElement Business=driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        Business.click();
        WebElement discoverXYZ=driver.findElement(By.cssSelector("[id$='4588']"));
        discoverXYZ.click();
        WebElement online=driver.findElement(By.cssSelector("[value='Online Advertising']"));
        online.click();
        WebElement Everyday=driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        Everyday.click();
        WebElement Good=driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        Good.click();
        WebElement usingXYZ=driver.findElement(By.cssSelector("select[id$='4597']"));
        usingXYZ.click();
        WebElement ucuncuSecenek=driver.findElement(By.cssSelector("select[id$='4597'] >:nth-child(4)"));
        ucuncuSecenek.click();
        WebElement sonTiklama=driver.findElement(By.cssSelector("[placeholder='What is your favorite feature in the XYZ product?']"));
        sonTiklama.click();

        bekleKapat();
    }
}
