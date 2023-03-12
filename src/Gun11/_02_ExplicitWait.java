package Gun11;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _02_ExplicitWait extends BaseDriver {
/*  İnterview Sorusu :  Implicit ve Explicit
    Implicitli  : Bütün elemanlar için geçerli,Bir kere tanımlanır. (HTML de verilen locator var mı?)
    Explicit    : Tek bir eleman özel Kriter olarak tanımlanır sadece ilgili elemanda geçerli olur
*/
    @Test
    public void test1() {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        WebElement buton = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        buton.click();

        Duration dr=Duration.ofSeconds(30);
        WebDriverWait bekle=new WebDriverWait(driver,dr);   // burda WebDiriver i durduruyoruz.
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        //BeklenenKriterlerden  ->  ExpectedConditions
        //Verilen Locatirdaki eleman gozukur halle  -> visibilityOfElementLocated
        //gelene kadar bekle -> until

        System.out.println("Bitti");
    }
}
