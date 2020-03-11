package com.cbt.tests;

import com.cbt.utulities.BrowserFactory;
import com.cbt.utulities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class NavigationTests {

            WebDriver browsers;


            public void chromeTest() {
                browsers = BrowserFactory.getDriver("chrome");
                browsers.manage().window().maximize();
                browsers.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                browsers.get("https://google.com");
                String googleTitle = browsers.getTitle();
                System.out.println(googleTitle);
                browsers.get("https://etsy.com");
                String etsyTitle = browsers.getTitle();
                browsers.navigate().back();
                browsers.getTitle();
                browsers.navigate().forward();
                browsers.navigate().back();
                browsers.getTitle();

            }

            public void edgeTest() {
                browsers = BrowserFactory.getDriver("edge");
                browsers.manage().window().maximize();
                browsers.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                browsers.get("https://google.com");
                String linkTitle = browsers.getTitle();
                System.out.println(linkTitle);
                browsers.get("https://etsy.com");
                String etsyTitle = browsers.getTitle();
                browsers.navigate().back();
                browsers.getTitle();
            }

            public void firefoxTest() {
                browsers = BrowserFactory.getDriver("firefox");
                browsers.manage().window().maximize();
                browsers.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                browsers.get("https://google.com");
                String linkTitle = browsers.getTitle();
                System.out.println(linkTitle);
                browsers.get("https://etsy.com");
                String etsyTitle = browsers.getTitle();
                browsers.navigate().back();
                browsers.getTitle();
            }
        }
