package Gun08;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClassGiris extends BaseDriver {
    @Test
    public void test1(){
        driver.get("https://www.amazon.com.tr/");

        WebElement webMenu1=driver.findElement(By.id("searchDropdownBox"));

        //bu element select tag ile basliyorsa, sen bunu SELECT e cast yap oyle kullan.

        Select amazonMenu=new Select(webMenu1);
        //elemani daha rahat kulanilabilir SELECT nesnesi haline donusturdu
        amazonMenu.selectByIndex(4); //ister bu sekilde yap 
//        amazonMenu.selectByValue("value degerine gore");//ister bu sekilde yap
//        amazonMenu.selectByVisibleText("Goruntusune gore");//ister bu sekilde yap

        System.out.println("amazonMenu.getOptions().size() = " + amazonMenu.getOptions().size());

        bekleKapat();
    }
}
