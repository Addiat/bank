package com.company;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceLive {

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/adiat/IdeaProjects/bank/chromedriver");
        //This command would launch the browser
        WebDriver driver = new ChromeDriver();
        //This will maximize the browser
        driver. manage().window().maximize();

        //Enter Url
        driver.navigate().to("https://www.matalan.co.uk/");
        driver.get("https://www.matalan.co.uk/");

    }
    @After
    public void cleanUp(){
        //This command would quit the browser
        driver.quit();

    }

    @Test(timeout = 35000)
    public void testToValidateHomePage() {
        //Gets the Page Title
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        Assert.assertTrue(pageTitle.contains("Online Clothes Shopping - Shop Latest Fashion – Matalan"));
    }

    @Test
    public void testToValidateAppUrl() {
        //Gets the Page Title
        String appUrl = driver.getCurrentUrl();
        System.out.println(appUrl);
        Assert.assertTrue(appUrl.contains("https://www.matalan.co.uk/"));
    }

    @After
    public void cleanUp(){
        //This command would quit the browser
        driver.quit();
}
