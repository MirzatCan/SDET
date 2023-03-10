package GUN07;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Senaryo extends BaseDriver {
//    1- https://www.saucedemo.com/
//    2- login işlemini yapınız.   //input[@id='user-name']  //input[@id='password']  //input[@id='login-button']
//    3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//    4- Sonra geri dönün (Back to products e tıklatın)
//    5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//    6- sepete tıklatın
//    7- CheckOut a tıklatın
//    8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//    9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//    Item total e eşit olup olmadığını Assert ile test ediniz.
//
//    Bu soruda tamamen XPATH kullanılacaktır.

    @Test
    public void test1(){
        driver.navigate().to("https://www.saucedemo.com/");
        WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");

        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();

        WebElement SauceLabsBackpack=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        SauceLabsBackpack.click();

        WebElement addCarbakpack=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addCarbakpack.click();

        driver.navigate().back();

        WebElement SauceLabsBolt=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        SauceLabsBolt.click();

        WebElement addCarTShirt=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addCarTShirt.click();

        WebElement shoppingCartContainer=driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a"));
        shoppingCartContainer.click();

        WebElement checkOut=driver.findElement(By.xpath("//button[@id='checkout']"));
        checkOut.click();

        WebElement firstName=driver.findElement(By.xpath("//input[@id='first-name']"));
        firstName.sendKeys("Mirzat");

        WebElement lastName=driver.findElement(By.xpath("//input[@id='last-name']"));
        lastName.sendKeys("Memet");

        WebElement postalCode=driver.findElement(By.xpath("//input[@id='postal-code']"));
        postalCode.sendKeys("34098");

        WebElement continueButon=driver.findElement(By.xpath("//input[@id='continue']"));
        continueButon.click();

        List<WebElement> ucretler=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double Toplam=0;

        for (WebElement e:ucretler) {
            System.out.println("e.getText() = " + e.getText());
            //e.getText().replaceAll ile [^0-9,.]     sayilar ile . ve , den baskalarini sil sonra String i double a donustur
            Toplam=Toplam+Double.parseDouble(e.getText().substring(1));
        }
        System.out.println("Toplam = " + Toplam);

        WebElement toplamFiyat=driver.findElement(By.xpath("(//div[@class='summary_subtotal_label'])"));
        Double sayitoplamfiyat=Double.parseDouble(toplamFiyat.getText().replaceAll("[^0-9,.]",""));
        System.out.println("sayitoplamfiyat = " + sayitoplamfiyat);

        Assert.assertTrue("degerler esit degildir",(Toplam==sayitoplamfiyat));

        bekleKapat();
    }
}
