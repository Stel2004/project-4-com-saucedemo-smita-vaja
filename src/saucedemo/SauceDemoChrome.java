package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-4 - ProjectName : com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 */
public class SauceDemoChrome {

    // Declared main method
    public static void main(String[] args) {

        // Base URL declared
        String baseUrl = "https://www.saucedemo.com/";

        //1. Setup Chrome browser.
        WebDriver driver = new ChromeDriver();

        //2. Open URL.
        driver.get(baseUrl);
        // maximise the browser windows
        driver.manage().window().maximize();

        // We give implicit wait to driver - give it to beginning level
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        //3. Print the title of the page.
        driver.getTitle();

        //4. Print the current url.
        System.out.println("The current URL is: " + driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println("The page source is :" + driver.getPageSource());

        //6. Enter the email to email field.
        WebElement email = driver.findElement(By.id("user-name"));
        email.sendKeys("standard_user");

        //7. Enter the password to password field.
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        //8. Click on Login Button.
        driver.findElement(By.id("login-button")).click();

        //9. Print the current url.
        System.out.println("The current URL is: " + driver.getCurrentUrl());

        //10. Navigate to baseUrl
        driver.get(baseUrl);

        //11. Refresh the page.
        driver.navigate().refresh();

        //12. Close the browser.
        driver.quit();
    }
}
