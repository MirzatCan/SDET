package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement lableFirstName=driver.findElement(By.id("sublabel_8_first"));
        System.out.println("lableFirstName.getText() = " + lableFirstName.getText());

        try {
            WebElement lableLastName=driver.findElement(By.id("hataliLocar"));
        }
        catch (Exception ex)
        {
            System.out.println("WebEleman Bulunamadi " + ex.getMessage());
        }




    }
}
