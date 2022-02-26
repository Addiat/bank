package com.company;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/adiat/IdeaProjects/bank/chromedriver");
        //This command would launch the browser
        WebDriver driver = new ChromeDriver();
        //This will maximize the browser
        driver. manage().window().maximize();

        //Enter Url
        driver.navigate().to("https://www.matalan.co.uk/");

        //Gets the Page Title
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        //This command would quit the browser
        driver.quit();

        System.setProperty("webdriver.chrome.driver", "/Users/adiat/IdeaProjects/bank/chromedriver");
        //This command would launch the browser
        WebDriver driver1 = new ChromeDriver();
        //This will maximize the browser
        driver1. manage().window().maximize();

        //Enter Url
        driver1.navigate().to("https://www.matalan.co.uk/");

        //Gets the Page Title
        String appUrl = driver1.getTitle();
        System.out.println(appUrl);


        //This command would quit the browser
        driver1.quit();

    }
}
