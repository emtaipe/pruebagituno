package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class PruebaAppium {
    public static AppiumDriver<MobileElement> driver;

    public static void main(String[] args) throws Throwable {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("app", "C:/Users/Candy/Documents/Appium/Tsoft.apk");
        caps.setCapability("deviceName", "SM A528B");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "13");
        caps.setCapability("automationName", "uiautomator2");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, caps);
       // new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Iniciar Sesión']"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Iniciar Sesión']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.EditText[@text='Usuario']")).sendKeys("user1");
        driver.findElement(By.xpath("//android.widget.EditText[@text='Contraseña']")).sendKeys("test");
        driver.findElement(By.xpath("//android.widget.Button[@text='Iniciar']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@text='TSOFT make it real']//preceding-sibling::android.widget.Button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='CLIENTES']")).click();
        Thread.sleep(2000);
        driver.quit();
    }

}