package Gun05;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver {
    public static void main(String[] args) {
        //DriverBaslat(); bunu yazmamiza gerek kalmadi cunku BaseDriver da sadece sitatic yapip DriverBaslat() i  sildik
        driver.get("https://www.hepsiburada.com/");

        List<WebElement> linkler=driver.findElements(By.tagName("a"));

        for (WebElement a: linkler) {
            if (a.getText().isEmpty()) {
                System.out.print("href= " + a.getAttribute("href"));
                System.out.print(" title= " + a.getAttribute("title"));
                System.out.println(" rel= " + a.getAttribute("rel"));
            }
        }
        bekleKapat();

    }
}
