package Gun05;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCssValue extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement inputValENter=driver.findElement(By.id("inputValEnter"));
        
        //<input autocomplete="off" name="keyword" type="text"
        //class="col-xs-20 searchformInput keyword" 
        // id="inputValEnter" onkeypress="clickGo(event, this)" 
        // placeholder="" value="">

        // elemanın parametrelerine ulaşmak için getAttribute u kullanıyoruz.
        System.out.println("inputValENter.getAttribute(\"class\") = " + inputValENter.getAttribute("class"));

        // Class ı n karşığı olan CSS-Şekillendirme değerlerini almak için getCssValue kullanılır
        System.out.println("inputValENter.getCssValue(\"color\") = " + inputValENter.getCssValue("color"));
        System.out.println("inputValENter.getCssValue(\"font-size\") = " + inputValENter.getCssValue("font-size"));
        System.out.println("inputValENter.getCssValue(\"background\") = " + inputValENter.getCssValue("background"));






        bekleKapat();
    }
}
