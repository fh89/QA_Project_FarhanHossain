package QA_Project_FarhanHossain;

import HarvardPilgrimHealthCare_Page_Object.HPH_Base;
import Reusable_Classes.Reusable_Annotation_Class_Html_Report;
import org.testng.annotations.Test;

public class TestCase12 extends Reusable_Annotation_Class_Html_Report {

    //Test 12
    @Test
    public void Celebrating65(){
        //Go to Website HomePage
        driver.navigate().to("https://www.harvardpilgrim.org/");

        //Click "Our Plans"
        HPH_Base.hpHhomepage().ClickOurPlans();

        //Click "Already a member?"
        HPH_Base.ourPlansPage().AlreadyMember();

        //Click "Learn about Celebrating 65"
        HPH_Base.current_members_page().Celebrating65();

    }//End Of Test 12


}//end of class
