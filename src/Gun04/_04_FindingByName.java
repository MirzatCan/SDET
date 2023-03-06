package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement lableFirstName=driver.findElement(By.name("q8_name[first]"));
        lableFirstName.sendKeys("Mirzat");

        MyFunc.bekle(3);
        driver.quit();

    }
}
