package QA_Project_FarhanHossain;

import HarvardPilgrimHealthCare_Page_Object.HPH_Base;
import Reusable_Classes.Reusable_Annotation_Class_Html_Report;
import org.testng.annotations.Test;

public class TestCase13 extends Reusable_Annotation_Class_Html_Report {

    //Test 13
    @Test
    public void Tips(){
        //Go to Website HomePage
        driver.navigate().to("https://www.harvardpilgrim.org/");

        //Click "Our Plans"
        HPH_Base.hpHhomepage().ClickOurPlans();

        //Click "Tips to Pick a Plan page"
        HPH_Base.ourPlansPage().TipsForPlan();


    }//End Of Test 13
}//end of class
