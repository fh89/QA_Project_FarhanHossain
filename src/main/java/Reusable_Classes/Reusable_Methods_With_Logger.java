package Reusable_Classes;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class Reusable_Methods_With_Logger {


    //method to declare and define a chrome driver
    public static WebDriver setDriver() throws IOException {
        //killing all the chrome instance that you have opened
        //Runtime.getRuntime().exec("taskkill /im chrome.exe /f");
        //setup your driver
        WebDriverManager.chromedriver().setup();
        //set the conditions for chromeoptions before the webdriver is defined
        ChromeOptions options = new ChromeOptions();
        //set arguments to maximize the driver and make it incognito
        options.addArguments("start-maximized");
        //options.addArguments("headless");
        options.addArguments("deleteAllCookies");
        options.addArguments("incognito");
        //define the webdriver
        WebDriver driver = new ChromeDriver(options);

        return driver;
    }//end of set driver method


    //method to compare expected time with actual
    public static void verifyPageTitle(WebDriver driver, String expectedTitle, ExtentTest logger) {
        //verifying the title using if else condition
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title matches " + actualTitle );
            logger.log(LogStatus.PASS,"Title matches");
        } else {
            System.out.println("Title doesn't match " + actualTitle);
            logger.log(LogStatus.FAIL,"Title doesn't match " + actualTitle);
        }//end of the get title condition

    }//End of Method



    //clear and enter a value using sendKeys
    public static void sendKeysMethod(WebDriver driver, WebElement xpath, String userValue, String elementName, ExtentTest logger) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        try {
            System.out.println("Entering a value on " + elementName);
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            element.clear();
            element.sendKeys(userValue);
            System.out.println("Successfully entered a value on " + elementName);
            logger.log(LogStatus.PASS,"Successfully entered a value on " + elementName);
        } catch (Exception err) {
            System.out.println("Unable to enter a value on " + elementName);
            logger.log(LogStatus.FAIL,"Unable to enter a value on " + elementName);
            getScreenShot(driver,elementName,logger);
        }
    }//end of sendKeysMethod

    //click on pop up element
    public static void clickIfPopupExist(WebDriver driver,WebElement xpath,String elementName, ExtentTest logger){
        WebDriverWait wait = new WebDriverWait(driver,5);
        try{
            System.out.println("Successfully Closed Pop Up " + elementName);
            logger.log(LogStatus.PASS,"Successfully Closed Pop Up " + elementName);
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            element.click();
        } catch (Exception err) {
            System.out.println("Popup didn't appear...Proceed to next step");
            logger.log(LogStatus.FAIL,"Popup didn't appear...Proceed to next step " + elementName);
            getScreenShot(driver,elementName,logger);
        }
    }//end of clickIfPopupExist


    //click on element
    public static void clickMethod(WebDriver driver, WebElement xpath, String elementName, ExtentTest logger) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        try {
            System.out.println("Clicking on " + elementName);
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            element.click();
            logger.log(LogStatus.PASS,"Successfully clicked on " + elementName);
        } catch (Exception err) {
            System.out.println("Unable to click on " + elementName);
            logger.log(LogStatus.FAIL,"Unable click on " + elementName);
            getScreenShot(driver,elementName,logger);
        }
    }//end of clickMethod



    //submit on element
    public static void submitMethod(WebDriver driver, WebElement xpath, String elementName, ExtentTest logger) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        try {
            System.out.println("Submitting on " + elementName);
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            element.submit();
            System.out.println("Successfully submitted on " + elementName);
            logger.log(LogStatus.PASS,"Successfully submitted on " + elementName);
        } catch (Exception err) {
            System.out.println("Unable to submit on " + elementName);
            logger.log(LogStatus.FAIL,"Unable to submit on " + elementName);
            getScreenShot(driver,elementName,logger);
        }
    }//end of submitMethod




