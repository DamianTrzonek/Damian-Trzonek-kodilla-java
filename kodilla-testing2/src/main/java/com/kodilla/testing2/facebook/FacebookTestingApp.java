package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String BIRTHDAY = "//span[@class=\'_5k_4\']//select[1]";
    public static final String BIRTHMONTH = "//span[@class=\'_5k_4\']//select[2]";
    public static final String BIRTHYEAR = "//span[@class=\'_5k_4\']//select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while(!driver.findElement(By.xpath(BIRTHYEAR)).isDisplayed());

        WebElement selectDay = driver.findElement(By.xpath(BIRTHDAY));
        Select selectBoardDay = new Select(selectDay);
        selectBoardDay.selectByIndex(29);

        WebElement selectMonth = driver.findElement(By.xpath(BIRTHMONTH));
        Select selectBoardMonth = new Select(selectMonth);
        selectBoardMonth.selectByIndex(2);

        WebElement selectYear = driver.findElement(By.xpath(BIRTHYEAR));
        Select selectBoardYear = new Select(selectYear);
        selectBoardYear.selectByValue("1994");

    }
}
