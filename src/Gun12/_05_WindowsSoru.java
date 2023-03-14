package Gun12;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _05_WindowsSoru extends BaseDriver {
/*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.
 */
    @Test
    public void test1() {
        driver.get("https://www.selenium.dev/");
        String anaSayfaId=driver.getWindowHandle();
        System.out.println("anaSayfaId = " + anaSayfaId);

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement l:linkler) {
            if (!l.getAttribute("href").contains("mail"))
                l.click();
        }

        Set<String> linkIdLer=driver.getWindowHandles();
        for (String id:linkIdLer) {
            MyFunc.bekle(2);
            driver.switchTo().window(id);
            System.out.println(driver.getCurrentUrl()+"----"+driver.getTitle());
            if (!id.equals(anaSayfaId))
                driver.close();
        }

        bekleKapat();
    }
}
