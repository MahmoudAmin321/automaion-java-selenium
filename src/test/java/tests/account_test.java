package tests;


import helper.Helper;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import pages.account;

public class account_test extends AA_TestBase {
    account account_Obj;
    Helper helper_obj;

    int randomInt;

    @Test(priority = 0)
    public void fillAccountData() {
        helper_obj = new Helper();
        account_Obj = new account(driver);
        waitForTenSeconds.until(ExpectedConditions.visibilityOf(account_Obj.phone));
        randomInt = helper_obj.inputRandomInteger();
        account_Obj.fillSomeFields("" + randomInt, "testFN", "testLN", "test123@softxpert.com");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
