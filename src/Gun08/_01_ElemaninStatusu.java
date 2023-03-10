package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElemaninStatusu extends BaseDriver {

    @Test
    public void Test1(){
       driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html?locale=en_UM#!CwCheckBox");

        WebElement sali=driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        System.out.println("sali.isDisplayed() = " + sali.isDisplayed());//gozukuyor mu?
        System.out.println("sali.isEnabled() = " + sali.isEnabled());//aktif mi?
        System.out.println("sali.isSelected() = " + sali.isSelected());//

        sali.click();
        MyFunc.bekle(2);
        System.out.println("sali.isSelected() = " + sali.isSelected());

        WebElement cumarTesi=driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
        System.out.println("cumarTesi.isDisplayed() = " + cumarTesi.isDisplayed());
        System.out.println("cumarTesi.isEnabled() = " + cumarTesi.isEnabled());
        System.out.println("cumarTesi.isSelected() = " + cumarTesi.isSelected());




    }
}
