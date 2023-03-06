package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement lableFirstName=driver.findElement(By.className("form-textbox"));
        lableFirstName.sendKeys("Mirzat");
        //form-textbox validate[required]  2 tane class arasinda bosluk var.
        //sadece form-textbox kulandik ama satfada 2 tane var
        //birden fazla aynı locator a sahip eleman bulursa findElement ne yapar ?
        // cevap : ilk element i bulur

        List<WebElement> labels=driver.findElements(By.className("form-sub-label"));
        System.out.println(labels.size());

        for (WebElement e:
             labels) {
            System.out.println("e.getText() = " + e.getText());
        }

        MyFunc.bekle(3);
        driver.quit();


        //aranılan eleman bulunamazsa : findElement NoSuchElement hatası veriri
        // findElements is size ı 0 olan List verir, yani hata vermez.
    }
}
