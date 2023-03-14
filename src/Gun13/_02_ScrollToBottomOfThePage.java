package Gun13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _02_ScrollToBottomOfThePage extends BaseDriver {
    @Test
    public void test1() {
        driver.get("https://p-del.co/");
        MyFunc.bekle(2);

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript(("window.scrollTo(0, document.body.scrollHeight);"));

        MyFunc.bekle(2);

        js.executeScript(("window.scrollTo(0, 0);"));  // en basa direk 0 noktasina gider

        MyFunc.bekle(2);

//        js.executeScript(("window.scrollBy(0, 0);")); //bulundugu yerden 0 kadar gider


        bekleKapat();
    }
}
