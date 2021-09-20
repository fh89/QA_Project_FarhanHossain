package QA_Project_FarhanHossain;

import HarvardPilgrimHealthCare_Page_Object.HPH_Base;
import Reusable_Classes.Reusable_Annotation_Class_Html_Report;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestCase1 extends Reusable_Annotation_Class_Html_Report {

    //Test 1
    @Test
    public void EmployerSponsored_Group_Plans() throws InterruptedException {
        //Go to Website HomePage
        driver.navigate().to("https://www.harvardpilgrim.org/");
        //Click "Our Plans"
        HPH_Base.hpHhomepage().ClickOurPlans();
        //Scroll and Click Current Members
        HPH_Base.ourPlansPage().EmployerPlan();
        Thread.sleep(2500);
        driver.switchTo();

    }//End Of Test 1


}//End Of Class
