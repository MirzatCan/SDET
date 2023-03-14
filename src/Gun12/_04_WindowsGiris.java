package Gun12;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _04_WindowsGiris extends BaseDriver {
    @Test
    public void test1() {
        driver.get("https://www.selenium.dev/");
        String anaSayfaId=driver.getWindowHandle();

        //su asamada ana sayfadayim
        //bulunulan windowId yi almak icin
        System.out.println("anaSayfaId = " + anaSayfaId);

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement l:linkler) {
            if (!l.getAttribute("href").contains("mail"))
                l.click();
        }
        //su an butun sayfalar acildi
        Set<String> windosId=driver.getWindowHandles();
        for (String id:windosId) {
            System.out.println("id = " + id);
        }
        //su an da en son acilan sayfadayim ana sayfaya gecmek icin
        driver.switchTo().window(anaSayfaId); // ana sayfaya gectim
        bekleKapat();



    }
}
