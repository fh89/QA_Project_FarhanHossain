package Reusable_Classes;

import Reusable_Classes.Reusable_Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class   Reusable_Annotation_Class {

    public static WebDriver driver;

    @BeforeSuite

    public void setTheDriver() throws IOException {

        driver = Reusable_Methods.setDriver();



    }//end of before suite


    @AfterSuite
    public void quitSession(){

        driver.quit();



    }//end of class



}//end of class
