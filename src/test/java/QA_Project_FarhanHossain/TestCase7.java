package QA_Project_FarhanHossain;

import HarvardPilgrimHealthCare_Page_Object.HPH_Base;
import Reusable_Classes.Reusable_Annotation_Class_Html_Report;
import org.testng.annotations.Test;

public class TestCase7 extends Reusable_Annotation_Class_Html_Report {

    //Test 7
    @Test
    public void Benefits() {
        //Go to Website HomePage
        driver.navigate().to("https://www.harvardpilgrim.org/");

        //Click "Our Plans"
        HPH_Base.hpHhomepage().ClickOurPlans();

        //Click "Already a member?"
        HPH_Base.ourPlansPage().AlreadyMember();

        //Click "Info for current members for 2021"
        HPH_Base.current_members_page().Click2021Info();

        //Click "Learn more about your extra benefits"
        HPH_Base.hmoPage().Benefits_Info();

    }//End Of Test 7


}//end of class
