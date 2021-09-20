package HarvardPilgrimHealthCare_Page_Object;

import Reusable_Classes.Reusable_Annotation_Class_Html_Report;
import Reusable_Classes.Reusable_Methods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurPlansPage extends Reusable_Annotation_Class_Html_Report {

    ExtentTest logger;

    public OurPlansPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotation_Class_Html_Report.logger;
    }//end of constructor class

    //set up all the WebElement locators you need for this page
    @FindBy(xpath = "//*[text()='Massachusetts']")
    WebElement Massachusetts;

    @FindBy(xpath = "//*[text()='Already a member?']")
    WebElement Already_A_Member;

    @FindBy(xpath = "//*[text()='Tips to Pick a Plan page']")
    WebElement TipsToPickAPlan;

    @FindBy(xpath = "//*[text()='learn more about the employer-sponsored group plans']")
    WebElement Employer_Sponsored_Plans;




    //click on our plans
    public void Massachusetts(){
        Reusable_Methods_With_Logger.clickMethod(driver,Massachusetts,"Massachusetts",logger);
    }//End of Method

    //click on our plans
    public void AlreadyMember(){
        Reusable_Methods_With_Logger.clickMethod(driver,Already_A_Member,"Already a member?",logger);
    }//End of Method

    //click on our plans
    public void TipsForPlan(){
        Reusable_Methods_With_Logger.clickMethod(driver,TipsToPickAPlan,"Tips to Pick a Plan page",logger);
    }//End of Method

    //click on our plans
    public void EmployerPlan(){
        Reusable_Methods_With_Logger.clickMethod(driver,Employer_Sponsored_Plans,"learn more about the employer-sponsored group plans",logger);
    }//End of Method




}//end of class
