package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        // sadece <a  a>   a teginde kulanilir
        WebElement siparislerimLinki=driver.findElement(By.linkText("Siparişlerim"));//tam gorunen link tex verecegiz
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());

        System.out.println("siparislerimLinki.getAttribute(\"href\") = " + siparislerimLinki.getAttribute("href"));
        System.out.println("siparislerimLinki.getAttribute(\"title\") = " + siparislerimLinki.getAttribute("title"));
        System.out.println("siparislerimLinki.getAttribute(\"rel\") = " + siparislerimLinki.getAttribute("rel"));

        //partialLinkText
        WebElement link2=driver.findElement(By.partialLinkText("Süper Fiyat"));//goronen link tax inin parcasi yeterli
        System.out.println("link2.getText() = " + link2.getText());

        MyFunc.bekle(3);
        driver.quit();
    }
}
