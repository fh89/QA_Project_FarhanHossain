package HarvardPilgrimHealthCare_Page_Object;

import Reusable_Classes.Reusable_Annotation_Class_Html_Report;
import Reusable_Classes.Reusable_Methods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Current_Members_Page extends Reusable_Annotation_Class_Html_Report {
    ExtentTest logger;
    public Current_Members_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotation_Class_Html_Report.logger;
    }//end of constructor class


    //set up all the WebElement locators you need for this page
    @FindBy(xpath = "//*[text()='Info for current members for 2021']")
    WebElement InfoForCurrentMembers2021;

    @FindBy(xpath = "//*[text()='Info for current members']")
    WebElement InfoForCurrentMembers;

    @FindBy(xpath = "//*[text()='Enrollment What Happens Next?']")
    WebElement AfterEnrollment;

    @FindBy(xpath = "//*[text()='What is MACRA?']")
    WebElement MARCA;

    @FindBy(xpath = "//*[text()='Learn about Celebrating 65']")
    WebElement Celebrating65;


    //click on 2021 Info
    public void Click2021Info(){
        Reusable_Methods_With_Logger.clickMethod(driver,InfoForCurrentMembers2021,"2021 Info",logger);
    }//End of Method

    //click on Member Info
    public void ClickInfo(){
        Reusable_Methods_With_Logger.clickMethod(driver,InfoForCurrentMembers,"Info",logger);
    }//End of Method

    //click on What Happens Next
    public void AfterEnrollment(){
        Reusable_Methods_With_Logger.clickMethod(driver,AfterEnrollment,"Enrollment What Happens Next?",logger);
    }//End of Method

    //click on What Happens Next
    public void MARCA(){
        Reusable_Methods_With_Logger.clickMethod(driver,MARCA,"What is MACRA?",logger);
    }//End of Method

    //click on our plans
    public void Celebrating65(){
        Reusable_Methods_With_Logger.clickMethod(driver,Celebrating65,"Visit our Celebrating 65® program",logger);
    }//End of Method

}//End off Class
