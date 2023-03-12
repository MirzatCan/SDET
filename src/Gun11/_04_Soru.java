package Gun11;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_Soru extends BaseDriver {

/*
     Senaryo
     1- https://www.demoblaze.com/index.html  siteyi açınız.
     2- Samsung galaxy s6  linkine tıklayınız.
     3- Sepete ekleyiniz.
     4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
*/
    @Test
    public void test1() {
        driver.get("https://www.demoblaze.com/index.html");
        WebElement sumsungS6=driver.findElement(By.linkText("Samsung galaxy s6"));
        sumsungS6.click();

        WebElement Addtocart=driver.findElement(By.linkText("Add to cart"));
        Addtocart.click();

        Duration dr=Duration.ofSeconds(30);
        WebDriverWait bekle=new WebDriverWait(driver,dr);
        bekle.until(ExpectedConditions.alertIsPresent());   // alert cikana kadar bekle
        driver.switchTo().alert().accept();

        WebElement productStore=driver.findElement(By.linkText("PRODUCT STORE"));
        productStore.click();

    }
}
