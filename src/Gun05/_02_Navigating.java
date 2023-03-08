package Gun05;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.bekle(3);

        WebElement element=driver.findElement(By.id("alerttest"));
        //WebElement element=driver.findElement(By.linkText("Alerts (JavaScript)"));
        System.out.println(driver.getCurrentUrl());

        element.click();
        MyFunc.bekle(3);

        System.out.println(driver.getCurrentUrl());// o anda bulunan url yi verir

        driver.navigate().back(); // geri git
        MyFunc.bekle(3);

        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward(); //ileriye git
        MyFunc.bekle(3);

        System.out.println(driver.getCurrentUrl());






        bekleKapat();
    }
}
