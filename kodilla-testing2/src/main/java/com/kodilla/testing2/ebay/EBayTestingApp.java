package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
    public static final String EBAYURL = "https://www.ebay.com";
    public static final String SEARCHBOX = "gh-ac";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(EBAYURL);

        WebElement searchBox = driver.findElement(By.id(SEARCHBOX));
        searchBox.sendKeys("Laptop");
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }
}
