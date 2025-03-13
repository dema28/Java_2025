package Novicov.Lessons13FirstTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {
    @Test
    public void textAdd() {
//        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // Разворачиваем браузер на весь экран
        driver.manage().window().maximize();

        // Открываем страницу
        driver.get("https://demoqa.com/text-box");

        // Заполняем форму
        WebElement fullName = driver.findElement(By.xpath("//*[@id='userName']"));
        fullName.sendKeys("John Doe");

        WebElement email = driver.findElement(By.xpath("//*[@id='userEmail']"));
        email.sendKeys("johndoe@example.com");

        WebElement currentAddress = driver.findElement(By.xpath("//*[@id='currentAddress']"));
        currentAddress.sendKeys("123 Main St, Anytown, USA");

        WebElement permanentAddress = driver.findElement(By.xpath("//*[@id='permanentAddress']"));
        permanentAddress.sendKeys("12 Main St, New York, USA");

        // Кликаем на кнопку Submit
        WebElement submitButton = driver.findElement(By.xpath("//*[@id='submit']"));
        submitButton.click();

        // Закрываем браузер
        driver.quit();
    }
}
