package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _03_CallangeOdev extends BaseDriver {
    //1- https://www.saucedemo.com/  siteye gir
    //2- sitedeki kulani adi sifreyi bilgisayari kendi alip tek tek deneme giris yapiniz.
    @Test
    public void test1(){
        driver.navigate().to("https://www.saucedemo.com/");
        List<WebElement> usernames=driver.findElements(By.xpath("//div[@id='login_credentials']"));

        WebElement userNameGiris=driver.findElement(By.xpath("//input[@id='user-name']"));

        WebElement passwordGiris=driver.findElement(By.xpath("//input[@id='password']"));
//
//        for (WebElement u:usernames) {
//            System.out.println("u.getText() = " + u.getText());
//
//        }
        
//        for (WebElement u: usernames) {
//            if (u.getText().endsWith("_user1")) {
//                userNameGiris.sendKeys(u.getText());
//                passwordGiris.sendKeys("secret_sauce");
//                MyFunc.bekle(1);
//                WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
//                login.click();
//                MyFunc.bekle(1);
//                driver.navigate().back();
//            }

//        }







    }
}
