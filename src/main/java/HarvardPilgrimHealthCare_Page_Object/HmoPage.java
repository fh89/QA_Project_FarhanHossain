package HarvardPilgrimHealthCare_Page_Object;

import Reusable_Classes.Reusable_Annotation_Class_Html_Report;
import Reusable_Classes.Reusable_Methods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HmoPage extends Reusable_Annotation_Class_Html_Report {

    ExtentTest logger;
    public HmoPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotation_Class_Html_Report.logger;
    }//end of constructor class

    //set up all the WebElement locators you need for this page
    @FindBy(xpath = "//*[text()='View or download documents']")
    WebElement View_Documents;

    @FindBy(xpath = "//*[text()='Visit Pharmacy Program']")
    WebElement PharmacyProgram;

    @FindBy(xpath = "//*[text()='Download forms']")
    WebElement Forms;

    @FindBy(xpath = "//*[text()='Search for a provider']")
    WebElement Directory;

    @FindBy(xpath = "//*[text()='Find helpful info']")
    WebElement Helpful_Info;


    @FindBy(xpath = "//*[text()='Find Health & Wellness Info']")
    WebElement Health_Wellness_Info;


    @FindBy(xpath = "//*[text()='Learn more about your extra benefits']")
    WebElement Benefits_Info;

    @FindBy(xpath = "//*[text()='Contact Member Services']")
    WebElement Contact_Info;

    @FindBy(xpath = "//*[text()='Learn about grievances & appeals']")
    WebElement Appeals;


    //click on View Docs
    public void View_Documents(){
        Reusable_Methods_With_Logger.clickMethod(driver,View_Documents,"View or Download Documents",logger);
    }//End of Method


    //click on PharmacyProgram
    public void PharmacyProgram(){
        Reusable_Methods_With_Logger.clickMethod(driver,PharmacyProgram,"Visit Pharmacy Program",logger);
    }//End of Method

    //click on Forms
    public void Forms(){
        Reusable_Methods_With_Logger.clickMethod(driver,Forms,"Member Forms",logger);
    }//End of Method


    //click on Directory
    public void Directory(){
        Reusable_Methods_With_Logger.clickMethod(driver,Directory,"Search for a provider",logger);
    }//End of Method

    //click on Helpful_Info
    public void Helpful_Info(){
        Reusable_Methods_With_Logger.clickMethod(driver,Helpful_Info,"Find helpful info",logger);
    }//End of Method

    //click on Helpful_Info
    public void Health_Wellness_Info(){
        Reusable_Methods_With_Logger.clickMethod(driver,Health_Wellness_Info,"Find Health & Wellness Info",logger);
    }//End of Method

    //click on Helpful_Info
    public void Benefits_Info(){
        Reusable_Methods_With_Logger.clickMethod(driver,Benefits_Info,"Learn more about your extra benefits",logger);
    }//End of Method

    //click on Helpful_Info
    public void Contact_Info(){
        Reusable_Methods_With_Logger.clickMethod(driver,Contact_Info,"Contact Member Services",logger);
    }//End of Method


    //click on View Docs
    public void Appeals(){
        Reusable_Methods_With_Logger.clickMethod(driver,Appeals,"Learn about grievances & appeals",logger);
    }//End of Method

}//end of class
