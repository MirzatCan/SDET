package Gun14;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.Dimension;


public class _02_WindowsSize extends BaseDriver {
    @Test
    public void test1() {
        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();
        MyFunc.bekle(4);

        Dimension boyut=new Dimension(500,600);
        driver.manage().window().setSize(boyut);



        bekleKapat();
    }

}
