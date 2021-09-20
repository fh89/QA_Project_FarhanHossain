package HarvardPilgrimHealthCare_Page_Object;

import Reusable_Classes.Reusable_Annotation_Class_Html_Report;
import Reusable_Classes.Reusable_Methods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HPHhomepage extends Reusable_Annotation_Class_Html_Report {

    ExtentTest logger;
    public HPHhomepage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotation_Class_Html_Report.logger;
    }//end of constructor class

    //set up all the WebElement locators you need for this page
    @FindBy(xpath = "//*[@id='1471911862284']")
    WebElement OurPlansTab;

    //click on our plans
    public void ClickOurPlans(){
   Reusable_Methods_With_Logger.clickMethod(driver,OurPlansTab,"Our Plans Tab",logger);
    }//End of Method


}//end of class
