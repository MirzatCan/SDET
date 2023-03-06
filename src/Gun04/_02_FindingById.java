package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement isimKutusu=driver.findElement(By.id("first_8")); //Elemani id ile bul
        isimKutusu.sendKeys("Mirzat");//kutucuklara yazi gonderme

        WebElement soyisimKutusu=driver.findElement(By.id("last_8"));
        soyisimKutusu.sendKeys("Memet");

        MyFunc.bekle(2);
//        isimKutusu.clear();
//        soyisimKutusu.clear();

        // Chrome ctrl+f ye basıldığında inspect bölümünde
        // first_name yazarsak bütün kelimelerde arar
        // #first_name yazarsak bütün ID paramtrelerinde arar

        WebElement lableFirstName=driver.findElement(By.id("sublabel_8_first"));
        System.out.println("lableFirstName.getText() = " + lableFirstName.getText());

        WebElement lableLastName=driver.findElement(By.id("sublabel_8_last"));
        System.out.println("lableLastName.getText() = " + lableLastName.getText());

        WebElement submitButton=driver.findElement(By.id("input_2"));
        submitButton.click();


        MyFunc.bekle(5);
        driver.quit();
    }
}
