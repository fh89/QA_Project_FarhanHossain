package QA_Project_FarhanHossain;

import HarvardPilgrimHealthCare_Page_Object.HPH_Base;
import Reusable_Classes.Reusable_Annotation_Class_Html_Report;
import org.testng.annotations.Test;

public class TestCase15 extends Reusable_Annotation_Class_Html_Report {


    //Test 15
    @Test
    public void WhatsNext(){
        //Go to Website HomePage
        driver.navigate().to("https://www.harvardpilgrim.org/");

        //Click "Our Plans"
        HPH_Base.hpHhomepage().ClickOurPlans();

        //Click "Already a member?"
        HPH_Base.ourPlansPage().AlreadyMember();

        //Click "Info for current members for 2021"
        HPH_Base.current_members_page().AfterEnrollment();



    }//End Of Test 15

}//end of class
