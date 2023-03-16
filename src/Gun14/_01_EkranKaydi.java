package Gun14;

import Utlity.BaseDriver;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class _01_EkranKaydi extends BaseDriver {
    @Test
    public void test1() throws AWTException, IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement userName= driver.findElement(By.name("username"));
        userName.sendKeys("Mirzat");

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("123456");

        WebElement login=driver.findElement(By.cssSelector("button[type='submit']"));
        login.click();

        //hata varsa cikan element
        List<WebElement> hataMesaj=driver.findElements(By.xpath("//*[text()='Invalid credentials']"));
        if (hataMesaj.size()>0)
        {
            System.out.println("Hata verdi");
            TakesScreenshot ts=(TakesScreenshot) driver;//1.asama ekran goruntusu alma degiskenini tanimladim
            File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE);  //2. asama ekran goruntusu hafiza alindi.  FILE dosya demek
            // hafizadaki bu bilgiyi dosya olarak kullan

            //3.asama hafizadaki bu bilgiyi dosya olarak verilen path e kaydetti
            FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntusu\\screenshot.png")); //yer soylemedigim icin proje icine dosya acti

        }
        // TODO : burada her hata da aynı dosyayı yeniliyor ve üzerine yazıyor.
        //        biz istiyoruzki her dosya ayrı olsun yani her kayıt ayrı olsun
        //        bunu nasıl yaparsınız
        //        LocalDateTime alıcaksın bilgileri
        //        YılAyGunSaatDakikaSan -> 2022_10_07_1319_20.png

        bekleKapat();

    }
}
