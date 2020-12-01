package com.genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupDriver {

    public void setupURL() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Tanzil\\automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        System.out.println(driver.getCurrentUrl());
    }
}
