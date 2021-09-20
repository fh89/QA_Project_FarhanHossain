package HarvardPilgrimHealthCare_Page_Object;

import Reusable_Classes.Reusable_Annotation_Class_Html_Report;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HPH_Base extends Reusable_Annotation_Class_Html_Report {

    ExtentTest logger;
    public HPH_Base(WebDriver driver){
        PageFactory.initElements(driver,this);
    }//end of constructor class


    //Create static homepage

    public static HPHhomepage hpHhomepage(){

      HPHhomepage hpHhomepage = new HPHhomepage(driver);
        return hpHhomepage;
    }//end of homepage method



    //Create static Reference for Our Plans Page

    public static OurPlansPage ourPlansPage(){

        OurPlansPage ourPlansPage = new OurPlansPage(driver);
        return ourPlansPage;


    }//end of our plans page method

    //Create static Reference for Current Members Page

    public static Current_Members_Page current_members_page(){

        Current_Members_Page current_members_page = new Current_Members_Page(driver);
        return current_members_page;
    }//end of current members page method

    //Create static Reference for HMO Page

    public static HmoPage hmoPage(){

        HmoPage hmoPage = new HmoPage(driver);
        return hmoPage;
    }//end of hmo page method






}//end of class
