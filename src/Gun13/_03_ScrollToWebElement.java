package Gun13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ScrollToWebElement extends BaseDriver {
    @Test
    public void test1() {
        driver.get("https://www.copado.com/robotic-testing");
//        driver.manage().deleteAllCookies(); // cookies leri sildik. accept her zaman çıksın diye  ****ama ben anlamaddim

        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement element=driver.findElement(By.linkText("READ STORY")); // niye buyuk harf bilemedim. html de kucuk harf yaziyor

        js.executeScript("arguments[0].scrollIntoView(true);", element);

        MyFunc.bekle(5);
//        element.click();// tiklatma ozelligi kaybettiren elementlerin altinda olduguda tiklatamaz

        js.executeScript("arguments[0].click();", element);  //html icinden elemanta ulasir ve tiklatir
        bekleKapat();
    }
}