//select method
    public static void selectMethod(WebDriver driver, WebElement xpath, String userValue, String elementName, ExtentTest logger) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        try {
            System.out.println("Selecting by text from " + elementName);
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            Select choiceSelect = new Select(element);
            logger.log(LogStatus.PASS,"Selecting by text from " + elementName);
        } catch (Exception err) {
            System.out.println("Unable to select by text from " + elementName);
            logger.log(LogStatus.FAIL,"Unable to select by text from " + elementName);
            getScreenShot(driver,elementName,logger);
        }

    }//end of selectMethod




    //Get Text Method


    public static String getText(WebDriver driver, WebElement xpath, String elementName,ExtentTest logger) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        String Result = "";
        try {
            System.out.println(" Getting Text " + elementName);
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            Result = element.getText();
            System.out.println("Result is " + Result);
            logger.log(LogStatus.PASS,"Result is " + Result + " for " + elementName);
        } catch (Exception err) {
            System.out.println("Unable to Get Text " + elementName + " " + err);
            logger.log(LogStatus.FAIL,"Unable to Get Text " + elementName + " " + err);
            getScreenShot(driver,elementName,logger);
        }
        return Result;
    }//end of getText





    // DropDown Method

    public static void dropdownMethod(WebDriver driver, WebElement xpath, String choice, String elementName, ExtentTest logger){
        WebDriverWait wait = new WebDriverWait(driver,15);
        try{
            System.out.println("Selecting from dropdown menu " + elementName);
            //define object for the dropdown WebElement
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            //define object for selection and pass it the dropdown object
            Select choiceSelect = new Select(element);
            //use selectByVisbibleText method on to the selection object and pass it the choice
            choiceSelect.selectByVisibleText(choice);
            logger.log(LogStatus.PASS,"Selecting from dropdown menu " + elementName);
        } catch(Exception err){
            System.out.println("Unable to select from " + elementName + " " + err);
            logger.log(LogStatus.FAIL,"Unable to select from " + elementName);
        }//end of try catch
    }//end of selectMethod



    //Get Text Index Method
    public static String getTextByIndex(WebDriver driver, WebElement xpath, int indexNumber, String elementName, ExtentTest logger) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        String Result = "";
        try {
            System.out.println(" Getting Text " + elementName);
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            Result = element.getText();
            System.out.println("Result is " + Result);
            logger.log(LogStatus.PASS," Getting Text " + elementName + "Result is " + Result);
        } catch (Exception err) {
            System.out.println("Unable to Get Text " + elementName);
            logger.log(LogStatus.FAIL,"Unable to Get Text " + elementName);
        }
        return Result;
    }//end of getTextIndex



    //hover over an element
    public static void mouseHover(WebDriver driver,WebElement xpath,String elementName, ExtentTest logger){
        WebDriverWait wait = new WebDriverWait(driver,15);
        Actions actions = new Actions(driver);
        try{
            System.out.println("Hovering on " + elementName);
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            actions.moveToElement(element).perform();
            logger.log(LogStatus.PASS,"Hovering on " + elementName);
        } catch (Exception err) {
            System.out.println("Unable to hover on " + elementName);
            logger.log(LogStatus.FAIL,"Unable to hover on " + elementName);
        }
    }//end of hover method


    //slider by SendKeys method
    public static void sliderSendKeysMethod(WebDriver driver, WebElement xpath, int resetPoint, String desiredPoint, String elementName, ExtentTest logger) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15);

        try {

            //storing the WebElement as a variable
            WebElement slider = wait.until(ExpectedConditions.visibilityOf(xpath));

            //calling mouse action to click on the slider
            Actions action = new Actions(driver);
            action.click(slider).build().perform();
            Thread.sleep(1500);

            //reset loop
            for (int i = 0; i < resetPoint; i++) {
                action.sendKeys(Keys.ARROW_LEFT).build().perform();
            }//end of reset

            Thread.sleep(1500);

            //desired loop
            //converting String desiredPoint to integer so I can use it on for loop
            int intDesiredPoint = Integer.parseInt(desiredPoint);
            for (int i = 0; i < intDesiredPoint; i++) {
                action.sendKeys(Keys.ARROW_RIGHT).build().perform();
            }//end of desired

            Thread.sleep(1500);

        } catch (Exception e) {

            System.out.println("Unable to move the slider " + elementName + " " + e);
            logger.log(LogStatus.FAIL,"Unable to move the slider "  + elementName);
        }//end of slider by SendKeys method

    }//end of slider method



    //method to verify if checkbox is selected or not
    public static void verifyStatusOfCheckbox(WebDriver driver, WebElement xpath, boolean checkStatus, String elementName,ExtentTest logger) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        try {
            System.out.println("Verifying checkbox status of " + elementName);
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            boolean checkBoxStatus = element.isSelected();
            if(checkBoxStatus == checkStatus){
                System.out.println("Checkbox is selected as expected on " + elementName);
                logger.log(LogStatus.PASS,"Checkbox is selected as expected on " + elementName);
            } else {
                System.out.println("Checkbox is not selected for " + elementName);
                logger.log(LogStatus.PASS,"Checkbox is not selected for " + elementName);
            }//end of condition

        } catch (Exception err) {
            System.out.println("Unable to click on " + elementName);
            logger.log(LogStatus.FAIL,"Unable to click on "  + elementName);
        }//end of condition
    }//end of clickMethod

    //method to capture screenshot when logger fails
    public static void getScreenShot(WebDriver driver, String imageName, ExtentTest logger) {
        try {
            String fileName = imageName + ".png";
            String directory = null;
            String snPath = null;
            directory = "src/main/java/Extent_Report/Screenshots/";
            snPath = "Screenshots//";
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            //String imgPath = directory + fileName;
            String image = logger.addScreenCapture(snPath + fileName);
            logger.log(LogStatus.FAIL, "", image);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Error Occurred while taking SCREENSHOT!!!");
            e.printStackTrace();
        }
    }//end of getScreenshot method


    }//End Of Class






